package AOOPChapter1;

public class SummerTester {
	public static void main(String[] args) {
		Summer oneToHundred = new Summer(1, 100);
		Summer hundredToThousand = new Summer(100, 1000);
		
		System.out.println(oneToHundred.sum());
		System.out.println(hundredToThousand.sum());
	}
}
