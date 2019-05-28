package AOOPChapter1;

public class Summer {
	private int start;
	private int end;
	
	public Summer(int a, int b) {
		start = a;
		end = b;
	}
	
	public long sum() {
		long sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		
		return sum;
	}
}
