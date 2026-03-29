class Produto{
	public String nome = "Nenhum produto";
	public double preco = 0;
	static int quantidadeTotal = 0;

	public Produto(){
		quantidadeTotal += 1;
	}

	public Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
		quantidadeTotal += 1;
	}

	public void exibirDados(){
		System.out.println("Nome do produto: " + nome);
		System.out.printf("Preço do produto: R$ %.2f%n", preco);
	}

	public static void exibirQuantidadeTotal(){
		System.out.println("Quantidade de produtos cadastrados: " + quantidadeTotal);
	}
}