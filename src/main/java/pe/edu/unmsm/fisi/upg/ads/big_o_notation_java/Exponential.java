package pe.edu.unmsm.fisi.upg.ads.big_o_notation_java;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

//Complexity: O(2^N)
public class Exponential {

	public static void main(String[] args) {
		int N = 80;
		Exponential exponential = new Exponential();
		Stopwatch stopwatch = Stopwatch.createStarted();		
		try {
			for (int i = 0; i <= N; i++) {
				long fibonacci = exponential.fibonacciLineal(i);				
				System.out.println((i+1) + " => " + fibonacci);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(String.format("Time elapsed: %d seconds", stopwatch.elapsed(TimeUnit.SECONDS)) + "\n");
	}
	
	public long fibonacci(int n) throws Exception {
        if (n < 0) {
            throw new Exception("N can not be less than zero");
        }
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
		
	    
	
	public long fibonacciLineal(int n) throws Exception {	
		if(n<0) 		
			throw new Exception("N cannot be less than zero");
		
		if(n<=2)
			return 1;
		
		long fibonacci = 0;
		long prev = 1;
		long pen = 0;
		for (int i = 0; i <= n; i++) {
			pen = fibonacci;
			fibonacci = prev + fibonacci;
			prev = pen;
		}
		
		return fibonacci;
		
	}
	
	
	
	
	
	
	
    
}
