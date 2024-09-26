package entities;

public class Account {
	private final String number;
	private String name;
	private boolean hasInitialDeposit;
	private double balance;
	
	public Account(String number, String name, boolean hasInitialDeposit, double initialValue) {
		this.number = number;
		this.name = name;
		this.hasInitialDeposit = hasInitialDeposit;
		
		if(hasInitialDeposit) {
			this.balance = initialValue;
		} else {
			this.balance = 0.0;
		}
	}
	
	public String getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean getHasInitialDeposit() {
		return hasInitialDeposit;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
		} else {
			System.out.println("O valor do depósito deve ser positivo.");
		}
	}
	
	public void withdraw(double amount) {
		double totalAmount = amount + 5.00;
		 if (totalAmount > this.balance) {
	            System.out.println("Saldo insuficiente! A conta ficará negativa.");
	        }
		 
	      this.balance -= totalAmount;
	}
	
	public String numberAccountInfo() {
		return "Número da conta: " + this.number;
	}
	
	public String nameAccountInfo() {
		return "Nome do titular: " + this.name;
	}
	
	public String balanceAccountInfo() {
		return "Saldo atual: " + "R$" + this.balance;
	}
	
}
