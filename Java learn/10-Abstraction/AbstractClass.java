public abstract class AbstractClass {
    public AbstractClass() {
        System.out.println("Abstract Class Constructor");

    }

    public void InstanceMethod() {

        System.out.println(" Abstractclass of InstanceMethod.");

    }

    abstract void abstractMethod();

    public static void main(String args[]) {
        // AbstractClass abstractClass = new AbstractClass();
    }
}