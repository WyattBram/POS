public class Order {
    private int orderid;
    private static int id_list = 1;
    public boolean ready;
    public String[] items;

    Order(){
        orderid = id_list++;

        ready = false;
        items = new String[3];


    }
    //need setter in here
    Order(String[] passed){
        orderid = id_list++;

        ready = false;
        items = passed;

    }

    public int getId(){
        return orderid;
    }


    @Override
    public String toString(){
        String reasdd = "Not ready";
        if(ready){
            reasdd = "Ready";
        }
        if (items.length == 1){
            return "Order number: " + getId() + "\n" + reasdd + "\n" + items[0];
        }
        else if (items.length == 2){
            return "Order number: " + getId() + "\n" + reasdd + "\n" + items[0] + "\n" + items[1];
        }
        else{
            return "Order number: " + getId() + "\n" + reasdd + "\n" + items[0] + "\n" + items[1] + "\n" + items[2];
        }
    }


}



}
