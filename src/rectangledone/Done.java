package rectangledone;

import rectangle.Rectangle;

public class Done {
    public static void main(String[] args) {

        Rectangle a = new Rectangle(1,1,5,5);
        Rectangle b = new Rectangle(7,7);
        Rectangle c = new Rectangle();
        a.move1(1,2);
        b.move1(3,5);
        c.move1(1,1);

        System.out.println("Координат x1: "+a.getX1()+" y1: "+a.getY1()+" x2: "+a.getX2()+" y2: "+a.getY2());
        System.out.println("Координат x1: "+b.getX1()+" y1: "+b.getY1()+" x2: "+b.getX2()+" y2: "+b.getY2());
        System.out.println("Координат x1: "+c.getX1()+" y1: "+c.getY1()+" x2: "+c.getX2()+" y2: "+c.getY2());


    }




}
