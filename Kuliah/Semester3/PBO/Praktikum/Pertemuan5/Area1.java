public class Area1 extends GeometricObject implements Rectangle{
    private double length;
    private double width;

    public Area1(double length, double width) {
        this.length = length;
        this.width = width;
      }

    public Area1(){
        this.length = 0;
        this.width = 0;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getLength(){
        return this.length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return this.width;
    }

    @Override
    public double CalculateArea() {
        return this.length * this.width;
    }

    @Override
    public double CalculateArea(double length, double width) {
        return this.length * this.width;
    }

}
