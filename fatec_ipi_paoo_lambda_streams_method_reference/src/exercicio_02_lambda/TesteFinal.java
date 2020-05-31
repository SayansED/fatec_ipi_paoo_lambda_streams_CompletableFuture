package exercicio_02_lambda;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class TimeData {
	public Instant start;
	public Instant end;
	
	public double timeInSeconds() {
		return Duration.between(start, end).toMillis() / 1000.0;
	}
}

public class TesteFinal {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.printf("%nCorrida Assíncrona%n");
		CompletableFuture<TimeData> futureCorredor1 = CompletableFuture.supplyAsync(() -> startCorredor(100, "Corredor 1"));
		CompletableFuture<TimeData> futureCorredor2 = CompletableFuture.supplyAsync(() -> startCorredor(95, "Corredor 2"));
		CompletableFuture<TimeData> futureCorredor3 = CompletableFuture.supplyAsync(() -> startCorredor(90, "Corredor 3"));
		CompletableFuture<TimeData> futureCorredor4 = CompletableFuture.supplyAsync(() -> startCorredor(85, "Corredor 4"));
		CompletableFuture<TimeData> futureCorredor5 = CompletableFuture.supplyAsync(() -> startCorredor(80, "Corredor 5"));
		CompletableFuture<TimeData> futureCorredor6 = CompletableFuture.supplyAsync(() -> startCorredor(75, "Corredor 6"));
		CompletableFuture<TimeData> futureCorredor7 = CompletableFuture.supplyAsync(() -> startCorredor(70, "Corredor 7"));
		CompletableFuture<TimeData> futureCorredor8 = CompletableFuture.supplyAsync(() -> startCorredor(65, "Corredor 8"));
		CompletableFuture<TimeData> futureCorredor9 = CompletableFuture.supplyAsync(() -> startCorredor(60, "Corredor 9"));
		CompletableFuture<TimeData> futureCorredor10 = CompletableFuture.supplyAsync(() -> startCorredor(55, "Corredor 10"));
		CompletableFuture<TimeData> futureCorredor11 = CompletableFuture.supplyAsync(() -> startCorredor(50, "Corredor 11"));
		CompletableFuture<TimeData> futureCorredor12 = CompletableFuture.supplyAsync(() -> startCorredor(45, "Corredor 12"));
		CompletableFuture<TimeData> futureCorredor13 = CompletableFuture.supplyAsync(() -> startCorredor(40, "Corredor 13"));
		CompletableFuture<TimeData> futureCorredor14 = CompletableFuture.supplyAsync(() -> startCorredor(35, "Corredor 14"));
		CompletableFuture<TimeData> futureCorredor15 = CompletableFuture.supplyAsync(() -> startCorredor(30, "Corredor 15"));
		CompletableFuture<TimeData> futureCorredor16 = CompletableFuture.supplyAsync(() -> startCorredor(25, "Corredor 16"));
		CompletableFuture<TimeData> futureCorredor17 = CompletableFuture.supplyAsync(() -> startCorredor(20, "Corredor 17"));
		CompletableFuture<TimeData> futureCorredor18 = CompletableFuture.supplyAsync(() -> startCorredor(15, "Corredor 18"));
		CompletableFuture<TimeData> futureCorredor19 = CompletableFuture.supplyAsync(() -> startCorredor(10, "Corredor 19"));
		CompletableFuture<TimeData> futureCorredor20 = CompletableFuture.supplyAsync(() -> startCorredor(5, "Corredor 20"));
		
		TimeData asynchronousCorredor1 = futureCorredor1.get();
		TimeData asynchronousCorredor2 = futureCorredor2.get();
		TimeData asynchronousCorredor3 = futureCorredor3.get();
		TimeData asynchronousCorredor4 = futureCorredor4.get();
		TimeData asynchronousCorredor5 = futureCorredor5.get();
		TimeData asynchronousCorredor6 = futureCorredor6.get();
		TimeData asynchronousCorredor7 = futureCorredor7.get();
		TimeData asynchronousCorredor8 = futureCorredor8.get();
		TimeData asynchronousCorredor9 = futureCorredor9.get();
		TimeData asynchronousCorredor10 = futureCorredor10.get();
		TimeData asynchronousCorredor11 = futureCorredor11.get();
		TimeData asynchronousCorredor12 = futureCorredor12.get();
		TimeData asynchronousCorredor13 = futureCorredor13.get();
		TimeData asynchronousCorredor14 = futureCorredor14.get();
		TimeData asynchronousCorredor15 = futureCorredor15.get();
		TimeData asynchronousCorredor16 = futureCorredor16.get();
		TimeData asynchronousCorredor17 = futureCorredor17.get();
		TimeData asynchronousCorredor18 = futureCorredor18.get();
		TimeData asynchronousCorredor19 = futureCorredor19.get();
		TimeData asynchronousCorredor20 = futureCorredor20.get();
		
		displayResult("Corredor 1", asynchronousCorredor1);
		displayResult("Corredor 2", asynchronousCorredor2);
		displayResult("Corredor 3", asynchronousCorredor3);
		displayResult("Corredor 4", asynchronousCorredor4);
		displayResult("Corredor 5", asynchronousCorredor5);
		displayResult("Corredor 6", asynchronousCorredor6);
		displayResult("Corredor 7", asynchronousCorredor7);
		displayResult("Corredor 8", asynchronousCorredor8);
		displayResult("Corredor 9", asynchronousCorredor9);
		displayResult("Corredor 10", asynchronousCorredor10);
		displayResult("Corredor 11", asynchronousCorredor11);
		displayResult("Corredor 12", asynchronousCorredor12);
		displayResult("Corredor 13", asynchronousCorredor13);
		displayResult("Corredor 14", asynchronousCorredor14);
		displayResult("Corredor 15", asynchronousCorredor15);
		displayResult("Corredor 16", asynchronousCorredor16);
		displayResult("Corredor 17", asynchronousCorredor17);
		displayResult("Corredor 18", asynchronousCorredor18);
		displayResult("Corredor 19", asynchronousCorredor19);
		displayResult("Corredor 20", asynchronousCorredor20);

	}
	
	private static TimeData startCorredor(int n, String name) {
		TimeData timeData = new TimeData();
		timeData.start = Instant.now();
		double valueAdvance = correr(n, name);
		timeData.end = Instant.now();
		return timeData;
	}
	
	private static double correr(int n, String runningName) {
		double distanciaTotalDaCorrida = 500;
		double distanciaTotalPercorrida = 0;
		int valueAdvance = n;
		
		while (distanciaTotalPercorrida <= distanciaTotalDaCorrida) {
			distanciaTotalPercorrida += Math.random() * 50;			
			try {
				Thread.sleep(valueAdvance + (int) Math.random() * 15000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return n;
	}
	
	private static void displayResult(String futureCorredor, TimeData timeData) {
		System.out.printf("Calculation Time for running %s = %.3f seconds%n", futureCorredor, timeData.timeInSeconds());
	}

}
