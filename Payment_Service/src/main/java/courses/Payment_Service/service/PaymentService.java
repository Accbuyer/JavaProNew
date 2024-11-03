package courses.Payment_Service.service;

import courses.Payment_Service.error.IntegrationException;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import src.main.java.courses.Product_Service.dto.Product;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PaymentService {
    private final String url = "/products";

    private final RestTemplate restTemplate;

    public List<Product> getAllProducts() {

         ResponseEntity<List<Product>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                }
        );
         return response.getBody();
    }
    public Product selectProduct(Long id) {
         ResponseEntity<Product> response = restTemplate.exchange(
                url + "/" + id,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                }
        );

         if(response.getBody().getBalance() <= 0) {
             throw new IntegrationException("Недостаточно средств", "404");
         }

         if(response.getBody() == null) {
             throw new IntegrationException("Объект не существует", "404");
         }

         return response.getBody();
    }

}
