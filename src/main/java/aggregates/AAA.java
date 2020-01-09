package aggregates;

public abstract class AAA 
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
		throw new UnsupportedOperationExceptoin("Not Supported Yet.");
		
	}
	
	
}
		
