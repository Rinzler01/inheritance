package aggregates;

public class MainUnit
{

	public static void main(String[] args) 
	{
		
		AAA root = new AAA();
		BBB parent = new BBB(new AAA());
		
		
		
		parent.fooBar();
		
		
		
		
		
	}

}
