
public class Join_And_isAlive_methods 
{

	public static void main(String[] args) throws Exception
	{
		Runnable obj1 = () ->
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hii");
					try	{ Thread.sleep(500);}catch(Exception e)	{}
			}
		};
		Runnable obj2 = () ->
		{
			for(int i=1;i<=5;i++)
	 		{
	 			System.out.println("Hello");
	 			try	{ Thread.sleep(500);}catch(Exception e)	{}
	 		}
		};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		 try	{ Thread.sleep(10);}catch(Exception e)	{}
		t2.start();
		 System.out.println(t1.isAlive()); 
		  //check code is running state or not if yes then true else false
		
		t1.join();
		t2.join();
		
		System.out.println("Bye!");
	}
}
