package cl.praxis.GestorBiblioteca.controller;

import cl.praxis.GestorBiblioteca.model.dto.Libro;
import cl.praxis.GestorBiblioteca.model.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class LibrosController {

    private  ProductServiceImpl service;

    public LibrosController(ProductServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/")
    public String products(Model model) {
        List<Libro> listaLibros = service.getAll();
        for (Libro l: listaLibros) {
            System.out.println(l.toString());
        }
        model.addAttribute("listaLibros", listaLibros);

        return "index";
    }

    @GetMapping("/{id}")
    public String getOne(@PathVariable("id") int id, Model model) {
        // Producto p = new Producto(5,"Teeth Brush","Hygiene","Most durable in the market");
        model.addAttribute("product", service.getOne(id));
        return "productDetails";
    }

}
