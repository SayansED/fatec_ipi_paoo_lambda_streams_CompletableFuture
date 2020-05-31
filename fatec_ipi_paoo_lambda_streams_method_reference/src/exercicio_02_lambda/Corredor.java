package exercicio_02_lambda;

public class Corredor implements Runnable {

	private static double distanciaTotalDaCorrida = 500;
	private double distanciaTotalPercorrida = 0;
	private Thread main;
	private int valorDeGanho = 0;

	public Corredor(Thread main, int valorDeganho) {
		this.main = main;
		this.valorDeGanho = valorDeganho;
	}

	@Override
	public void run() {

		try {
			main.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		while (distanciaTotalPercorrida <= distanciaTotalDaCorrida) {
			System.out.println("****************");
			distanciaTotalPercorrida += Math.random() * 50;
			System.out.println(
					Thread.currentThread().getName() + ": " + String.format("%.2f", distanciaTotalPercorrida) + "m");

			if (distanciaTotalPercorrida > distanciaTotalDaCorrida)
				System.out.println(Thread.currentThread().getName() + " acabou.");

			try {
				Thread.sleep(2000 + (int) Math.random() * 15000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
