import java.io.*;
import java.util.*;
public class NameReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbReader = new Scanner (System.in);
		System.out.print ("Please insert name here ");
		String name = kbReader.nextLine();
		int a;
		String reverse = "";
		for (a = name.length(); a>0; a--)
		{
			reverse = name.substring(a-1,a);
			System.out.print(reverse.toLowerCase());
		}
	}
}
