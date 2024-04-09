class Cylinder{
    private int radius;
    private int height;

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
}

class AccessModifiersDemo{
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setRadius(23);
        c.setHeight(15);

        System.out.println("Redius is:"+c.getRadius());
        System.out.println("Height is:"+c.getHeight());
    }
}