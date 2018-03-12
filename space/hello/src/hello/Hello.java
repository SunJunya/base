package hello;
import java.sql.*;
public class Hello {

	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/suliya", "sjy", "root123");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("insert into course values('09','Ñ¡ÐÞ¿Î')");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t");
			}
		}
		catch (Exception e)
		{
			
		}
	}

}
