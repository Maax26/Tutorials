package AOOPChapter1;

public class SquareRoot {
	public static void main(String[] args) {
		System.out.println(roundedSquareRoot(1000)); // =32
	}

	private static long roundedSquareRoot(int n) {
		return Math.round(Math.sqrt(n));
	}
}
