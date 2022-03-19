public class InterfaceImpl implements InterfaceDemo, AnotherInterface {

    public void method() {
        System.out.println("Interface method implemented");

    }

    public void anotherMethod() {
        System.out.println("Interface another method implemented");

    }

    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();
        impl.method();
        impl.anotherMethod();
    }
}
