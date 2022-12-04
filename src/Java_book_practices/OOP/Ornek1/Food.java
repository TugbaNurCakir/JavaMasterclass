package Java_book_practices.OOP.Ornek1;

public class Food extends Product{
    private String productType;
    private double productWeight;

    public Food(String productName, double productPrice, String productType, double productWeight){
        super(productName, productPrice);
        this.productType = productType;
        this.productWeight = productWeight;
    }
    protected void printClassName(){
        System.out.println("this is food class");
    }

    @Override
    protected double calculateVAT(){
        return productPrice * 1.06;
    }

    @Override
    public String toString() {
        return this.productName + " + " + this.productPrice + " + " + this.productType + " + " + this.productWeight;
    }
}
