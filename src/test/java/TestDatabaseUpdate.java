import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class TestDatabaseUpdate 
{
	@Test
	public void dbConncetionUpdate() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anand_jdbc","root","mysql");
		Statement st=con.createStatement();
		st.executeUpdate("UPDATE seleniumUser SET email = 'mohan2@gmail.com' WHERE name = 'mohan'");
		ResultSet result= st.executeQuery("select * from seleniumUser");
		while(result.next())
		{
			System.out.println(result.getString("name"));
			System.out.println(result.getString("email"));
		}
		con.close();
		
	}
}
