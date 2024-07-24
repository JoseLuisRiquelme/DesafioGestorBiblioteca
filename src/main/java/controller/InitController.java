package controller;

import model.dto.Libro;
import model.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class InitController {

    private final ProductService service;
    @Autowired
    public InitController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public String products(Model model) {
        List<Libro> productsList = service.getAll();
        System.out.println("Number of products: " + productsList.size());
        model.addAttribute("products", productsList);

        return "index";
    }

    @GetMapping("/{id}")
    public String getOne(@PathVariable("id") int id, Model model) {
        // Producto p = new Producto(5,"Teeth Brush","Hygiene","Most durable in the market");
        model.addAttribute("product", service.getOne(id));
        return "productDetails";
    }

}
