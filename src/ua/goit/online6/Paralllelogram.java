package ua.goit.online6;

/**
 * Created by andreymi on 2/21/2017.
 */
public class Paralllelogram extends Figure {
    private double a;
    private double b;

    public Paralllelogram(double a, double b) {
        this.a = a;
        this.b = b;
    }

    protected double width() {
        return a;
    }

    protected double height() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paralllelogram that = (Paralllelogram) o;

        if (Double.compare(that.a, a) != 0) return false;
        return Double.compare(that.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public double square() {
        return a * b;
    }

    @Override
    public void draw(double sq) {
        System.out.println("Draw square from parrallel");
    }
}
