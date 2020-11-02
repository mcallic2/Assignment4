import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Part1Assignment4 {

	public static void main(String[] args) {
		
		HashSet<String> hashSet1 = new HashSet<String>();
		hashSet1.add("George");
		hashSet1.add("Jim");
		hashSet1.add("John");
		hashSet1.add("Blake");
		hashSet1.add("Kevin");
		hashSet1.add("Michael");
		
		HashSet<String> hashSet1Clone = (HashSet<String>)hashSet1.clone();
		HashSet<String> hashSetCloneAgain = (HashSet<String>)hashSet1.clone();
		
		HashSet<String> hashSet2 = new HashSet<String>();
		hashSet2.add("George");
		hashSet2.add("Katie");
		hashSet2.add("Kevin");
		hashSet2.add("Michelle");
		hashSet2.add("Ryan");
		
		//Union
		hashSet1.addAll(hashSet2);
		System.out.println("The union is " + hashSet1 + "\n");
		
		//Difference 
		hashSet1Clone.removeAll(hashSet2);
		System.out.println("The difference is " + hashSet1Clone + "\n");
		
		//Intersection
		hashSetCloneAgain.retainAll(hashSet2);
		System.out.println("The intersection is " + hashSetCloneAgain + "\n");
		

	}

}
