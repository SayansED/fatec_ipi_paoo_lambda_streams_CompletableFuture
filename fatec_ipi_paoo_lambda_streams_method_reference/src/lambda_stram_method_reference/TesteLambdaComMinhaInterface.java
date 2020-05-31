package lambda_stram_method_reference;

public class TesteLambdaComMinhaInterface {

	public static void main(String[] args) {
		// Exemplo 01
		OperacaoAritmetica soma = (x, y) -> {return x + y;};
		OperacaoAritmetica multiplicacao = (x, y) -> {return x * y;};
		fazOperaco(soma);
		fazOperaco(multiplicacao);
		fazOperaco( (t, s) -> t / s);
	}
	
	public static void fazOperaco (OperacaoAritmetica op) {
		System.out.println(op.calcular(8, 2));
	}

}

// Minha interface
interface OperacaoAritmetica {
	public int calcular (int a, int b);
}
