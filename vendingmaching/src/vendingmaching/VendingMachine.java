package vendingmaching;

public class VendingMachine {
	int price = 80;
	int balance;
	int total;
	
	VendingMachine()
	{
		//���캯�����ڹ���ʱ�Զ�����
		//�ȶ������ⲿ�Ķ����ٻص����캯��
		//�����з�������
	}
	VendingMachine(int price)
	{
		this.price = price;
		//����
		//ͬ��������ͬ���Զ����ݸ��Ĳ�������
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
