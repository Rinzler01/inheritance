package aggregates;

public class AAA implements IAAA
{
	private int x = 7;
	
	public AAA()
	{
	
	}
	
	public int fooBar()
	{
		x = 9;
		
		System.out.println("AAA::fooBar");
		
		return 3;
	}
	
	public void F1()
	{
		System.out.println("Shouldn't be here");
		
	}
	
	
}
		
