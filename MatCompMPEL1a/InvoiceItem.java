package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1a;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice){
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }
    public String getId(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int newQty){
        this.qty=newQty;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(double newUnitPrice){
        this.unitPrice=newUnitPrice;
    }
    public double getTotal(){
        return qty*unitPrice;
    }
    public String toString(){
        return "Invoice item[id="+id+", desc="+desc+", qty="+qty+", unitPrice="+unitPrice+"]";
    }
}
