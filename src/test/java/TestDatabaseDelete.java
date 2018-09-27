import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class TestDatabaseDelete 
{
	@Test
	public void dbConncetionUpdate() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anand_jdbc","root","mysql");
		Statement st=con.createStatement();
		st.executeUpdate("insert into seleniumUser values ('rani','rani@gmail.com')");
		st.executeUpdate("delete from seleniumUser where name='rani'");
		
		ResultSet result1= st.executeQuery("select * from seleniumUser");
		while(result1.next())
		{
			System.out.println(result1.getString("name"));
			System.out.println(result1.getString("email"));
		}
		//con.close();
		
	}
}
