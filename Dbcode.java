package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Dbcode {
		// TODO Auto-generated method stub
		       public Connection con;
				 String dburl="jdbc:mysql://localhost:3306/mydb";
				 String dbuser="root";
				String dbpass="accord";
				public Dbcode() {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					 con=DriverManager.getConnection(dburl, dbuser, dbpass);    
}
				catch(ClassNotFoundException|SQLException e) {
					e.printStackTrace();
				}
				
			}	

	}

