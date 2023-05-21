package patternProgramming;

public class Pattern4 {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(i); // will print in the same line 
			}
			System.out.println();// for next line
		}

	}
}
