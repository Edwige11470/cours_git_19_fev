package oxyl;

public interface Figure {
    void deplacer(double distanceX,double distanceY);
    default void tourner(double theta){};
    default void redimensionner(){};
}
