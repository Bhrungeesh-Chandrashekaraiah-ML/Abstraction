class AccessModifiers {
    public int publicVariable = 10;
    private int privateVariable = 20;
    int defaultVariable = 30;
    protected int protectedVariable = 40;
    public void publicMethod() {
        System.out.println("This is a public method");
    }
    private void privateMethod() {
        System.out.println("This is a private method");
    }
    void defaultMethod() {
        System.out.println("This is a default method");
    }
    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }
}

class abcd{
    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }
}

 class Main{
    public static void main(String[] args) {
        AccessModifiers example = new AccessModifiers();

        System.out.println(example.publicVariable);
        //System.out.println(example.privateVariable);
        System.out.println(example.defaultVariable);
        System.out.println(example.protectedVariable);


        example.publicMethod();
        // example.privateMethod();
        example.defaultMethod();
        example.protectedMethod();

    }
}
