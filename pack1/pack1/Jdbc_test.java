package pack1;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;


public class Jdbc_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://127.0.0.1:3306/jdbc_maven";
		String user="root";
		String password="admin@1234";
		
		
			try(Connection con=DriverManager.getConnection(url,user,password))
			{
				System.out.println("Connect to DB");
				String insertsql="INSERT INTO students(id,name,age) VALUES(?,?,?)";
				try(PreparedStatement pstmt=con.prepareStatement(insertsql))
				{
					
					pstmt.setInt(1, 101);
					pstmt.setString(2, "mounika");
					pstmt.setInt(3, 21);
					int rows=pstmt.executeUpdate();
					System.out.println("Inserted:"+rows);
				}
				
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			

	}
}
