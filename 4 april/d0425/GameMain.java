package d0425;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		Character character = null;
		PlayGame pg = null;
		System.out.println("select");
		int x = sc.nextInt();
		
		switch (x)
		{
		case 1:
			character = new Gobook();
			break;
		case 2:
			character = new Gobook();
			break;
		case 3:
			character = new Gobook();
			break;
		default:
			System.out.println("fo");
		}
		
		if(character == null)
		{
			System.out.println("end");
			return;
		}
		else
		{ pg = new PlayGame(character); }
		
		while ( true )
		{
			pg.printMenu(sc);
			if ( pg.isExit() )
			{
				System.out.println("end");
				break;
			}
		}
	}

}

class Char2
{
	protected int hp;
	protected int level = 0;
	protected int energy;
	public boolean checkEnergy()
	{
		boolean ret = false;
		if (energy <= 0)
		{
			ret = true;
		}
		return ret;
	}
	public void prtInfo()
	{
		System.out.println("hp"+hp);
		System.out.println("energy"+energy);
		System.out.println("level"+level);
	}
}

interface Character
{

	
	public abstract void eat();
	public abstract void sleep();
	public abstract boolean play();
	public abstract boolean train();
	public abstract void levelup();
	void prtInfo();
	
}

class Gobook extends Char2 implements Character
{
	Gobook()
	{
		hp=40;
		energy=50;
		System.out.println("꼬");
		prtInfo();
	}
	public void eat()
	{
		energy += 15;
	}
	public void sleep()
	{
		energy += 10;
	}
	public boolean play()
	{
		energy -= 30;
		hp += 15;
		levelup();
		return checkEnergy();				
	}
	public boolean train()
	{
		energy -= 20;
		hp += 30;
		levelup();
		return checkEnergy();
	}
	public void levelup()
	{
		if (hp >= 50)
		{
			level++;
			hp -= 50;
		}
	}
}

class PlayGame
{
	private Character character;
	private int menu;
	private boolean exit;
	
	public PlayGame(Character character)
	{
		this.character = character;
	}
	public void printMenu(Scanner sc)
	{
		System.out.println("1. 2. 3. 4. 5. ");
		menu = sc.nextInt();
		play();
	}
	public void play()
	{
		switch(menu)
		{
		case 1:
			character.eat();
			break;
		case 2:
			character.sleep();
			break;
		case 3:
			exit = character.play();
			break;
		case 4:
			exit = character.train();
			break;
		case 5:
			exit = true;
			break;
			
		}
		character.prtInfo();
	}
	public Character getCharacter()
	{
		return character;		
	}
	public void setCharacter(Character character)
	{
		this.character = character;
	}
	public int getMenu()
	{
		return menu;
	}
	public void setMenu(int menu)
	{
		this.menu = menu;
	}
	public boolean isExit()
	{
		return exit;
	}
	public void setExit(boolean exit)
	{
		this.exit = exit;
	}
}
