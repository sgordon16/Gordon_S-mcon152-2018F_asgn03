package mcon152Asgn03;

public class IntArrayOperations {
	
	public static int Sum(int[] x) {
		 
		int sum = 0;
		for(int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		return sum;
	}
	
	public static int Max(int[] x) {
		
		int max = x[0];
		for(int i = 0; i < x.length; i++) {
			if(x[i] > max)
				max = x[i];
		}
		return max;
	}
	
	public static int Min(int[] x) {
		
		int min = x[0];
		for(int i = 0; i < x.length; i++) {
			if(x[i] < min)
				min = x[i];
		}
		return min;
	}
	
	public static int Range(int[] x) {
		
		return Math.abs(Max(x) - Min(x) + 1);
	}

}
