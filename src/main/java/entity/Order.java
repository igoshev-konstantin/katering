package entity;

import java.util.Date;
import java.util.List;

public class Order {
    private short orderNumber;
    private Customer customer;
    private Date orderDate;
    private Cook cook;
    private List<Dish> dishList;
    private enum OrderStatus{NEW, IN_PROCESS, DONE}

    public double calculateCost(){
        return 0;
    }

    public void setReview(){}

    public void cancelOrder(){}
}
