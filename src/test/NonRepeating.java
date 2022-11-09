package test;

public class NonRepeating {
	static int firstNonRepeating(int arr[],int n)
	{
		for(int i=0;i<n;i++)  {
			int j;
			for(j=0;j<n;j++)
				if(i !=j &&arr[i]==arr[j])
					break;
			if(j==n)
				return arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {9,3,17,45,9,70};
		int n=arr.length;
		System.out.println(firstNonRepeating(arr,n));
		

	}

}
