package math;

public class Fatorial {
	
	public int run(int n) {
		int r=1;
		for (int t=n; t>=1; t--) {
			r*=t;
		}
		
		return r;
	}

}
