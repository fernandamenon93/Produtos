import java.util.List;

public interface ProductRepository {
    void save(Product product);
    Product findByCode(String code);
    List<Product> findAll();
}

