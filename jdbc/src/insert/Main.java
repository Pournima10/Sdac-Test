package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
public static void main(String[] args) throws Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/d1","root","");
	PreparedStatement preparedstatement=connection.prepareStatement("insert into info values (?,?)");
	 
	preparedstatement.setInt(1, 9);
	preparedstatement.setString(2, "pruthviraj");
	preparedstatement.executeUpdate();
	System.out.println("inserted..");
	
	connection.close();
	
	
	
	
}
}
