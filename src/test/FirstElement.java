package test;
import java.util.ArrayList;

public class FirstElement {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(9);
		list.add(3);
		list.add(15);
		list.add(60);
		list.add(91);
		System.out.println("ArrayList:" +list);
		int first=list.get(0);
		System.out.println("\nFirst Element:" +first);

	}

}
