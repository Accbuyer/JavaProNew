package courses.Payment_Service.controller;
import courses.Payment_Service.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import src.main.java.courses.Product_Service.dto.Product;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/payments")
@Slf4j
public class PaymentController {

    private final PaymentService paymentService;


    @GetMapping
    public List<Product> getProducts()  {
        return paymentService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product selectProduct(@PathVariable Long id) {
        return paymentService.selectProduct(id);

    }



}
