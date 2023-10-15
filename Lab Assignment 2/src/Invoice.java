public class Invoice {
    //properties
    int id;
    int quantity;
    double unitPrice;
    String description = " ";
    boolean paid;

    //constructor
    Invoice(int Id, int Quantity, double UnitPrice, String d ) {
        id = Id;
        quantity = Quantity;
        unitPrice = UnitPrice;
        description = d;
        paid = false;
    }
    //to String() method
    public String toString() {
        return "InvoiceItem[id= " + id + ",description= " + description + ",quantity= "+ unitPrice + ", paid= " +paid;
    }
    public void setPaid(boolean paid) {
        if(paid = true) {
            this.paid = true;
        }
        else{
            this.paid = false;
        }
    }
    public boolean getPaid() {return paid;}
}
