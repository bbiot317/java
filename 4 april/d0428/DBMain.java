package d0428;

public class DBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dbinterface d1 = new oracleimpl();
		Process p = new Process(d1);
		oracleimpl d2 = (oracleimpl) d1;
		
//		msimpl m = new msimpl();
//		Process p2 = new Process(m);
		Process p2 = new Process(new msimpl());
		String ab = "df";
		String bdcd = ab;
		bdcd = "asdf";
		System.out.println(ab);
		
		
		
		
	}

}
class Test
{
	
}

interface dbinterface
{
	void connect();
	void select();
	void insert();
	void update();
	void delete();
}

class oracleimpl implements dbinterface
{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("연결");
		
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
			System.out.println("");	
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
				
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
				
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
			
	}		
	
}
class msimpl implements dbinterface
{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
}

class Process
{
	private dbinterface db;
	Process(dbinterface d)
	{
		db = d;
	}
	void connect()
	{
		db.connect();
	}
	void select()
	{
		db.select();
	}
	void insert()
	{
		db.insert();
	}
	void update()
	{
		db.update();
	}
	void delete()
	{
		db.delete();
	}
	
}