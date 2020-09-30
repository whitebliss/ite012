package Controller;

import java.sql.*;
import Model.Student;
import Model.Teacher;

public class AccountController {

	private Connection con;
	private Statement stm;
	private PreparedStatement pstm;
	
	public AccountController(Connection con)
	{
		try
		{
			this.con = con;
			stm = con.createStatement();
		}
		catch(Exception ex)
		{
			System.out.println(ex + "\nCannot establish connection.");
		}
	}
	
	public boolean Register(Student s)
	{
		try
        {
             //Save to database
			String query = "INSERT INTO account(type_id, email, password, firstname, lastname, c_num, s_num, program) VALUES (2, LOWER(?), ?, ?, ?, ?, ?, ?)";
			pstm = con.prepareStatement(query);
			pstm.setString(1, s.getEmail());
			pstm.setString(2, s.getPassword());
			pstm.setString(3, s.getFirstName());
			pstm.setString(4, s.getLastName());
			pstm.setLong(5, s.getContactNo());
			pstm.setLong(6, s.getStudentNo());
			pstm.setString(7, s.getProgram());
			pstm.executeUpdate();
			
			System.out.println("Student has been added!");
			return false;
        }
        catch(Exception ex)
        {
            System.out.println(ex + "\nSomething went wrong.");
        }
            return true;
	}
	
	
	public boolean Register(Teacher t)
	{
		try
        {
             //Save to database
			String query = "INSERT INTO account(type_id, email, password, firstname, lastname, c_num, subject, specialization) VALUES (1, LOWER(?), ?, ?, ?, ?, ?, ?)";
			pstm = con.prepareStatement(query);
			pstm.setString(1, t.getEmail());
			pstm.setString(2, t.getPassword());
			pstm.setString(3, t.getFirstName());
			pstm.setString(4, t.getLastName());
			pstm.setLong(5, t.getContactNo());
			pstm.setString(6, t.getSubject());
			pstm.setString(7, t.getSpecialization());
			pstm.executeUpdate();
			
			System.out.println("Teacher has been added!");
			return false;
        }
        catch(Exception ex)
        {
            System.out.println(ex + "\nSomething went wrong.");
        }
            return true;
	}
	
	public ResultSet Login(String email, String password)
	{
		try {
			String query = "SELECT * FROM account WHERE LOWER(email) = LOWER(?) AND password = ?";
			pstm = con.prepareStatement(query);
			pstm.setString(1, email);
			pstm.setString(2, password);
			ResultSet rs = pstm.executeQuery();
			if(rs.next())
			{
				return rs;
			}
			
		}
		catch(Exception ex)
		{
			System.out.println(ex + "\nSomething went wrong.");
		}
		
		return null;
	}
	
}
