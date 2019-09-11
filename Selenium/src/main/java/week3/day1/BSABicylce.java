package week3.day1;

public class BSABicylce extends Bicycle{
	public String getcolor()
	{
		return "THE CYCLE COLOR IS BLACK";

	}
	public void FillAir(String air)
	{
		if( air.equals("filled"))
	System.out.println("Air filled");
		else
			System.out.println("not filled");
	}

public static void main(String [] args)

{
	BSABicylce cyl=new BSABicylce();
	String mycyl=cyl.FillAir();
System.out.println(mycyl);
System.out.println(cyl.getcolor());
	
}	
}
	
