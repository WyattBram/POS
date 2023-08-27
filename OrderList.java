public class OrderList {
    private Order[] orderList = new Order[1];

    public void addOrder(Order order) {
        int position = -1;

        for (int i = 0; i< orderList.length; i++) {
            if (orderList[i] == null) {
                position = i;
                orderList[i] = order;
                break;
            }
        }
        if (position == -1) {
            Order[] temp = new Order[orderList.length*2];
            for (int c = 0; c < orderList .length; c++){
                temp[c] = orderList[c];
            }
            orderList = temp;
            temp[temp.length / 2] = order;

        }
    }

    public void removeOrder(int id) {
        for (int i = 0; i< orderList.length; i++) {
            if (orderList[i].order_id == id) {
                orderList[i] = null;
            }
        }    
    }

    public void readyOrder(int id) {
        for (int i = 0; i< orderList.length; i++) {
            if (orderList[i].order_id == id) {
                orderList[i].ready = true;
            }

        }
    }

    private void sortOrder() {

    }

    public String printOrder(int id) {
        //def not working
        for (int i = 0; i< orderList.length; i++) {
            if (orderList[i].order_id == id) {
                //return to string shit;
            }
        }
    }

    public String printOrders() {

    }
        

}

