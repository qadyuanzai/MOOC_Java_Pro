package dome;

public class Item {

	private String title;
	private int playingTime;
	private boolean gotIt = false;
	private String comment;
	




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

	public Item(String title, int playingTime, boolean gotIt, String comment) {
		super();
		this.title = title;
		this.playingTime = playingTime;
		this.gotIt = gotIt;
		this.comment = comment;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(title);
	}

}
