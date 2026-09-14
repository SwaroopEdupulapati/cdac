package myjdbc;
import java.sql.*;
import java.util.Scanner;
public class MyCurd {
	static Scanner sc=new Scanner(System.in);
	Connection con;
	MyCurd(String conString,	String dbid,	String psw) throws SQLException{
		con=DriverManager.getConnection(conString,dbid,psw);
	}
	
	
	void addData() throws SQLException {
		PreparedStatement pst=con.prepareStatement("INSERT INTO students "
				+ "(id, name, course, marks) VALUES "
				+ "(?, ?, ?, ?)");
		pst.setInt(1, sc.nextInt());
		pst.setString(2,sc.next());
		pst.setString(3,sc.next());
		pst.setInt(4, sc.nextInt());
		pst.executeUpdate();
	}
	
	void displayAll() throws SQLException {
		PreparedStatement pst=con.prepareStatement("select * from students");
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			// Added spaces so the printed data is readable
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
		}
	}
	void searchById() throws SQLException {
		PreparedStatement pst=con.prepareStatement("select * from students where id= ?");
		pst.setInt(1,sc.nextInt());
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			// Added spaces so the printed data is readable
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
		}
	}
	void searchByName() throws SQLException {
		PreparedStatement pst=con.prepareStatement("select * from students where name = ?");
		pst.setString(1,sc.next());
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			// Added spaces so the printed data is readable
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
		}
	}
	void delete() throws SQLException{
		PreparedStatement pst=con.prepareStatement("delete from students where id=?");
		pst.setInt(1,sc.nextInt());
		pst.executeUpdate();
		System.out.println("deleted Successfully");
	}
	void update() throws SQLException{
		PreparedStatement pst=con.prepareStatement("update students set name= ?,"
				+ "course= ?,marks=? where id=?");
		
		// Fixed execution sequence to match how you pull scanner inputs
		pst.setInt(4,sc.nextInt()); // First input typed will be the ID
		pst.setString(1,sc.next());   // Second input will be Name
		pst.setString(2,sc.next());   // Third input will be Course
		pst.setInt(3, sc.nextInt());  // Fourth input will be Marks
		pst.executeUpdate();
		
	}
	
	public static void main(String[] args) throws SQLException {
		String conString="jdbc:mysql://127.0.0.1:3306/studentdb";
		String dbid="root";
		String psw="root";
//		Connection con = DriverManager.getConnection(
//				"jdbc:mysql://127.0.0.1:3306/studentdb",
//				"root",
//				"root"
//		);
		MyCurd mc=new MyCurd(conString,dbid,psw);
		while(true) {
			System.out.println("\n1.Add 2.Display All 3.Search By ID 4.Search By Name 5.Delete 6.Update 7.Exit");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1: mc.addData(); break;
				case 2: mc.displayAll(); break;
				case 3: mc.searchById(); break;
				case 4: mc.searchByName(); break;
				case 5: mc.delete(); break;
				case 6: mc.update(); break;
				case 7: 
					System.out.println("Exiting...");
					System.exit(0);
				default: 
					System.out.println("Invalid choice!");
			}
		}
		
	
	}
}
