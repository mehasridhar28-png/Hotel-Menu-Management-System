import java.util.Scanner;

public class HOTELMENUCARD{
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice, item, qty;
        double price = 0, total = 0, bill = 0;
        String itemName = "";

        System.out.println("********************************");
        System.out.println("     WELCOME TO THANA'S HOTEL");
        System.out.println("********************************");

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Mobile Number: ");
        long mobile = sc.nextLong();

        System.out.println("\n1. Veg");
        System.out.println("2. Non-Veg");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("\n--- VEG MENU ---");
                System.out.println("1. Gobi Fried Rice - Rs.120");
                System.out.println("2. Naan & Paneer Butter Masala - Rs.180");
                System.out.println("3. Full Meals - Rs.150");
                System.out.print("Select Item: ");
                item = sc.nextInt();

                switch (item) {
                    case 1:
                        itemName = "Gobi Fried Rice";
                        price = 120;
                        break;
                    case 2:
                        itemName = "Naan & Paneer Butter Masala";
                        price = 180;
                        break;
                    case 3:
                        itemName = "Full Meals";
                        price = 150;
                        break;
                    default:
                        System.out.println("Invalid Item");
                        return;
                }
                break;

            case 2:
                System.out.println("\n--- NON-VEG MENU ---");
                System.out.println("1. Chicken Biryani - Rs.250");
                System.out.println("2. Chicken Fried Rice - Rs.180");
                System.out.println("3. Mandi - Rs.300");
                System.out.print("Select Item: ");
                item = sc.nextInt();

                switch (item) {
                    case 1:
                        itemName = "Chicken Biryani";
                        price = 250;
                        break;
                    case 2:
                        itemName = "Chicken Fried Rice";
                        price = 180;
                        break;
                    case 3:
                        itemName = "Mandi";
                        price = 300;
                        break;
                    default:
                        System.out.println("Invalid Item");
                        return;
                }
                break;

            default:
                System.out.println("Invalid Choice");
                return;
        }

        System.out.print("Enter Quantity: ");
        qty = sc.nextInt();

        total = price * qty;
        bill = total;

        System.out.println("Item : " + itemName);
        System.out.println("Amount : Rs." + total);

        
        System.out.print("\nDo you want another item? (1-Yes / 2-No): ");
        int again = sc.nextInt();

        if (again == 1) {

            System.out.println("\n1. Veg");
            System.out.println("2. Non-Veg");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- VEG MENU ---");
                    System.out.println("1. Gobi Fried Rice - Rs.120");
                    System.out.println("2. Naan & Paneer Butter Masala - Rs.180");
                    System.out.println("3. Full Meals - Rs.150");
                    System.out.print("Select Item: ");
                    item = sc.nextInt();

                    if (item == 1)
                        price = 120;
                    else if (item == 2)
                        price = 180;
                    else if (item == 3)
                        price = 150;
                    else {
                        System.out.println("Invalid Item");
                        return;
                    }
                    break;

                case 2:
                    System.out.println("\n--- NON-VEG MENU ---");
                    System.out.println("1. Chicken Biryani - Rs.250");
                    System.out.println("2. Chicken Fried Rice - Rs.180");
                    System.out.println("3. Mandi - Rs.300");
                    System.out.print("Select Item: ");
                    item = sc.nextInt();

                    if (item == 1)
                        price = 250;
                    else if (item == 2)
                        price = 180;
                    else if (item == 3)
                        price = 300;
                    else {
                        System.out.println("Invalid Item");
                        return;
                    }
                    break;

                default:
                    System.out.println("Invalid Choice");
                    return;
            }

            System.out.print("Enter Quantity: ");
            qty = sc.nextInt();

            total = price * qty;
            bill = bill + total;
        }

        System.out.println("\n========== FINAL BILL ==========");
        System.out.println("\n========== FINAL BILL ==========");
        System.out.println("Customer Name : " + name);
        System.out.println("Mobile Number : " + mobile);
        System.out.println("Total Bill    : Rs." + bill);
        System.out.println("================================");
        System.out.println("Thank You! Visit Again!");
        
    
        sc.close();
    }
}