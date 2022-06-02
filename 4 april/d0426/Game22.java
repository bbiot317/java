package d0426;

import java.util.Scanner;

public class Game22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PlayGame pg = new PlayGame(new Picachu());
		//PlayGame pg = new PlayGame(new Gobook());
		//PlayGame pg = new PlayGame(new Lee());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		System.out.println("================캐릭터성장프로그램===");
		System.out.println("================================");
		
		System.out.println("캐릭터를 선택하세요. 1.피카츄 2.꼬북이 3.이상해씨");
		int a = sc.nextInt();
		Character character = null;
		switch (a)
		{
		case 1:
			character = new Picachu();
			break;
		case 2:
			character = new Gobook();
			break;
		case 3:
			
			break;
		default:
			//System.out.println("캐릭터를 올바르게(1~3) 선택하세요");
			System.out.println("잘못 선택하셨습니다.");
				
		}
		
		PlayGame pg;
		
		if ( character == null)
		{
			System.out.println("게임을 종료합니다.");
			return;
		}
		else		
		{		
			pg = new PlayGame(character);
		}
		
		while (true)
		{
			pg.printMenu(sc);
			pg.play();
			if ( pg.isExit() == true)
			{
				break;
			}
		}
		System.out.println("프로그램이 종료됩니다.");
	}

}

class PlayGame
{
	private Character character;
	
	private int menu;
	private boolean exit;
	
	public boolean isExit() {
		return exit;
	}
	public void setExit(boolean exit) {
		this.exit = exit;
	}
	PlayGame(Character character)
	{
		this.character = character;
		exit = false;
	}
	void printMenu(Scanner sc)
	{
		System.out.println("1. 밥먹이기 2.잠재우기 3. 놀아주기 4. 운동시키기 5. 종료");
		menu = sc.nextInt();
	}
	
	void play()
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
			character.train();			
			break;
		case 5:
			exit = true;
			break;
		}
		character.printInfo();
		
	}
}
//abstract class Character
class Characte
{
	protected int hp;
	protected int energy;
	protected int level;
	
	public boolean checkEnergy()
	{
		if ( energy <= 0 )//에너지 
		{
			return true;
		}
		else
		{
			return false;
		}		
	}

	public void printInfo2()
	{
		System.out.println("현재 캐릭터의 정보");
		System.out.println("hp="+hp+"/"+"energy="+energy+"/ level="+level);		
	}
}
interface Character
{
	
	public abstract void eat();
	public abstract void sleep();
	public abstract boolean train();
	public abstract boolean play();
	public abstract void levelUp();
	public abstract void printInfo();
	
		
}

class Picachu extends Characte implements Character
{
	public void printInfo()
	{
		System.out.println("현재 캐릭터의 정보");
		System.out.println("hp="+hp+"/"+"energy="+energy+"/ level="+level);		
	}
	Picachu()
	{
		hp=30;
		energy=50;
		System.out.println("피카추 생성됨");
		printInfo();
	}
	public void eat()
	{
		energy= energy+10;		
	}
	public void sleep()
	{
		energy = energy+5;
	}
	public boolean train()
	{
		energy = energy-15;
		hp=hp+20;
		levelUp();
		return checkEnergy();
	}
	public boolean play()
	{
		energy = energy-20;
		hp=hp+5;
		levelUp();
		return checkEnergy();
		
	}
	public void levelUp()
	{
		if ( hp >=40)
		{
			level++;
			hp=hp-40;
		}
	}
}

class Lee extends Characte implements Character
{
	public void printInfo()
	{
		System.out.println("현재 캐릭터의 정보");
		System.out.println("hp="+hp+"/"+"energy="+energy+"/ level="+level);		
	}
	Lee()
	{
		hp=20;
		energy=30;
		System.out.println("이상해씨 생성됨");
		printInfo();
	}
	public void eat()
	{
		energy= energy+5;		
	}
	public void sleep()
	{
		energy = energy+20;
	}
	public boolean train()
	{
		energy = energy-10;
		hp=hp+15;
		levelUp();
		return checkEnergy();
	}
	public boolean play()
	{
		energy = energy-10;
		hp=hp+20;
		levelUp();
		return checkEnergy();
		
	}
	public void levelUp()
	{
		if ( hp >=35)
		{
			level++;
			hp=hp-35;
		}
	}
}
class Gobook extends Characte implements  Character
{
	public void printInfo()
	{
		System.out.println("현재 캐릭터의 정보");
		System.out.println("hp="+hp+"/"+"energy="+energy+"/ level="+level);		
	}
	Gobook()
	{
		hp=40;
		energy=50;
		System.out.println("꼬북이가 생성됨");
		printInfo();
	}
	public void eat()
	{
		energy= energy+15;		
	}
	public void sleep()
	{
		energy = energy+10;
	}
	public boolean play()
	{
		energy = energy-30;
		hp=hp+15;
		levelUp();
		return checkEnergy();
	}
	public boolean train()
	{
		energy = energy-20;
		hp=hp+30;
		levelUp();
		return checkEnergy();
		
	}
	public void levelUp()
	{
		if ( hp >=50)
		{
			level++;
			hp=hp-50;
		}
	}
}