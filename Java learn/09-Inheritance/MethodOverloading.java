public class MethodOverloading {
    public void instanceMethod() {
        System.out.println("Instance method without parameters");
    }

    public void instanceMethod(String name) {
        System.out.println("Instance method with String paramter");

    }

    public void instanceMethod(int age) {
        System.out.println("Instance method with int paramter");
    }

    public void instanceMethod(int age, int size) {
        System.out.println("Instance method with two int parameters");
    }

    public static void main(String[] args) {
        MethodOverloading demo = new MethodOverloading();
        demo.instanceMethod();
        demo.instanceMethod("john");
        demo.instanceMethod(10);
        demo.instanceMethod(10, 20);

    }
}
