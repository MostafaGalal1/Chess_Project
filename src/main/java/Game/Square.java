package Game;

import java.awt.*;

public class Square {
    private Point p;
    private Piece piece;

    public Square(Point p, Piece piece) {
        this.p = p;
        this.piece = piece;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
