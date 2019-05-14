package coin;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	
	private HashMap<Integer, String> coinnames = new HashMap<Integer, String>();
	public Coin()
	{
		coinnames.put(1, "penny");
		coinnames.put(10, "dime");
		coinnames.put(25, "quarter");
		coinnames.put(50, "half-dolar");
		coinnames.put(50, "ÎåÃ«");
		System.out.println(coinnames);
		
		
		for(Integer k : coinnames.keySet())
		{
			System.out.println(coinnames.get(k));
		}
	}
	
	public String getName(int amount)
	{
		if(coinnames.containsKey(amount))
			return coinnames.get(amount);
		else
			return "NOT FOUND";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		Coin coin = new Coin();
		String s = coin.getName(amount);
		System.out.println(s);
	}

}
