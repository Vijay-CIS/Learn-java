public class ChildClass extends AbstractClass {

    public ChildClass() {
        super();
    }

    // implement abstract method
    public void abstractMethod() {
        System.out.println("Abstract Method implemented in child.");
    }

    public static void main(String[] arg) {
        ChildClass child = new ChildClass();
        child.InstanceMethod();
        // call abstract method implementation
        child.abstractMethod();

    }

}
