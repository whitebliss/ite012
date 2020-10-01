package Controller;
import java.sql.*;
public class ConnectionController {
	private Connection con;
	
	public Connection getConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anna", "root", "");
			return con;
		}
		catch(Exception ex)
		{
			System.out.println(ex + "\nCannot establish connection.");
			System.exit(0);
			return null;
		}
	}
	
}
