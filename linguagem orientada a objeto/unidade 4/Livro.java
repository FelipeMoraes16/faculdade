public class Livro{
	public String titulo;
	public String autor;
	public int anoPublicacao;

	public Livro(String titulo, String autor, int anoPublicacao){
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	public void exibirInformacoes(){
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Ano publicação: " + anoPublicacao);
		System.out.println("-".repeat(20));
	}
}