package aggregates;

public class MainUnit
{

	public static void main(String[] args) 
	{
		
		IAAA root = new AAAStub();
		BBB parent = new BBB(new AAA());
		
		
		
		parent.fooBar();
		
		
		
		
		
	}

}
