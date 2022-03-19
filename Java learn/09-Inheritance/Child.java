public class Child extends Parent {
    public Child(int age) {
        super(age);
        System.out.println("Child Constructor");

    }

    public void InstanceMethod() {
        System.out.println(age);
        System.out.println("Child Contructor of InstanceMethod.");

    }

    public static void main(String[] args) {
        // Child child = new Child(10);
        // child.InstanceMethod();
        Parent parent = new Child(10);
        parent.InstanceMethod();
    }

}
