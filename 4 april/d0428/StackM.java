package d0428;

public class StackM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Impstack stack = new Impstack();
		stack.push(5);
		stack.push(80);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		Stack stack2 = new Impstack(10);
		for(int i=0; i<10; i++) {
			stack2.push(i);
		}
		for(int i : ((Impstack)stack2).stk) {
			System.out.println(i);
		}
		for(int i=0; i<11; i++) {
			System.out.println(stack2.pop()); 
		}
	}

}

interface Stack
{
	int DEFAULT = 100;
	void push(int value);
	int pop();
}

class Impstack implements Stack
{
	int[] stk;
	int top;
	Impstack()
	{
		stk = new int[DEFAULT];
		top = 0;
	}
	Impstack(int size)
	{
		stk = new int[size];
		top = 0;
	}
	public void push(int value)
	{
		if ( top == stk.length)
		{
			System.out.println("stac k full");
		}
		else
		{
			stk[top++] = value;
		}
	}
	public int pop()
	{
		int ret = 0;
		if ( top <= 0 )
		{
			System.out.println("stack empty");
			ret = -1;
		}
		else
		{
			ret = stk[--top];
		}
		return ret;
	}
}