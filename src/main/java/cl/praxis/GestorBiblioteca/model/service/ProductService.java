package cl.praxis.GestorBiblioteca.model.service;

import cl.praxis.GestorBiblioteca.model.dto.Libro;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {



   List<Libro> getAll();
   Libro getOne(int id);
   boolean create(Libro l );
   boolean upDate(Libro l);
   boolean delete(int id);


}
