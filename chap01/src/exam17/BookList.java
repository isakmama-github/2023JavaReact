package exam17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BookList {

	Connection conn;
	
	public BookList() throws Exception {
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/madang";
		String userid = "root";
		String pwd = "my1234";
		
		Class.forName(driver);
		System.out.println("드라이버 로드 성공");
		System.out.println("드라이버 연결 준비...");
		conn = DriverManager.getConnection(url, userid, pwd);
		System.out.println("드라이버 연결 성공...");
	}
	
	private void sqlRun() throws Exception {
		String sql = "select bookid, bookname, publisher, price from book";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.print("\t"+ rs.getInt(1));
			System.out.print("\t"+ rs.getString(2));
			System.out.print("\t"+ rs.getString(3));
			System.out.print("\t"+ rs.getInt(4));
			System.out.println();
			
		}
		rs.close();
		stmt.close();
//		conn.close();
	}
	
	private void insert() {
		Statement stmt;
		String sql = "insert into book (bookid, bookname, publisher, price)"
				+ " values (30, '임꺽정 전기', '관악 출판사', 25000)";
		try {
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result == 1) {
				System.out.println("레코드 추가 성공, 30");
			} else {
				System.out.println("레코드 추가 실패");
			}
			
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void delete(int num) {
		PreparedStatement pstmt;
		String sql = "delete from book where bookid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			int result = pstmt.executeUpdate(sql);
			
			if (result == 1) {
				System.out.println("레코드 추가 성공, 30");
			} else {
				System.out.println("레코드 추가 실패");
			}
			
			pstmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void insertBook(Book book) {
		int bookid = book.getBookid();
		String bookname = book.getBookname();
		String publisher = book.getPublisher();
		int price = book.getPrice();
		
		String sql = "insert into book (bookid, bookname, publisher, price)"
				+ " values (?,?,?,?)";
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bookid);
			pstmt.setString(2, bookname);
			pstmt.setString(3, publisher);
			pstmt.setInt(4, price);
			
			int result = pstmt.executeUpdate();
			if(result == 1) {
				System.out.println("레코드 추가 성공, " + bookid);
			} else {
				System.out.println("레코드 추가 실패");
			}
			pstmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
	}
	
	public static void main(String[] args) throws Exception {
		BookList bl = new BookList();
		bl.sqlRun();
//		bl.insert();
		
		Book book = new Book(32, "데이터베이스", "한정교출판사", 30000);
		bl.insertBook(book);

	}

}
