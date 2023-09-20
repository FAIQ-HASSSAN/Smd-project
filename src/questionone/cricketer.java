package questionone;

public interface cricketer 
{
	
	String name = "";
	int age = 0;
	String Nationality = "";
	
	default void Print()
	{
		System.out.println("I am a cricketer");
	}

}
