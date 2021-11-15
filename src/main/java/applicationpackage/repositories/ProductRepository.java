package applicationpackage.repositories;

import applicationpackage.data.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findProductByBrand(String brand);

    @Query("Select p From Product p Where p.brand = :brand")
    List<Product> findTheProductsByBrand(@Param("brand") String brand);



}
