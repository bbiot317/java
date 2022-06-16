package temp2;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class CreateDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement stmt=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
			Properties props = new Properties();
			props.setProperty("user", "root");
			props.setProperty("password", "iotiot");
			props.setProperty("autoReconnect", "true");
			String url="jdbc:mysql://127.0.0.1:3306";
			
			conn = DriverManager.getConnection(url,props);
			System.out.println("커넥션 수립 성공");
			stmt= conn.createStatement();
			System.out.println("Statement 객체 생성 성공");
			
			
			String sql= "create database if not exists addrdb;";
			stmt.executeUpdate(sql);
			
			sql = "use addrdb";
			stmt.executeUpdate(sql);
			
			sql="drop table addr;";
			stmt.executeUpdate(sql);
			
			sql= "create table if not exists addr(name varchar(20), tel varchar(20), address varchar(20) );";
			stmt.executeUpdate(sql);
			
			sql="insert into addr values ('고길동','114','노원구');";
			stmt.executeUpdate(sql);
			
			sql="insert into addr values ('둘리','116','노원구');";
			stmt.executeUpdate(sql);
			
						
			ResultSet rs;
			ArrayList<Member> al = new ArrayList<>();
			sql="select * from addr;";
			rs= stmt.executeQuery(sql);
			while(rs.next()) {
				String name= rs.getString("name") ;
				String tel= rs.getString("tel") ;
				String address= rs.getString("address") ;
				Member m = new Member(name,tel,address);
				System.out.println(m);
				
				al.add(m);
				
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Member
{
	String name;
	String tel;
	String address;
	Member(String a,String f, String r){
		name=a; tel=f; address=r;
	}
	
	public String toString() {
		String a = "[member]"+name+"/"+tel+"/"+address;
		return a;
		
	}
}