package math;

public class Fibonacci {

	public int run(int n) {
		
		if (n <= 0) {
			return -1;
		}
		
		int atual=0, anterior=1, anteterior=0;
		for (int i=1; i<=n; i++) {
			anteterior = anterior;
			anterior = atual;
			atual = anterior+anteterior;
		}
		
		return atual;
	}
	
}
