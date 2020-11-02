import java.util.*;
import java.io.*;


public class Part2Assignment4 {
	public static void main(String[] args) {
		
		if(args.length==1) {
			String fileName = args[0];
			TreeSet<String> set = new TreeSet<>();
			File file = new File(fileName);
			
			try {
				Scanner scan = new Scanner(file);
				while (scan.hasNext()) {
					set.add(scan.next());
				}
				System.out.println(set);
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}			
		}

		else {
			System.out.println("What is the name of the file: \n");
		}
	}
}