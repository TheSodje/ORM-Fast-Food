package entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private Long id;
    private String order_code;
    private Long quantity;
    private String status;
    private Date date;

    /*--------------------------------------------------MAPPING---------------------------------------------------*/

    @ManyToMany(mappedBy = "order")
    private List<Product> product = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrder_code() {
        return order_code;
    }

    public void setOrder_code(String order_code) {
        this.order_code = order_code;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    MySQL DATETIME format: YYYY-MM-DD hh:mm:ss
//    LocalTime date = LocalTime.now();
    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
    this.date = date;
    }

}



