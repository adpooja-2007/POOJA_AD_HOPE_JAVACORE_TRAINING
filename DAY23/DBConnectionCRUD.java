import java.sql.*;
import java.util.Scanner;

public class DBConnectionCRUD {

    // ─── DATABASE CONFIG ──────────────────────────────────────────
    static final String URL = "jdbc:mysql://localhost:3306/testdb";
    static final String USER = "root";
    static final String PASSWORD = "root";

    // ─── GET CONNECTION ───────────────────────────────────────────
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // ─── CREATE ───────────────────────────────────────────────────
    public static void insertStudent(String name, int age, String email) {
        String sql = "INSERT INTO students (name, age, email) VALUES (?, ?, ?)";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, email);

            int rows = ps.executeUpdate(); // ✅ important
            System.out.println(rows > 0 ? "INSERT successful" : "INSERT failed");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ─── READ ALL ─────────────────────────────────────────────────
    public static void getAllStudents() {
        String sql = "SELECT * FROM students";

        try (Connection con = getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\nID   Name           Age   Email");
            System.out.println("-------------------------------------------");

            while (rs.next()) {
                System.out.printf("%-5d %-15s %-5d %-25s%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("email"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ─── READ BY ID ───────────────────────────────────────────────
    public static void getStudentById(int id) {
        String sql = "SELECT * FROM students WHERE id = ?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("\nStudent Found:");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Email: " + rs.getString("email"));
            } else {
                System.out.println("No student found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ─── UPDATE ───────────────────────────────────────────────────
    public static void updateStudent(int id, String name, int age, String email) {
        String sql = "UPDATE students SET name=?, age=?, email=? WHERE id=?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, email);
            ps.setInt(4, id);

            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "UPDATE successful" : "No record found");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ─── DELETE ───────────────────────────────────────────────────
    public static void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id=?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "DELETE successful" : "No record found");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ─── MAIN MENU ────────────────────────────────────────────────
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Connection test
        try (Connection con = getConnection()) {
            System.out.println("Connected successfully!\n");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
            return;
        }

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add");
            System.out.println("2. View All");
            System.out.println("3. View by ID");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt(); sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    insertStudent(name, age, email);
                    break;

                case 2:
                    getAllStudents();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    getStudentById(sc.nextInt());
                    break;

                case 4:
                    System.out.print("ID: ");
                    int uid = sc.nextInt(); sc.nextLine();
                    System.out.print("New Name: ");
                    String uname = sc.nextLine();
                    System.out.print("New Age: ");
                    int uage = sc.nextInt(); sc.nextLine();
                    System.out.print("New Email: ");
                    String uemail = sc.nextLine();
                    updateStudent(uid, uname, uage, uemail);
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    deleteStudent(sc.nextInt());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}