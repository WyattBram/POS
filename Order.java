public class Order {
    private int order_id;
    private static int id_list = 1;
    public boolean ready;
    public String[] items;

    id_assign(){
        order_id = id_list++;

        ready = false;
        items = new String[3];


    }

    id_assign(String[] passed){
        order_id = id_list++;

        ready = false;
        items = passed;

    }

    public int getId(){
        return order_id;
    }

    public String toString(){


        System.out.println("Order number: " + getId() + ready);
        for (int i = 0; i < items.length; i++){
            System.out.println(items[i]);
        }

        return "Order number:" + getId() + ready
    }

    
}
