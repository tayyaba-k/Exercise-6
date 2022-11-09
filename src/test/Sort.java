package test;
import java.util.*;
import java.util.ArrayList;
//import java.util.collections;

public class Sort {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(55);
		list.add(105);
		list.add(40);
		list.add(201);
		list.add(75);
        System.out.println("ArrayList Before Sorting:");
        for(int marks:list)
        {
        	System.out.println(marks);
        }
        Collections.sort(list);
        System.out.println("ArrayList After Soting:");
        for(int marks:list)
        {
        	System.out.println(marks);
        }
	}

}
