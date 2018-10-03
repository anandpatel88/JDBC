import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class AllInOne 
{
	@Test
	public void e2e() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anand_jdbc","root","mysql");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from seleniumUser");
		while(rs.next())
		{
			System.out.println(rs.getRow());
		}
		
	}

}
