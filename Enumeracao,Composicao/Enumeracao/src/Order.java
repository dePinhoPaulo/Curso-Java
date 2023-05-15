
import enumeracao.entities.OrdersStatus;
import java.util.Date;

public class Order {
    private Integer id;
    private Date moment;
    private OrdersStatus status;
    
    public Order () {
        
    }

    public Order(Integer id, Date moment, OrdersStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public Date getMoment() {
        return moment;
    }

    public OrdersStatus getStatus() {
        return status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public void setStatus(OrdersStatus status) {
        this.status = status;
    }
    
    
}
