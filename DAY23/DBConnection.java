import java.sql.*;

public class DBConnection {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "root"
            );

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT 1");

            if (rs.next()) {
                System.out.println("Connection + Query Successful");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}