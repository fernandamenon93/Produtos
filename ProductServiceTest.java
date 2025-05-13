public class ProductServiceTest {
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class ProductServiceTest {

        @Test
        public void testCreateProduct() {
            ProductRepository repo = new InMemoryProductRepository();
            ProductService service = new ProductServiceImpl(repo);

            service.createProduct("P002", "Teclado", 120.0);
            Product p = repo.findByCode("P002");

            assertNotNull(p);
            assertEquals("Teclado", p.getName());
            assertEquals(120.0, p.getPrice());
        }

        @Test
        public void testUpdatePrice() {
            ProductRepository repo = new InMemoryProductRepository();
            ProductService service = new ProductServiceImpl(repo);

            service.createProduct("P003", "Mouse", 80.0);
            service.updatePrice("P003", 65.0);
            Product p = repo.findByCode("P003");

            assertEquals(65.0, p.getPrice());
        }
    }
