import java.util.Scanner;

public class AnagramUsingASCII {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count =0;
		
		String s = scan.nextLine();
		String s1= scan.nextLine();
		int[] c = new int[s.length()];
		int[] c1 = new int[s1.length()];
		s.toLowerCase();
		s1.toLowerCase();
		char[] ch = s.toCharArray();
		char[] ch1 = s1.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			c[i]=(int)ch[i]-97;
			count = count+c[i];
			c[i]=(int)ch[i]-97;
			count = count-c[i];
		}
		if(count==0) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}

	}
}
