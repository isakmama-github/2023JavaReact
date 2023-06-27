package exam87;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookList {
	Connection con;

	public BookList() {
		String url = "jdbc:mysql://localhost:3306/madang";
		String userid = "root";
		String pwd = "my1234";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
			System.out.println("데이터베이스 연결 준비...");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void sqlRun() {
		String query = "SELECT * FROM Book";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println(" BOOK NO \tBOOK NAME \t\tPUBLISHER \tPRICE ");
			while (rs.next()) {
				System.out.print("\t" + rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t\t" + rs.getString(3));
				System.out.println("\t" + rs.getInt(4));
			}

			//con.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void insert() {
		Statement stmt;
		String sql = "INSERT INTO customer (custid, name, address, phone) VALUES "
				+ "(34, '임꺽정', '대한민국 서울 관악구', '010-4444-4444')";
		try {
			stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result == 1)
				System.out.println("레코드 추가 성공, 34");
			else
				System.out.println("레코드 추가 실패");

//			con.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void insertOne(Customer customer) {
		int custid = customer.getCustid();
		String name = customer.getName();
		String address = customer.getAddress();
		String phone = customer.getPhone();

		String sql = "INSERT INTO customer (custid, name, address, phone)"
		                        + " VALUES (?, ?, ?, ?)";
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, custid);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			pstmt.setString(4, phone);
			
			if (pstmt.executeUpdate()==1)
	            System.out.println("레코드 추가 성공, " + custid );
	        else
	            System.out.println("레코드 추가 실패");
			
//			con.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		BookList so = new BookList();
		so.sqlRun();
		so.insert();
		Customer book = new Customer(33, "홍길동", "부산시 강서구", "010-1111-2222");
		so.insertOne(book);
	}

}
