package week_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}

}

class Display
{
	private int value = 0;
	private int limit = 0;
	
	Display(int limit)
	{
		this.limit = limit;
	}
	
	int increase()
	{
		value++;
		if(value==limit)
		{
			value = 0;
		}
		return value;
	}
	
	void setValue(int value)
	{
		this.value = value;
	}
	
	int getValue()
	{
		return value;
	}
	
}

class Clock
{
	Display h = new Display(24);
	Display m = new Display(60);
	Display s = new Display(60);
	
	Clock(int hour, int minute, int second)
	{
		h.setValue(hour);
		m.setValue(minute);
		s.setValue(second);
	}
	
	void tick()
	{
		s.increase();
		if(s.getValue()==0)
		{
			m.increase();
			if(m.getValue()==0)
			{
				h.increase();
			}
		}
	}
	
	public String toString()
	{
		return String.format("%02d:%02d:%02d", h.getValue(), m.getValue(), s.getValue());
	}
}
















