package test;
import java.util.TreeSet;
import java.util.Collection;

public class LambdaWay {

	public static void main(String[] args) {
        TreeSet<Integer> ld=new TreeSet<Integer>((o1,o2) ->o2-o1);
		ld.add(25);
		ld.add(165);
		ld.add(109);
		ld.add(67);
		ld.add(201);
		System.out.println("After Sorting: " +ld);

	}

}
