package temp2;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class AddrDBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Dao 
{
	boolean insert(Member m);
	ArrayList<Member> selectAll();
	Member select(String name);
	boolean update(Member m);
	boolean delete (String name);
	void close();
	
}

class Member
{
	String name;
	String tel;
	String address;
	
}

class DBConnect 
{	Connection conn=null;
	private static DBConnect db = new DBConnect();
	Statement stmt;
	private DBConnect() 
	{ // 싱글톤
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("드라이버 성공");
		
		
		Properties props = new Properties();
		props.setProperty("user", "root");
		props.setProperty("password", "iotiot");
		props.setProperty("useSSL","false");
		
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306",props);
		System.out.println("커넥션 수립 성공");
		
		Statement stmt= null;
		stmt= conn.createStatement();
		System.out.println("Statement 객체 생성");
		
		String sql = "create database if not exists memberdb;";
		stmt.executeUpdate(sql);
		
		sql = "create table if not exists member(name varchar(20),tel varchar(20),address varchar(20));";
		stmt.executeUpdate(sql);
		
//		sql= "insert into member values ("
		
		
		ResultSet rs = null;
		
		}catch(SQLException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Connection getConn() {
		return conn;
	}
	public Statement getStmt() {
		return stmt;
	}
	
	public static DBConnect getInstance() 
	{
		return db;
	}
	
}

class MySqlDao implements Dao
{
	
	
	MySqlDao(){
//		DBConnect = DBConnect.getInstance();
	}
	@Override
	public boolean insert(Member m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Member> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member select(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Member m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	
}

class OracleDao implements Dao{

	@Override
	public boolean insert(Member m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Member> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member select(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Member m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	
}

interface Service
{
	
}

class ServiceImplement implements Service
{
	
}