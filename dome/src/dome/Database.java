package dome;

import java.util.ArrayList;

public class Database {
	private ArrayList<CD> listCD = new ArrayList<CD>();
	
	public void add(CD cd)
	{
		listCD.add(cd);
	}
	
	public void list()
	{
		listCD.print();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
