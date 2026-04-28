import java.sql.*;
import java.util.Scanner;
import java.util.scanner;

public class Db {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int rno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Percentage: ");
        float per = sc.nextFloat();

        try {
            // Step 1: Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college", "root", "password");

            // Step 3: Create PreparedStatement
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO student VALUES(?, ?, ?)");
            ps.setInt(1, rno);
            ps.setString(2, name);
            ps.setFloat(3, per);
            ps.executeUpdate();
            System.out.println("Record inserted successfully!");

            // Step 4: Display all records
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");
            System.out.println("RNo\tName\t\tPercentage");
            System.out.println("--------------------------------");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" +
                        rs.getString(2) + "\t\t" + rs.getFloat(3));
            }

            // Step 5: Close
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        sc.close();
    }
}