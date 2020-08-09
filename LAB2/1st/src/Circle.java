public class Circle {

    public double radius;

    public double area(){
        return 3.14 * Math.pow(this.radius, 2);
    }

    public double circumference(){
        return 0;
    }

    public double volume(){
        return 0;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

}
