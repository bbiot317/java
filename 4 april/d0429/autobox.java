package d0429;

public class autobox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] arr = new Object[5];
		int i;
		arr[0]=15;
		arr[1] = 3.44f;
		arr[2] = 'x';
		arr[3] = "adf";
		arr[4] = true;
		char[] arr2 = {'a','p','p','l'};
		int b=5;
		
		String str = String.valueOf(1.232f);
		System.out.println(str);
		
		String str3 = new String(arr2);
		System.out.println(str3);
		
		for ( i =0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
