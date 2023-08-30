public class OrderList {
    private Order[] orderList = new Order[3];

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
                break;
            }
        }
        sortOrder();
    }

    public void readyOrder(int id) {
        for (int i = 0; i< orderList.length; i++) {
            if (orderList[i].getId() == id) {
                orderList[i].ready = true;
                break;
            }

        }
    }
    //this method can suck my nuts
    private void sortOrder() {
        int swap = 0;
        int swapI = 0;


        while (swapI == 0) {
            swapI = 1;
            for(int i=0; i < orderList.length - 1; ++i) {
                if(orderList[i] == null) {
                    orderList[i] = orderList[i+1];
                    orderList[i+1] = null;
                }
            }
        }

        while (swap == 0) {
            swap = 1;

            for (int i = 1; i < orderList.length; i++) {
                if(orderList[i]==null){
                    break;
                }
                else if (orderList[i].getId() < orderList[i - 1].getId()) {
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
        return "";
    }

    public String printOrders() {

        sortOrder();
        String ready = "";
        String preparing = "";

        for(int i = 0; i< orderList.length; i++){

            if (orderList[i] == null){
                break;
            }
            if (orderList[i].ready){
                ready += ""+orderList[i].getId()+"\n";
            }
            else if (!orderList[i].ready){
                preparing += ""+orderList[i].getId()+"\n";
            }
        }

        return "Ready\n" + ready + "Preparing\n" + preparing;

    }


}


}
