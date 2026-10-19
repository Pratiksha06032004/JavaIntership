class Factorial
{
	 
	public static void main(String args[])
	{
		int Num=5;
		int fact=Num;
		
		for(int i=1;i<Num;i++)
		{
		fact=fact*i;
		}
		System.out.println(Num+"Factorial ="+fact);
	}
}