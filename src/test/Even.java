package test;
import java.util.ArrayList;
import java.util.Collections;

public class Even {

	public static void main(String[] args) {
		
		int[] myArray= {1,2,3,4,5,6,7,8,9,10};
		ArrayList<Integer> evenList=new ArrayList<Integer>();
		for(int i=0;i<myArray.length;i++) {
			if(myArray[i]%2==0) {
				evenList.add(myArray[i]);
			}
		}
	
			Collections.sort(evenList);
			for(int even :evenList)
				System.out.println("Even Number :" +even);
			}
		}



