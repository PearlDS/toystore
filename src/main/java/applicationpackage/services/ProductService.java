package applicationpackage.services;

import applicationpackage.data.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    void createProduct(Product product);

    List<Product> getAllProducts();

    Optional<Product> getProductById(int id);
}
