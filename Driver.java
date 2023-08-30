import java.util.Scanner;

public class Driver {
    OrderList restaurantOrders;



    public static void main(String[] args){

        int choice;
        String newChoice;


//fix this shittttttttttttttttttttttttttttttttttt fuck
        do{

            System.out.println("1- Create order\n" +
                    "2- Delete order\n" +
                    "3- Ready order\n" +
                    "4- Print order\n" +
                    "5- Print all orders\n" +
                    "6- Exit");
            Scanner x = new Scanner (System.in);
            choice = x.nextInt();

            if (choice == 1){
                String[] array = new String[3];
                for(int i = 0; i < 3; i++) {
                    newChoice = x.nextLine();
                    array[i] = newChoice;
                    System.out.println("Enter item " + (i + 1) + ": ");

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
                restaurantOrders.printOrder(x.nextInt());
            }

            else if (choice == 5){
                restaurantOrders.printOrders();
            }


        }while (choice != 6);
    }
}