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
        	
            System.out.print("\nPor favor, informar o número da operaçao que deseja realizar: ");
            int opcao = scanner.nextInt();              
          
            switch (opcao) {
                case 1:
                	System.out.printf("\nPor favor, informar o valor a ser depositado: R$ ");
                	deposito = scanner.nextDouble();
                	
                	saldo += deposito;
                	
                	System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                	
                  break;                 
                    
                case 2:
                	System.out.printf("\nPor favor, informar o valor a ser sacado: R$ ");
                	sacar = scanner.nextDouble();
                	
                	if (saldo >= sacar) {
                		saldo -= sacar;                		
                		System.out.printf("\nSaldo atual: R$ %.2f\n", saldo);
                	}else {
                		System.out.printf("\nSaldo insuficiente! :-(\n");
                	}
                	
                    break;
                    
                case 3:
                	System.out.printf("\nSaldo atual: R$ %.2f\n", saldo);
                  break;
                    
                case 4:
                  System.out.println("Programa encerrado.");
                  continuar = false;
                  break;
                    
                default:
                  System.out.println("Opção inválida. Tente novamente!");
            }
        }
        scanner.close();
    }
}
