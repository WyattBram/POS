public class OrderList {
    private Order[] orderList;

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
            if (orderList[i].getId() == id) {
                orderList[i] = null;
            }
        }
    }

    public void readyOrder(int id) {
        for (int i = 0; i< orderList.length; i++) {
            if (orderList[i].getId() == id) {
                orderList[i].ready = true;
            }

        }
    }
//look at this again to understand instance
    private void sortOrder() {
        int swap = 0;
        while (swap == 0) {
            swap = 1;
            for (int i = 1; i < orderList.length; i++) {
                if (orderList[i].getId() < orderList[i - 1].getId()) {
                    swap = 0;
                    Order temp = orderList[i];
                    orderList[i] = orderList[i - 1];
                    orderList[i - 1] = temp;
                }

            }


        }
    }




    public String printOrder(int id) {
        sortOrder();
        for (int i = 0; i< orderList.length; i++) {
            if (orderList[i].getId() == id) {
                return orderList[i].toString();
            }
        }
        return "fuck shit";
    }

    public String printOrders() {

        sortOrder();
        String[] ready = new String[orderList.length];
        String[] preparing = new String[orderList.length];
        int amtInReady = 0;
        int amtInPreparing = 0;

        for(int i = 0; i< orderList.length; i++){
            if (orderList[i].ready){
                ready[amtInReady] = String.valueOf(orderList[i].getId());
                amtInReady++;
            }
            else if (!orderList[i].ready);
            preparing[amtInPreparing] = String.valueOf(orderList[i].getId());
            amtInPreparing++;
        }

        return "Ready\n" + ready + "Preparing\n" + preparing;

    }


}
