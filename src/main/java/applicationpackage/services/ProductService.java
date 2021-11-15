package applicationpackage.services;

import applicationpackage.data.Product;
import applicationpackage.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void createProduct(Product product){
        productRepository.save(product);
    }

    public List <Product> getAllProducts(){
        List<Product> list = new ArrayList<>();
        productRepository.findAll().forEach(e -> list.add(e));
        return list;
    }

    public Optional<Product> getProductById(int id){
        return productRepository.findById(id);
    }
}
