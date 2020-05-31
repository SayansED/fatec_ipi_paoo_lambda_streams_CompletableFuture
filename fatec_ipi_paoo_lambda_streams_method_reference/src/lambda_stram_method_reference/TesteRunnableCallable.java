package lambda_stram_method_reference;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TesteRunnableCallable {
	public static void main(String[] args) {
		
		// Exemplo 01
		new Thread (new Runnable() {
			@Override
			public void run() {
				System.out.println("Estou numa nova thread: " + Thread.currentThread().getName());
			}
		}).start();
		System.out.println("Estou na thread principal: " + Thread.currentThread().getName());
		
		
		// Exemplo 2 faz a mesma coisa que exemplo 01
		new Thread (() -> {
			System.out.println("Estou em uma nova thread, usando lambda: " + Thread.currentThread().getName());
		}).start();
		
		// Exemplo 03
		ExecutorService pool = Executors.newSingleThreadExecutor();
		
		Callable <String> callableSemLambda = new Callable <String> () {

			@Override
			public String call() throws Exception {
				
				return "Callable, sem lambda";
			}
		}; 
		// pool executa para mim essa thread
		try {
			String futuro =  pool.submit(callableSemLambda).get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Exemplo 04 - Usando lambda
		try {
			// lambda
			System.out.println(pool.submit(() -> {return "Agora com lambda";}).get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}