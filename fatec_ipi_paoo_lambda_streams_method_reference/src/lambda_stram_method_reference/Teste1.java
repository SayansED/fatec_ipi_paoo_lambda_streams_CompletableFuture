package lambda_stram_method_reference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Teste1 {

	public static void main(String[] args) {
		Livro l1 = new Livro ("Concrete Mathematics", "Knuth");
		Livro l2 = new Livro ("Introduction to Algorithms", "Cormen");
		List <Livro> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		
		// Exemplo 01
		for (Livro livro : livros) {
			//System.out.println("Exemplo 01: " + livro.getAutor());
			System.out.println("Exemplo 01:" + livro.toString());
		}
		
		// Exemplo 02 - Classe aninhada
		ExibeAutor exibeAutor = new ExibeAutor();
		livros.forEach(exibeAutor);
		
		// Exemplo 03
		Consumer <Livro> exibeAutor2 = new Consumer <Livro>() {
			@Override
			public void accept(Livro l) {
				//System.out.println("Exemplo 03: " + l.getAutor());
				System.out.println("Exemplo 03: " + l.toString());
			}
		};
		livros.forEach(exibeAutor2);
		
		// Exemplo 04
		livros.forEach(new Consumer <Livro> () {
			@Override
			public void accept(Livro l) {
				//System.out.println("Exemplo 04: " + l.getAutor());
				System.out.println("Exemplo 04: " + l.toString());
			}  
		});
		
		//**************** Uso de lambda ********************
		
		//Uso de expressões lambda vale para uso em geral, uso do forEach só para exemplo de metodo que espera a implementação de uma interface 
		
		// lambda - É uma implementação de uma interface que tenha 1 metodo somente
		// Usando lambda - padrão de lambda () -> {}
		
		// Exemplo 01
		Consumer <Livro> lambda1 = (Livro l) -> {System.out.println(" lambda 01: " + l.toString());};
		livros.forEach(lambda1);
		
		// Exemplo 02
		Consumer <Livro> lambda2 = l -> {System.out.println(" lambda 02: " + l.toString());};
		livros.forEach(lambda2);
		
		// Exemplo 03
		Consumer <Livro> lambda3 = l -> System.out.println (" lambda 03: " + l.toString()); //
		livros.forEach(lambda3);
		
		// Exemplo 04
		livros.forEach(l -> System.out.println ("lambda 04 - Livro é novo: " + l.toString()));
		livros.forEach(l -> l.abrir());
		livros.forEach(l -> System.out.println("lambda 04 - Livro é novo: " + l.toString()));
	}
}

// Do exemplo 02 - classe aninhada
class ExibeAutor implements Consumer <Livro> {
	@Override
	public void accept(Livro l) {
		//System.out.println("Exemplo 02: " + l.getAutor());
		System.out.println("Exemplo 02: " + l.toString());
	}
}