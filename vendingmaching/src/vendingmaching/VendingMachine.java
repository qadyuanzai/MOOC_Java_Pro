package vendingmaching;

public class VendingMachine {
	int price = 80;
	int balance;
	int total;
	
	VendingMachine()
	{
		//构造函数，在构造时自动调用
		//先定义完外部的东西再回到构造函数
		//不能有返回类型
	}
	VendingMachine(int price)
	{
		this.price = price;
		//重载
		//同名参数表不同，自动根据给的参数调用
	}
	
	void showPrompt()
	{
		System.out.println("Welcome");
	}
	
	void insertMoney(int amount)
	{
		 balance = balance + amount;
		 showBalance();
	}
	
	void showBalance()
	{
		System.out.println(balance);
	}
	
	void getFood()
	{
		if(balance>=price)
		{
			System.out.println("Here you are");
			balance = balance - price;
			total = total +price;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine vm = new VendingMachine();
		vm.showPrompt();
		vm.showBalance();
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
		VendingMachine vm1 = new VendingMachine(100);
		vm1.insertMoney(100);
		vm1.showBalance();
	}

}
