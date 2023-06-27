package exam87;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB4Demo {
    public static Connection makeConnection() {
        String url = "jdbc:mysql://localhost:3306/madang";

        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("데이터베이스 연결중 ...");
            con = DriverManager.getConnection(url, "root", "my1234");
            System.out.println("데이터베이스 연결 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버를 찾지 못했습니다...");
        } catch (SQLException e) {
            System.out.println("데이터베이스 연결 실패");
            System.out.println(e.getMessage());
        }
        return con;
    }

    public static void main(String[] args) throws SQLException {
        Connection con = makeConnection();

        String sql = "SELECT * FROM customer;";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
        	System.out.print("custid : " + rs.getInt(1) + "\t");
            System.out.print("name : " + rs.getString(2) + "\t");
            System.out.print("address : " + rs.getString("address") + "\t");
            System.out.println("phone : " + rs.getString("phone"));
        }
    }
}