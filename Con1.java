public class ConOver
{
	private int x;
	private int y;
	public ConOver()
	{
		x = 0;
		y = 0;
	}
	public ConOver(int x)
	{
		this.x = x;
		y=0;
	}
	public ConOver(int x,int y)
	{
		
		this.x = x;
		this.y = y;
	}
	public static void main(String args[])
	{
		ConOver ex1 = new ConOver();
		System.out.println("x=" + ex1.x + ",y="+ex1.y);
		ConOver ex2 = new ConOver(5);
		System.out.println("x=" + ex2.x + ",y="+ex2.y);
		ConOver ex3 = new ConOver(2,3);
		System.out.println("x=" + ex3.x + ",y="+ex3.y);
	}
}