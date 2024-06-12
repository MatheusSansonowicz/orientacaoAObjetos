package aula1106;

public class Principal {

	public static void main(String[] args) throws MinhaExceção {
		// TODO Auto-generated method stub
		/*try {
		int[] numeros = {1,2,3};
		System.out.println(numeros[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: indice fora do array");
		}
		
		try {
			int[] numeros = {1,2,3};
			System.out.println(numeros[3]);
			} catch (Exception e) {
				System.out.println("Erro: " +e.toString());
			}*/
		
		double a = 10;
		double b = 0;
		divide(a, b);
		
		/*String numero = "abc";
		int valor = Integer.parseInt(numero); //NumberFormatException*/

	}

	private static void divide(double a, double b) throws MinhaExceção{
		if (b==0)
			throw new MinhaExceção("Impossivel realizar divisão por 0");
		else
			System.out.println("A divisão é: "+(a/b));
	}

}
