package cl.praxis.GestorBiblioteca;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestorBibliotecaApplication implements CommandLineRunner{
	private final static Logger LOG = LoggerFactory.getLogger(GestorBibliotecaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GestorBibliotecaApplication.class, args);
	}

	@Override
	public void run(String... args)throws Exception{
		LOG.info("Se inicio el software");
	}

}
