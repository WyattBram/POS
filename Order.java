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
        if (items.length == 1){
            return "Order number: " + getId() + "\n" + ready + "\n" + items[0];
        }
        else if (items.length == 2){
            return "Order number: " + getId() + "\n" + ready + "\n" + items[0] + "\n" + items[1];
        }
        else{
            return "Order number: " + getId() + "\n" + ready + "\n" + items[0] + "\n" + items[1] + "\n" + items[2];
        }
    }

    
}
