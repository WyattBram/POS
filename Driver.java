import java.util.Scanner;

public class Driver {
    OrderList restaurantOrders;



    public static void main(String[] args){
        OrderList restaurantOrders = new OrderList();
        int choice;
        String newChoice;



        do{

            System.out.println("1- Create order\n" +
                    "2- Delete order\n" +
                    "3- Ready order\n" +
                    "4- Print order\n" +
                    "5- Print all orders\n" +
                    "6- Exit");
            Scanner x = new Scanner (System.in);
            choice = x.nextInt();
            x.nextLine();
            if (choice == 1){
                String[] array = new String[3];
                for(int i = 0; i < 3; i++) {
                    System.out.println("Enter item " + (i + 1) + ": ");
                    newChoice = x.nextLine();
                    array[i] = newChoice;


                }




                Order nes = new Order(array);
                restaurantOrders.addOrder(nes);
            }

            else if (choice == 2){
                System.out.println("Enter item id:");
                restaurantOrders.removeOrder(x.nextInt());
                System.out.println("Order has been removed");
            }

            else if (choice == 3){
                System.out.println("Enter item id:");
                restaurantOrders.readyOrder(x.nextInt());
                System.out.println("Order has been set to “Ready”");
            }

            else if (choice == 4){
                System.out.println("Enter item id:");
                System.out.println(restaurantOrders.printOrder(x.nextInt()));
            }

            else if (choice == 5){
                System.out.println(restaurantOrders.printOrders());
            }


        }while (choice != 6);
    }
}
