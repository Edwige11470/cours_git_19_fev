package org.oxyl;

import java.util.Objects;

abstract class AUnCentre {
    private Point centre;

    public AUnCentre(Point centre){
        this.centre=centre;
    }
    public void deplacer(double distanceX, double distanceY) {
        this.centre.deplacer(distanceX, distanceY);
    }

    public Boolean isAuCentre(){
        Point origine= new Point(0,0);
        return (Objects.equals(centre, origine));
        //return (centre.getX()==0 && centre.getY()==0)
    }
}
