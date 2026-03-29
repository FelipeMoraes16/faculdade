public class Soma extends OperacaoMatematica{
	@Override
	public double calcular(double a, double b)throws DivisaoPorZeroException{
		return a + b;
	}
}