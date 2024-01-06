
class Student {
    private String name;
    private int age;
    private String id;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0 && age < 120) { 
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Student student = new Student();
        
        student.setName("Alice");
        student.setAge(20);
        student.setId("2023001");
        
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student ID: " + student.getId());
    }
}
