import java.util.Scanner;
import entities.Account;


public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número da conta: ");
		String number = sc.nextLine();
		
		System.out.println("Digite o nome do cliente: ");
		String name = sc.nextLine();
		
		System.out.println("Irá realizar um depósito inicial? (sim/não)");
		String initialDepositResponse = sc.nextLine();
		
		boolean hasInitialDeposit = initialDepositResponse.equalsIgnoreCase("sim");
        double initialDeposit = 0.0;
        
		if(hasInitialDeposit) {
			System.out.println("Digite o valor do depósito inicial: ");
			initialDeposit = sc.nextDouble();
		}
		
		Account account = new Account(number, name, hasInitialDeposit, initialDeposit);
		
		System.out.println("Conta criada com sucesso!");
        System.out.println(account.numberAccountInfo());
        System.out.println(account.nameAccountInfo());
        System.out.println(account.balanceAccountInfo());
        
        int option = 0;
        while (option != 4) {
        	System.out.println("Qual operação deseja realizar?");
			System.out.println("1 - Fazer Deposito");
			System.out.println("2 - Fazer Saque");
			System.out.println("3 - Alterar nome do titular");
			System.out.println("4 - Encerrar operação");
			
			System.out.println("Escolha uma opção: ");
			option = sc.nextInt();
			sc.nextLine();
			
			switch (option) {
			case 1:
				System.out.println("Entre com valor do deposito: ");
				double addBalance = sc.nextDouble();
				account.deposit(addBalance);
				System.out.println("O saldo atual é: "  + "R$" + account.getBalance());
				break;
			case 2:
				System.out.println("Entre com valor do saque (Ira ser cobrado R$5,00 de taxa): ");
				double removeBalance = sc.nextDouble();
				account.withdraw(removeBalance);
				System.out.println("O saldo atual é: " + "R$" + account.getBalance());
				break;
			case 3:
				System.out.println("Entre com novo nome do titular: ");
				String addName = sc.nextLine();
				account.setName(addName);
				System.out.println("O nome do titular é: " + account.getName());
				break;
			case 4:
				System.out.println("Operação finalizada!");
		        System.out.println(account.numberAccountInfo());
		        System.out.println(account.nameAccountInfo());
		        System.out.println(account.balanceAccountInfo());
		        break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
			}
        }
		
		sc.close();
		
	}

}
