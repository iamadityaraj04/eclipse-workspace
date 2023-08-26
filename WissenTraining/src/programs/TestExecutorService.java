package programs;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestExecutorService {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es=Executors.newFixedThreadPool(3);
		
		Future f1 =es.submit(new SumES(10));
		Future f2 =es.submit(new SquareES(10));
		
		System.out.println("Sum result: "+f1.get());
		System.out.println("Square result: "+f2.get());
	}
}

class SumES implements Callable <Integer>{
	int value;
	
	SumES(int value){this.value=value;}
	
	public Integer call() {
		int result=0;
		for(int i=1;i<=value; i++) {
			result=result+i;
		}
		return result;
	}
}

class SquareES implements Callable <Integer>{
	int value;
	
	SquareES (int value){
		this.value=value;
	}
	
	public Integer call() {
		return value*value;
	}
}