package test;

public class StartsWithOne {

	public static void checkprefix(int A,int B) {
		String a1=String.valueOf(A);
		String a2=String.valueOf(B);
		boolean result;
		result=a1.startsWith(a2);
		if(result) {
			System.out.println("Start with one");
			
		}
		else {
			System.out.println("No");
		}

	}
	public static void main(String[] args)
	{
	int A=1673	,B=1;
	checkprefix(A,B);
	}

}
