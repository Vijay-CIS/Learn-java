public class Menu {
    private int id;
    private String name;
    private int price;

    public Menu(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void display() {
        System.out.println(id + " " + name + " " + price);
    }

    // public static void main(String[] args) {
    public static Menu[] getMenuItems() {
        Menu[] menuItems = {
                new Menu(1, "Idlis", 30),
                new Menu(2, "Dosai", 50),
                new Menu(3, "vadai", 10)

        };
        // for (Menu menu : menuItems) {
        // menu.display();
        // }
        return menuItems;
    }

}
