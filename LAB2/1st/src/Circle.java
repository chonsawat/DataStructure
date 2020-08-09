public class Circle {

    public double radius;

    public double area(){
        return 3.14 * Math.pow(this.radius, 2);
    }

    public double circumference(){
        return 2 * 3.14 * radius;
    }

    public double volume(){
        return 4.0/3 * 3.14 * Math.pow(radius,3);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

}
