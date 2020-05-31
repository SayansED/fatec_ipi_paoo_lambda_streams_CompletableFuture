package exercicio_02_lambda;

import java.util.concurrent.*;

import exercicio_02_lambda.Corredor;

public class Teste {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		
		Corredor corredor1 = new Corredor(mainThread, 50);
		Corredor corredor2 = new Corredor(mainThread, 45);
		Corredor corredor3 = new Corredor(mainThread, 40);
		Corredor corredor4 = new Corredor(mainThread, 35);
		Corredor corredor5 = new Corredor(mainThread, 30);
		Corredor corredor6 = new Corredor(mainThread, 25);
		Corredor corredor7 = new Corredor(mainThread, 20);
		Corredor corredor8 = new Corredor(mainThread, 15);
		Corredor corredor9 = new Corredor(mainThread, 10);
		Corredor corredor10 = new Corredor(mainThread, 5);
		
		ExecutorService pool = Executors.newCachedThreadPool();
		
		
		pool.execute(corredor1);
		pool.execute(corredor2);
		pool.execute(corredor3);
		pool.execute(corredor4);
		pool.execute(corredor5);
		pool.execute(corredor6);
		pool.execute(corredor7);
		pool.execute(corredor8);
		pool.execute(corredor9);
		pool.execute(corredor10);
		
		
		pool.shutdown();
	}
}
