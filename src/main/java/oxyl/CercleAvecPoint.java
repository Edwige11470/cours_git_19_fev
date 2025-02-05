package oxyl;

public class CercleAvecPoint implements Figure {
    private Point centre;
    private double rayon;

    public CercleAvecPoint(Point centre, double rayon) {
        this.centre=centre;
        setRayon(rayon);
    }

    public CercleAvecPoint() {
        this(new Point(), 1.);
    }

    public CercleAvecPoint(CercleAvecPoint other) {
        this(other.centre, other.rayon);
    }

    public void setRayon(double rayon) {
        this.rayon = rayon >= 0. ? rayon : 0.;
    }

    public void deplacer(double distanceX, double distanceY) {
        this.centre.deplacer(distanceX, distanceY);
    }

    public boolean isGrand() {
        return rayon > 100;
    }

    public void redimensionner(double f) {
        this.setRayon(rayon * f);
    }

    public void tourner(double theta) {
    }
}
