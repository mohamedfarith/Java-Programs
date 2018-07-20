import java.util.Scanner;

public class PyramidPattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//getting user input 
		int n = scan.nextInt();
		
		//loops executing the pyramid structure
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int z = 0; z <= i; z++) {
				System.out.print("* ");
			}
			System.out.println("");
		}scan.close();
	}

}
