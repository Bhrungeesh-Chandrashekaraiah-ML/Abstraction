import java.lang.annotation.*;

// Creating a custom annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value();
}

// Applying the custom annotation to a method
class Annot {

    @MyAnnotation("This is a method annotation")
    public void myMethod() {
        System.out.println("Inside myMethod");
    }
}

public class Annotations {
    public static void main(String[] args) throws NoSuchMethodException {
        Annot obj = new Annot();

        // Retrieving the annotation and accessing its value
        MyAnnotation annotation = obj.getClass().getDeclaredMethod("myMethod").getAnnotation(MyAnnotation.class);
        if (annotation != null) {
            System.out.println("Annotation value: " + annotation.value());
        } else {
            System.out.println("Annotation not found");
        }
    }
}
