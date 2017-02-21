package ua.goit.online6;

import java.util.List;

/**
 * Created by andreymi on 2/21/2017.
 */
public abstract class Figure {

    private Line[] lines;

    public Line[] getLines() {
        return lines;
    }

    public void setLines(Line[] lines) {
        this.lines = lines;
    }

    public String name() {
        return "This is figure!";
    }

    public void calculateAndDraw() {
        double res = square();
        draw(res);
    }

//    public void writeToNetwork() {
//
//    }

    // plain figure
    public abstract double square();
    public abstract void draw(double sq);
}
