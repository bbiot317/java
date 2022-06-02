package d0428;

public class RepairableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Unit app = new Unit();
		SCV scv = new SCV();
		Tank tank = new Tank();
		tank.hp = 3;
		Tank tank2 = tank;
		Tank tank3 = new Tank();

		tank2 = tank3;
		tank2.hp=14;
		System.out.println(tank3.hp);
		scv.repair(tank);
		
		String h3 = "hello"; 
		String h4 = "hello";
		h3 = h4;
		h4 = "sdf";
		System.out.println(h3);

		
	}

}

interface Repairable
{
	//수리가능.
}
class Unit
{
	int hp;
	final int MaxHp;
	Unit(int hp)
	{
		MaxHp = hp;
	}
}

class Groundunit extends Unit
{
	Groundunit(int hp)
	{
		super(hp);
	}
}
class AirUnit extends Unit
{
	AirUnit(int hp)
	{
		super(hp);
	}
}

class Tank extends Groundunit implements Repairable
{
	Tank()
	{
		super(150);
		hp = MaxHp;
	}
}
class Marine extends Groundunit
{
	Marine()
	{
		super(40);
		hp = MaxHp;
	}
}
class SCV extends Groundunit implements Repairable
{
	SCV()
	{
		super(60);
		hp = MaxHp;
	}
	void repair(Repairable r)
	{
		System.out.println("repa");
		if (r instanceof Unit)
		{
			Unit u = (Unit) r;
			
			while ( u.hp != u.MaxHp)
			{
				u.hp++;
//				System.out.println();
			}
		}
	}
}
