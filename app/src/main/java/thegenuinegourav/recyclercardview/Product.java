package thegenuinegourav.recyclercardview;

public class Product {


    public Product(String title, String id, String status)
    {
        this.name = title;
        this.product_id = id;
        this.status = status;
    }

    private String name, product_id, status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
