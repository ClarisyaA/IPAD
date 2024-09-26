public class Area2 extends GeometricObject implements Square {
    private double side;

    public Area2(double side){
        this.side = side;
    }

    public Area2(){
        this.side = 0;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getSide(){
        return this.side;
    }
    
    @Override
    public double CalculateArea() {
        return this.side * this.side;
    }

    @Override
    public double CalculateArea(double side) {
        return this.side * this.side;
    }
}
