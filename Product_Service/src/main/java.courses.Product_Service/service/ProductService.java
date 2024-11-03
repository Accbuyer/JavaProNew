package src.main.java.courses.Product_Service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import src.main.java.courses.Product_Service.dto.Product;
import src.main.java.courses.Product_Service.repository.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public void saveProduct(Product product) {
        productRepository.saveProduct(product);
    }

    public Product getProduct(Long id) {
        return productRepository.findProductById(id);

    }

    public List<Product> findAllProducts() {
        return productRepository.findAllProducts();
    }

    public List<Product> findProductsByUserId(Long userId) {
        return productRepository.findProductsByUserId(userId);
    }
}
