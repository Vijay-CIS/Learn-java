public class Parent {
    protected int age;

    public Parent(int age) {
        this.age = age;
        System.out.println("Contructor of Parent.");

    }

    public void InstanceMethod() {
        System.out.println(age);
        System.out.println("Contructor of InstanceMethod.");

    }

    public static void main(String[] args) {
        Parent parent = new Parent(10);
        parent.InstanceMethod();

    }

}