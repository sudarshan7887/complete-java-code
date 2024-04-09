abstract class base1{
    abstract public void show();
    abstract public void display();
}

class base2 extends base1{
public void show()
{
    System.out.println("in show");
}
public void display()
{
    System.out.println("in display");
}
}



public class AbstractDemo {
    public static void main(String[] args) {
        

        base2 b = new base2();
        b.display();
        b.show();
    }
    
}
