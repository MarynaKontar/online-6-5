package ua.goit.online6;

/**
 * Created by andreymi on 2/21/2017.
 */
public class Square extends Paralllelogram {

    public Square(double a) {
        super(a, a);
    }

    @Override
    public void draw(double sq) {
        System.out.println("Call draw from square!");
    }

    @Override
    public String toString() {
        return "This is sq:" + width();
    }

    public double perimeter() {
        return 4 * width();
    }
}
