package pepCoding;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		// write ur code here
		int i = 1;
		while (i <= n) {
			int j  = 1;
			while(j<= n -i) {
				System.out.print("\t");
				j++;
			}
			
		
		
			while (j <= i) {
				System.out.print("*\t");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}