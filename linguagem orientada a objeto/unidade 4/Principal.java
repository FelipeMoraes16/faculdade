public class Principal{
	public static void main(String[] args){
		Livro[] livros = new Livro[5];

		for(int i = 0; i < livros.length; i++){
			String titulo;
			if (i % 2 != 0){
				titulo = "Java vol " + i;
			}
			else{
				titulo = "Livro vol " + i;
			}

			livros[i] = new Livro(titulo, "Autor Generico " + i, 2020 + i);
		}

		System.out.println("Lista de livros com titulo 'Java': ");
		for(Livro livro : livros){
			if(livro.titulo.contains("Java")){
				livro.exibirInformacoes();
			}
		}
	}
}