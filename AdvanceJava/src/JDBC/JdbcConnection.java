package JDBC;
import java.sql.*;

public class JdbcConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","sandy123");
			Statement st = c.createStatement();
			st.executeUpdate("use sandeep");
			ResultSet res = st.executeQuery("select * from shop");
			while(res.next()) {
				System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3));
			}
			c.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
