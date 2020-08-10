import java.text.DecimalFormat;

public class Circle {

    // Create Attribute
    public double radius;


    // Constructor
    public Circle(double radius) {
        // Check radius must more than 0
        if (radius > 0)
            this.radius = radius;
    }


    // Method Calculate
    public double area(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double circumference(){
        return 2 * Math.PI * radius;
    }

    public double volume(){
        return 4.0/3 * Math.PI * Math.pow(radius,3);
    }


    // Method get
    public double getRadius(){
        return radius;
    }


    // Method set
    public void setRadius(double radius){
        // Radius must more than zero
        if (radius > 0)
            this.radius = radius;
        else
            System.out.printf("Input was lower than zero!!\nCurrent radius is: %.2f\n\n", this.radius);
    }


    // Method to easy calling show all values in testCircle
    public void show(){
        // Create format object
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        // Show all values
        System.out.printf("Area: %.2f\n", area());
        System.out.printf("Circumference: %.2f\n", circumference());
        System.out.printf("Volume: %.2f\n", volume());
        System.out.println("Radius: " + decimalFormat.format(getRadius()));
    }

}
