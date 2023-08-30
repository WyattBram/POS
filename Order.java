public class Order {
    private int orderid;
    private static int id_list = 1;
    public boolean ready;
    public String[] items;

    Order(){
        setId(id_list++);

        ready = false;
        items = new String[3];


    }
//need setter in here
    Order(String[] passed){
        setId(id_list++);

        ready = false;
        items = passed;

    }

    public int getId(){
        return orderid;
    }

    public void setId(int id){
        orderid = id_list++;
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
