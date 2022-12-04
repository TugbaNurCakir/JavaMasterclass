package Java_book_practices.OOP.Ornek1;

public class Textile extends Product{
    private String productSize;
    private String productType;

    public Textile(String productName, double productPrice, String productSize, String productType){
        super(productName, productPrice);
        this.productSize = productSize;
        this.productType = productType;
    }

    @Override
    protected double calculateVAT(){
        return productPrice * 1.05;
    }
}