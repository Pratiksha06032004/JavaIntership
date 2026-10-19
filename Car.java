class Car
{
	String color="RED";
	int Tier=4;
	void Run()
	{
		System.out.println("Car is Running");
	}
	
	public static void main(String args[])
	{
		Car c=new Car();
		System.out.println("Car color="+c.color);
		c.Run();
	}
	
}