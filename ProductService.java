public interface ProductService {
    void createProduct(String code, String name, double price);
    void updatePrice(String code, double newPrice);
    Product getProduct(String code);
}

