package model.service;

import model.dto.Libro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private static final Logger LOG = LoggerFactory.getLogger(ProductServiceImpl.class);

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
        LOG.info("Initialized ProductServiceImpl with custom products");
    }

    @Override
    public List<Libro> getAll() {
        LOG.info("Called getAll");
        return products;
    }

    @Override
    public Libro getOne(int id) {
        LOG.info("Called getOne() with id:{}",id);
        return products
                .stream()
                .filter(p->p.getId()==id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean create(Libro l) {
        LOG.info("Called create() with Libro:{}",l);
        products.add(l);
        return true;
    }

    @Override
    public boolean upDate(Libro l) {
        LOG.info("Called upDate() with Libro:{}",l);
        return false;
    }

    @Override
    public boolean delete(int id) {
        LOG.info("Called delete() with id:{}",id);
        return false;
    }
}
