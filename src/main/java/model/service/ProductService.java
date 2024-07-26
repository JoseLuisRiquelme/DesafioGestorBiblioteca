package model.service;

import model.dto.Libro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public interface ProductService {



   List<Libro> getAll();
   Libro getOne(int id);
   boolean create(Libro l );
   boolean upDate(Libro l);
   boolean delete(int id);


}
