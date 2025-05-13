public class ConsoleApp {
    public static void main(String[] args) {
        ProductRepository repo = new InMemoryProductRepository();
        ProductService service = new ProductServiceImpl(repo);

        service.createProduct("P001", "Notebook", 3500.00);
        service.updatePrice("P001", 3200.00);

        Product product = service.getProduct("P001");
        System.out.println("Produto: " + product.getName() +
                " | Código: " + product.getCode() +
                " | Preço: R$ " + product.getPrice());
    }
}

