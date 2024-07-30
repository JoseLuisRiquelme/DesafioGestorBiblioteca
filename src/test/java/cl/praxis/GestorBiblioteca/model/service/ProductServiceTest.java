package cl.praxis.GestorBiblioteca.model.service;

import cl.praxis.GestorBiblioteca.model.dto.Libro;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.*;

import java.util.List;

@SpringBootTest
public class ProductServiceTest {
    private ProductServiceImpl service = new ProductServiceImpl();


    @Test
    @DisplayName("should return all books")
    void getAllTest() {

        List<Libro> listaLibros = service.getAll();
        assertNotNull("is not NUll", service);
        assertEquals("Products 'libros' in the list: " + listaLibros.size(), 4, listaLibros.size());
        for(Libro libro : listaLibros) {
            System.out.println(libro);
        }
    }
    @Test
    @DisplayName("should return one books")
    void getOneTest(){
        Libro l=service.getOne(1);
        assertNotNull("should return a book",l);
     }


}
