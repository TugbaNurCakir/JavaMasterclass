package Java_book_practices.OOP.Ornek1;

public class Product {
    public String productName;
    public double productPrice;

     public Product(String productName, double productPrice){
        this.productName=productName;
        this.productPrice=productPrice;
    } 

    protected double calculateVAT(){
        return productPrice * 1.08;
    }
}