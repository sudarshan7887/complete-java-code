abstract class Pen{
    abstract void write();
    abstract void refill();

}

class FountainPen extends Pen{

    public void write()
    {
        System.out.println("Writting....");
    }

    public void refill()
    {
        System.out.println("changing refill....");
    }

    public void changeNib()
    {
        System.out.println("changing Nibble..");
    }
}


//question 2
class Monkey{
    public void jump()
    {
        System.out.println("Jumping monkey..");
    }

    public void bite()
    {
        System.out.println("bite..");
    }
}

interface BasicAnimal {
void sleep();
void eat();
}


class Human extends Monkey implements BasicAnimal {

    public void sleep()
    {
        System.out.println("Slepping...");
    }

    public void eat()
    {
        System.out.println("eatting..");
    }
}


//que 3

abstract class telephone{

    abstract void ring();
    abstract void light();
    abstract void disconnect();
}
class smartphone extends telephone{

    public void ring(){
        System.out.println("ringing phone..");
    }
    public void light(){
        System.out.println("lighting a phone...");
    }
    public void disconnect(){
        System.out.println("phone disconnected..");
    }

    public void pickupCall(){
        System.out.println("Answering the call");
    }
}

public class AbstractPrDemo {
    public static void main(String[] args) {
        
        // FountainPen p = new FountainPen();
        // p.changeNib();
        // p.write();
        // p.refill();

        // Human h = new Human();
        // h.bite();
        // h.eat();
        // h.jump();
        // h.sleep();

         telephone t= new smartphone();
          t.light();
          t.ring();
          t.disconnect();
          
        
            
        
    }
    
}
