package exercise04;

/**
 * Created by stefan on 17.11.16.
 */
public class Sphere extends ThreeDimensional {
    protected double r;

    public Sphere(double r) {
        this.r = r;
    }

    @Override
    public double getVolume() {
        return 4/3*Math.PI*Math.pow(this.r, 3);
    }

    @Override
    public double getSurface() {
        return 4*Math.PI*this.r*this.r;
    }

    @Override
    public String toString() {
        return "Sphere with Radius " + this.r;
    }
}
