public class Principal{
	public static void main(String[] args){
		Produto produto1 = new Produto();
		Produto produto2 = new Produto("Computador", 3000.00);
		Produto produto3 = new Produto("Celular", 1500.00);

		produto1.exibirDados();
		produto2.exibirDados();
		produto3.exibirDados();

		Produto.exibirQuantidadeTotal();
	}
}