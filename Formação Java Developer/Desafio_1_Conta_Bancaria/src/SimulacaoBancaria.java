import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        double deposito, sacar;
        
        
        while (continuar) {
        	System.out.println("\n1 - Depositar");
        	System.out.println("2 - Sacar");
        	System.out.println("3 - Consultar Saldo");
        	System.out.println("4 - Encerrar"); 
        	
            System.out.print("\nPor favor, informar o numero da operaçao que deseja realizar: ");
            int opcao = scanner.nextInt();              
          
            switch (opcao) {
                case 1:
                	System.out.println("\nPor favor, informar o valor a ser depositado: R$ ");
                	deposito = scanner.nextDouble();
                	
                	saldo += deposito;
                	
                	System.out.printf("Saldo atual: R$ %.1f\n", saldo);
                	
                  break;                 
                    
                case 2:
                	System.out.println("\nPor favor, informar o valor a ser sacado: R$ ");
                	sacar = scanner.nextDouble();
                	
                	if (saldo >= sacar) {
                		saldo -= sacar;                		
                		System.out.printf("Saldo atual: R$ %.1f\n", saldo);
                	}else {
                		System.out.printf("Saldo insuficiente! :-(\n");
                	}
                	
                    break;
                    
                case 3:
                	System.out.printf("\nSaldo atual: R$ %.1f", saldo);
                  break;
                    
                case 0:
                  System.out.println("Programa encerrado.");
                  continuar = false;  // Atualiza a variável de controle para encerrar o loop
                  break;
                    
                default:
                  System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
