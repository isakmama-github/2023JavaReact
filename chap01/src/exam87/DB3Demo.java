package exam87;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB3Demo {
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
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO customer (custid, name, address, phone)");
        sql.append("VALUES (?, ?, ?, ?)");
        PreparedStatement pstmt = con.prepareStatement(sql.toString());
        pstmt.setInt(1, 32);
        pstmt.setString(2, "홍길동");
        pstmt.setString(3, "대한민국 부산시 강서구");
        pstmt.setString(4, "010-2222-2222");
        pstmt.execute();
    }
}