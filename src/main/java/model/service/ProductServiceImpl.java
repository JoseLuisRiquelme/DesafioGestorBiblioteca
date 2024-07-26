package model.service;

import model.dto.Libro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private List<Libro> products;

    public ProductServiceImpl() {
        products = new ArrayList<Libro>();
        products.add(new Libro(1, "Harry Potter", "Fantasy", "Best history quality"));
        products.add(new Libro(2, "El hombre en el jardin", "Fantasy", "best seller"));
        products.add(new Libro(3, "Mandela", "Autobiographical", "Best seller"));
        products.add(new Libro(4, "El principito", "Kids", "The magical history"));
    }

    public ProductServiceImpl(List<Libro> products) {
        this.products = products;
    }

    @Override
    public List<Libro> getAll() {
        return products;
    }

    @Override
    public Libro getOne(int id) {
        return products
                .stream()
                .filter(p->p.getId()==id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean create(Libro l) {
        products.add(l);
        return true;
    }

    @Override
    public boolean upDate(Libro l) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
