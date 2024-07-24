package model.service;

import model.dto.Libro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {
    private List<Libro> products;

    public ProductService() {
        products = new ArrayList<Libro>();
        products.add(new Libro(1, "Harry Potter", "Fantasy", "Best history quality"));
        products.add(new Libro(2, "El hombre en el jardin", "Fantasy", "best seller"));
        products.add(new Libro(3, "Mandela", "Autobiographical", "Best seller"));
        products.add(new Libro(4, "El principito", "Kids", "The magical history"));

        System.out.println("Products initialized: " + products.size());
    }

    public ProductService(List<Libro> products) {
        this.products = products;
    }
    public List<Libro> getAll() {
        return products;
    }
    public Libro getOne(int id){

        return products
                .stream()
                .filter(p->p.getId()==id)
                .findFirst().orElse(null);
    }
}
