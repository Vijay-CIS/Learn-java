public class Bill {
    private String date;
    private BillItem[] billItems;
    private int total;
    private int size;

    public Bill(String date) {
        this.date = date;
        this.billItems = new BillItem[100];
        this.total = 0;
        this.size = 0;
    }

    public void addItem(int menuId, int quantity) {
        billItems[size] = new BillItem(size + 1, menuId, quantity);
        total += billItems[size].getTotal();
        size++;

    }

    public void display() {
        System.out.println("Star Restaurant");
        System.out.println(date);
        System.out.println("===============");
        System.out.println("#  Item   Price  Qty  Total");
        System.out.println("===========================");
        for (int i = 0; i < size; i++) {
            billItems[i].display();
        }
        System.out.println("===========================");
        System.out.println("Total : " + total);
        System.out.println("===========================");
    }

    public static void main(String args[]) {
        Bill bill = new Bill("16-Mar-2022");
        bill.addItem(1, 3);
        bill.addItem(2, 2);
        bill.addItem(3, 2);
        bill.display();
    }
}
