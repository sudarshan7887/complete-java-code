class shape
{
	public void area()
	{
	
		System.out.println("display area:");
	}
}
class Triangle extends shape
{
	public void area(int l,int h)
	{
		System.out.println((1/2)*l*h);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
	
		Triangle t1 = new Triangle();
		t1.area();
		t1.area(2, 50);
		
		
	}

}
