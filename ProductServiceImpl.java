public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createProduct(String code, String name, double price) {
        Product product = new Product(code, name, price);
        repository.save(product);
    }

    @Override
    public void updatePrice(String code, double newPrice) {
        Product product = repository.findByCode(code);
        if (product != null) {
            product.setPrice(newPrice);
            repository.save(product);
        }
    }

    @Override
    public Product getProduct(String code) {
        return repository.findByCode(code);
    }
}
