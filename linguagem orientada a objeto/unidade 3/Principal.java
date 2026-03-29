public class Principal{
	public static void main(String[] args){
		OperacaoMatematica soma = new Soma();
		OperacaoMatematica divisao = new Divisao();
		try{
			System.out.println("Soma: " + soma.calcular(10, 5));
			System.out.println("Divisao correta: " + divisao.calcular(10, 2));
			System.out.println("Divisao com zero: " + divisao.calcular(10, 0));
		}
		catch(DivisaoPorZeroException e) {
    		System.err.println(e.getMessage()); 
		}
		finally{
			System.out.println("Fim do programa.");
		}
		
	}
}