package aggregates;

public class BBB 
{
	private IAAA parent;
	
	public BBB(IAAA theParent)
	{
		parent = theParent;
		
	}
	
	
	public int fooBar()
	{
		parent.fooBar();
		
		System.out.println("BBB::fooBar");
		return 99;
	}
	
	public void F1()
	{
		System.out.println("Shouldn't be here");
		
	}
	
	private void F2()
	{
		System.out.println("AAA::in F2()");
				
	}
}
