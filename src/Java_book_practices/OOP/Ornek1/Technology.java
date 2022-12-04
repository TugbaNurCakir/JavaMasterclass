package Java_book_practices.OOP.Ornek1;

public class Technology extends Product{
    private String productBrand;
    private String productModel;

    public Technology(String productName, double productPrice, String productBrand, String productModel){
        super(productName, productPrice);
        this.productBrand = productBrand;
        this.productModel = productModel;
    }
    @Override
    protected double calculateVAT(){
        return productPrice * 1.04;
    }
}
