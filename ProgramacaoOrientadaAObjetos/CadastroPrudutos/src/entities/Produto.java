
package entities;

public class Produto {
    public String name;
    public double price;
    public int quantity;
    
    public double totalPrice(){
        return price * quantity;
    }
    
    public int addQuantity(int quantity){
        return this.quantity += quantity;
    }
    
    public int removeQuantity(int quantity){
        return this.quantity -= quantity;
    }
    
    public String toString(){
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $"
                + String.format("%.2f", totalPrice());
    }
}
