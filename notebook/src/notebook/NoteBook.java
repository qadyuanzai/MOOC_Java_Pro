package notebook;

import java.util.ArrayList;
import java.util.HashSet;

public class NoteBook {
	private ArrayList<String> notes = new ArrayList<String>();
	
	public void add(String s)
	{
		notes.add(s);
	}
	public void add(String s, int location)
	{
		notes.add(location, s);
	}
	
	
	public int getSize()
	{
		return notes.size();
	}
	
	public String getNote(int index)
	{
		return notes.get(index);
	}
	
	public void removeNote(int index)
	{
		notes.remove(index);
	}
	
	public String[] list()
	{
		String[] a = new String[notes.size()];
		notes.toArray(a);
		return a;
	}
	
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("first");
		a.add("second");
		a.add("fiest");
		for(String s : a)
		{
			System.out.println(s);
		}
		
		System.out.println("---------------- ");
		//set->¼¯ºÏ
		HashSet<String> s = new HashSet<String>();
		s.add("first");
		s.add("second");
		s.add("fiest");
		System.out.println(s);
		
	}

}
