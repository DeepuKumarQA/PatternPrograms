package patternProgramming;

public class Pattern1 {

	public static void main(String[] args) {
		int row, star;
		for (row = 1; row <= 5; row++) {
			for (star = 1; star <= row; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
