package Pieces;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Rook extends Game.Piece{
    private Point p;

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public java.util.List<Point> get_valid(Point p)
    {
        List<Point> valid_list = new ArrayList<>();
        Point np = null;

        for (int i = 1; i < 8; i++) {
            np.x = p.x + i;
            np.y = p.y;
        }

        return valid_list;
    }
}
