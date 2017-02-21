package ua.goit.online6;

/**
 * Created by andreymi on 2/21/2017.
 */
public class DrawTest {

    public static  double sq(Figure figure) {
        if (figure instanceof Square) {
            return figure.square();
        }
        return 0;
    }

    public static void main(String[] args) {
        /*Figure[] figures = new Figure[2];
        figures[0] = new Paralllelogram(1, 1);
        figures[1] = new Square(5);

        Object[] figures2 = new Object[2];
        figures2[0] = new Paralllelogram(1, 1);
        figures2[1] = new Square(5);

        for (Figure figure : figures) {
            figure.draw(figure.square());
        }*/

        System.out.println(sq(new Paralllelogram(10, 1)));
    }
}
