abstract class Shape {
    public abstract void draw();
}
class Circle extends Shapee {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
class Rectangle extends Shapee {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Shapee circle = new Circlee();
        Shapee rectangle = new Rectangle();
        circle.draw();
        rectangle.draw();
    }
}
