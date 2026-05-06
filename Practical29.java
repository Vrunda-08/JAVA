import java.util.Scanner;

interface Order {

    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

abstract class PartialOrder implements Order {

    String item;
    int qty;
    int orderId = 101;

    public void placeOrder(String item, int qty) {
        this.item = item;
        this.qty = qty;
        System.out.println("Order Placed Successfully");
        System.out.println("Order ID: " + orderId);
    }
}

class FinalOrder extends PartialOrder {

    public void cancelOrder(int orderId) {
        if(this.orderId == orderId) {
            System.out.println("Order Cancelled Successfully");
        } else {
            System.out.println("Invalid Order ID");
        }
    }

    public void generateBill() {
        int price = 100;   // fixed price per item
        int total = qty * price;

        System.out.println("Item: " + item);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Bill: Rs. " + total);
    }
}

class Practical29 {

    public static void main(String[] args) {

        System.out.println("Vrunda Vaghela (250393107016)\n"); 
        Scanner sc = new Scanner(System.in);
        FinalOrder fo = new FinalOrder();

        System.out.print("Enter Item Name: ");
        String item = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        fo.placeOrder(item, qty);

        System.out.println("\n1. Generate Bill");
        System.out.println("2. Cancel Order");

        int choice = sc.nextInt();

        if(choice == 1) {
            fo.generateBill();
        }
        else if(choice == 2) {
            System.out.print("Enter Order ID to cancel: ");
            int id = sc.nextInt();
            fo.cancelOrder(id);
        }
        else {
            System.out.println("Invalid Choice");
        }
    }
}