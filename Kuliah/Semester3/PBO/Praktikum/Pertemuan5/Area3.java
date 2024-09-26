public class Area3 extends GeometricObject implements Circle {
    private double radius;

    public Area3(double radius){
        this.radius = radius;
    }

    public Area3(){
        this.radius = 0;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    @Override
    public double CalculateArea() {
        return 3.14 * this.radius * this.radius;
    }

    @Override
    public double CalculateArea(double radius) {
        return 3.14 * this.radius * this.radius;
    }
}
