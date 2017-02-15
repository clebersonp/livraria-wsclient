package br.com.caelum.livraria.webservice;

public class TesteRequestSoapComJava {

	public static void main(String[] args) throws Exception {
		
		LivrariaWs cliente = new LivrariaWsProxy();
		
		Livro[] livros = cliente.getLivrosPorTitulo("Java 8");
		
		for (Livro livro : livros) {
			System.out.println("Titulo: " + livro.getTitulo() + ", Autor: " + livro.getAutor().getNome());
		}
	}
	
}
