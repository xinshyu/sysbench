package test2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class welcome {
	   public static void main(String[] args)
	   {
			String driveName = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://perrysbstest.mysql.database.azure.com/mb4test?serverTimezone=GMT%2B8&useSSL=false";
			String user = "cloudsa@perrysbstest";
			String pass = "Yukon9000";
			try {
				Class.forName(driveName);			
			
				Connection con = DriverManager.getConnection(url, user, pass);
				
				String sql6="create table mb5 (" + 
						"   `id` varchar(100) DEFAULT NULL" + 
						" ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;" ;
				String sql1="SET character_set_client=utf8mb4;";
				String sql2="SET character_set_connection=utf8mb4;";
				String sql3="SET character_set_database=utf8mb4;";
				String sql4="SET character_set_results=utf8mb4;";
				String sql5="SET character_set_server=utf8mb4;";
				String sql7="insert into mb4 value ( \"🐈\");";
				Statement state = con.createStatement();			
				//state.execute(sql6);
				//state.execute(sql1);
				//state.execute(sql2);
				//state.execute(sql3);
				//state.execute(sql4);
				//state.execute(sql5);
				//state.execute(sql7);
				String querySql="show variables like '%char%'";
				ResultSet result = state.executeQuery(querySql);
				while(result.next()) {
					System.out.println(result.getString("Variable_name")+"：" + result.getString("Value"));
				}
				con.close();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	   }
}
