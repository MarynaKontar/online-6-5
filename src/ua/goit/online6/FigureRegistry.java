package ua.goit.online6;

/**
 * Created by andreymi on 2/21/2017.
 */
public class FigureRegistry {
    private int size;
    private Figure[] figures;

    public FigureRegistry() {
        this.figures = new Figure[1000];
    }

    public void add(Figure figure) {
        if (figures.length <= size) {
            // increment size + copy
        }
        figures[size++] = figure;
    }

    public void remove(Figure figure) {
        int idx = -1;
        for (int i = 0; i < size; i++) {
            if (figures[i].equals(figure)) {
                idx = i;
                break;
            }
        }
        if (idx < 0) {
            return;
        }
        // removing and pushing.
    }

}
