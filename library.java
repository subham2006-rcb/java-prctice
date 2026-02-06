import java.sql.*;
public class library{

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/subham";
        String user = "root";
        String password = "subham@9009";

        Connection con = null;
        PreparedStatement ps = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, user, password);

            con.setAutoCommit(false);
            String sql = "INSERT INTO book VALUES (?, ?, ?, ?, ?)";
            ps = con.prepareStatement(sql);

            ps.setInt(1, 104);
            ps.setString(2, "java programming");
            ps.setString(3, "harisankar mohanty");
            ps.setString(4, "programming");
            ps.setString(5, "2026-02-05");
            ps.addBatch();
        
            int[] result = ps.executeBatch();

            con.commit();

            System.out.println("Batch executed successfully!");
            System.out.println("Number of records inserted: " + result.length);

        } catch (Exception e) {

            try {
                con.rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            e.printStackTrace();
        }

        finally {

            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
