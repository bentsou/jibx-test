package com.bentsou.jibx.test;

import java.util.Date;

/**
 *
 * @author bentsou
 */
public class Order {
    private int id;
    private Date createdDate;
    
    public Order() {
        createdDate = new Date();
    }
    public Order(int orderId) {
        id = orderId;
        createdDate = new Date();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Order {")
                .append("id: " + id)
                .append(", createdDate: " + createdDate)
                .append("}");
        return sb.toString();
    }
}
