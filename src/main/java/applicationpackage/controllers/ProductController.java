package applicationpackage.controllers;

import applicationpackage.data.Product;
import applicationpackage.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("product")
    public String getProducts(Model model){
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products",products);
        return "product";
    }

    @GetMapping("productbs")
    public String getProductsBS(Model model){
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products",products);
        return "index";
    }


}
