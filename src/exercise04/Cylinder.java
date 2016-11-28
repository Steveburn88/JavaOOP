package exercise04;

/**
 * Created by stefan on 17.11.16.
 */
public class Cylinder extends ThreeDimensional {
    protected double r, h;

    @Override
    public double getVolume() {
        return Math.PI*Math.pow(this.r, 2)*this.h;
    }

    @Override
    public double getSurface() {
        return 2*Math.PI*Math.pow(this.r, 2)+2*Math.PI*this.r*this.h;
    }

    @Override
    public String toString() {
        return "Cylinder with Radius " + this.r + " and Height " + this.h;
    }

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }
}
