
public class Product {

    public Product() {
        System.out.println("Product sınıfı çalıştı");
    }

    private static int id = 1;
    private String name;
    private double price;
    private String category;
    private String campany;
    private String productCode;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getCampany() {
        return this.campany;
    }

    public void setCampany(String campany) {
        this.campany = campany;
    }

    public int getId() {
        return Product.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void idArttir() {
        id++;
    }

}
