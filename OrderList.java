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
        int swap = 0;
        while (swap == 0) {
            swap = 1;
            for (int i = 1; i < orderList.length; i++) {
                if (orderList[i].order_id < orderList[i].order_id) {
                    swap = 0;
                    int temp = orderList[i].order_id;
                    orderList[i].order_id = orderList[i].order_id;
                    orderList[i].order_id = temp;
                }

            }


        }
    }

    public String printOrder(int id) {
        for (int i = 0; i< orderList.length; i++) {
            if (orderList[i].order_id == id) {
                return orderList[i].toString();
            }
        }
    }

    public String printOrders() {
    ///wtff
        String[] mainList = sortOrder();
        String[] ready = new String[orderList.length];
        String[] preparing = new String[orderList.length];
        int amtInReady = 0;
        int amtInPreparing = 0;

        for(int i = 0; i< mainList.length; i++){
            if (mainList[i].ready = true){
                ready[amtInReady] = mainList[i];
                amtInReady++;
            }
            else if (mainList[i].ready = false);
                preparing[amtInPreparing] = mainList[i];
                amtInPreparing++;
        }



    }


}
