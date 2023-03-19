package com.sod.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity(name = "OrderProduct")
@Table(name = "order_product_new")
public class OrderProduct {

    @EmbeddedId
    private OrderProductId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("orderId")
    private Orders orders;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("productId")
    private Product product;

    @Column(name = "quantity")
    private int quantity;

    public OrderProduct(Orders orders, Product product) {
        this.orders = orders;
        this.product = product;
        this.id = new OrderProductId(orders.getId(), product.getId());
    }

    public OrderProduct() {

    }

    /*--------------------------------------------------GETTERS & SETTERS---------------------------------------------------*/

    public Orders getOrder() {
        return orders;
    }

    public void setOrder(Orders orders) {
        this.orders = orders;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /*--------------------------------------------------OVERRIDE---------------------------------------------------*/

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderProduct that = (OrderProduct) o;
        return Objects.equals(orders, that.orders) &&
                Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders, product);
    }

    /*-----------------------------------------------------------------------------------------------------*/

}
