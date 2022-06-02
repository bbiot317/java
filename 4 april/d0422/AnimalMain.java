
public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Action a = new Action();
		Animal d = new Dog();
		Dog d2 = new Dog();
		a.action(d);
		System.out.println("------");
		Animal c = new Cat();
		a.action(c);
		System.out.println("------");
		
	}

}

class Animal
{
	protected String name="동물";
	
	public void cry()
	{
		System.out.println(name+"의 소리");
	}
	void action(Dog animal)
	{
		animal.cry();
		animal.run();
	}
	
}

class Dog extends Animal
{
	String name = "개";
	public void cry()
	{
		super.cry();
		System.out.println("멍멍");
	}
	public void run()
	{
		System.out.println(name+"가 뛴다");
	}
}
class Cat extends Animal
{
	String name = "양";
	public void cry()
	{
		super.cry();
		System.out.println("야옹");
	}
	public void grooming()
	{
		System.out.println("그룸");
	}
	
}

class Action
{
	void action(Animal animal)
	{
		animal.cry();
		if(animal instanceof Dog)
		{
			((Dog) animal).run();
		}
		else if (animal instanceof Cat)
		{
			((Cat) animal).grooming();
		}
	}
}

