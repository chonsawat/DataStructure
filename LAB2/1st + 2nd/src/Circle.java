public class Circle {

    public Circle(double radius) {
        this.radius = radius;
    }

    public double radius;

    public double area(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double circumference(){
        return 2 * Math.PI * radius;
    }

    public double volume(){
        return 4.0/3 * Math.PI * Math.pow(radius,3);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void show(){
        System.out.printf("Area: %f\n", area());
        System.out.printf("Circumference: %f\n", circumference());
        System.out.printf("Volume: %f\n", volume());
        System.out.println("Radius: " + getRadius());
    }

}
