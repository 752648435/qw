package jdbc;
import java.sql.*;
public class JdbcTest {
	public static void main(String[] args)throws ClassNotFoundException,SQLException 
	{
		// TODO Auto-generated method stub
         Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","1234567");	//9900585
         Statement stmt=con.createStatement();
         //stmt.executeUpdate("insert into book values (11229,'language',5);");
         //stmt.executeUpdate("delete from book where id=11229;");
         //String sql;
         //String name="gone ' with the wind";
         //int id=12556,amount=10;
        
         //sql="insert into book values("+id+",'"+name+"',"+amount+")";
         //stmt.executeUpdate(sql);
         /*ResultSet rs;
         String sql;
         sql="select id,name,amount from book;";
         rs=stmt.executeQuery(sql);
         while(rs.next())
         {
        	 int id=rs.getInt("id");
        	 String name=rs.getString("name");
        	 int amount=rs.getInt("amount");
        	 System.out.println(id+" "+name);
         }*/
        	 
         String sql="insert into book values (?,?,?);";
         //String sql="select id,name from book where id=?";
         PreparedStatement pstmt=con.prepareStatement(sql);
         //ResultSet rs;
         String name="world";
         
         pstmt.setInt(1,1588);
         pstmt.setString(2,name);
         pstmt.setInt(3,15);
         pstmt.executeUpdate();
         
         /*rs=stmt.executeQuery(sql);
         while(rs.next())
         {
        	 int id=rs.getInt("id");
        	 String name=rs.getString("name");
        	 System.out.println(id+" "+name);
         }*/
        
         con.close();
	}
}
