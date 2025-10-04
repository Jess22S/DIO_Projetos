import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String agencia, nomeCliente;
		int numero;
		double saldo;
		
		System.out.println("Por favor, informar os dados abaixo:");
		
		System.out.print("\nNome: ");
		nomeCliente = sc.nextLine();
		
		System.out.print("Agência: ");
		agencia = sc.nextLine();
		
		System.out.print("Número: ");
		numero = sc.nextInt();
		
		System.out.print("Saldo: R$ ");
		saldo = sc.nextDouble();
		
	System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, " +
			"sua Agência é %s, Conta %s e seu Saldo de R$ %.2f já está disponível.",
			nomeCliente, agencia, numero, saldo);

		sc.close();
	}	   
}
