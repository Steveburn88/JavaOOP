package exercise04;

/**
 * Created by stefan on 17.11.16.
 */
public class Cuboid extends ThreeDimensional {
    protected double a, b, c;

    public Cuboid(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getVolume() {
        return this.a*this.b*this.c;
    }

    @Override
    public double getSurface() {
        return 2*this.a*this.b+2*this.a*this.c+2*this.b*this.c;
    }

    @Override
    public String toString() {
        return "Cuboid with Length " + this.a + " and Width " + this.b + " and Height " + this.c;
    }
}
