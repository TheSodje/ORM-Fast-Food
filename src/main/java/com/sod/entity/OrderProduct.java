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
    @MapsId("order_id")
    private Orders order;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("product_id")
    private Product product;

    @Column(name = "quantity")
    private int quantity;

    // private OrderProduct() {

    // }

    public OrderProduct(Orders order, Product product) {
        this.order = order;
        this.product = product;
        this.id = new OrderProductId(order.getId(), product.getId());
    }

    /*--------------------------------------------------GETTERS & SETTERS---------------------------------------------------*/

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
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
        return Objects.equals(order, that.order) &&
                Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, product);
    }

    /*-----------------------------------------------------------------------------------------------------*/

    @Embeddable
    public class OrderProductId implements Serializable {

        @Column(name = "order_id")
        private Long orderId;

        @Column(name = "product_id")
        private Long productId;

        // private OrderProductId() {
        // }

        public OrderProductId(
                Long orderId,
                Long productId) {
            this.orderId = orderId;
            this.productId = productId;

        }

        /*--------------------------------------------------OVERRIDE---------------------------------------------------*/

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;

            if (o == null || getClass() != o.getClass())
                return false;

            OrderProductId that = (OrderProductId) o;
            return Objects.equals(orderId, that.orderId) &&
                    Objects.equals(productId, that.productId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(orderId, productId);
        }

    }

}
