// Parent class (Superclass)
class Shapee {
    public void draw() {
        System.out.println("Drawing a shape");
    }

    public void draw(String color) {
        System.out.println("Drawing a shape with color: " + color);
    }
}

// Child class inheriting from Shape
class Circlee extends Shapee {
    public void draw() {
        System.out.println("Drawing a circle");
    }

    // Overloading the draw() method with a different parameter
    public void draw(String color, int radius) {
        System.out.println("Drawing a circle with color " + color + " and radius " + radius);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Shapee shape = new Shapee();
        Circlee circle = new Circlee();

        shape.draw(); // Output:
        shape.draw("red");

        circle.draw();
        circle.draw("blue", 5);
    }
}
