package test;
import java.util.ArrayList;

public class Duplicate {

	public static void main(String[] args) {
	   int[] myArray= {12,3,5,23,7,23,54,3};
	   System.out.println("Duplicate element in given arrayList:");
	   for(int i=0;i<myArray.length;i++) {
		   for(int j=i+1;j<myArray.length;j++) {
			   if(myArray[i]==myArray[j])
				   System.out.println(myArray[j]);
		   }
	   }

	}

}
