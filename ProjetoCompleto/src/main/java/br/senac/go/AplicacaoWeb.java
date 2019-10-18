package br.senac.go;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 *
 * @author strike
 */
@SpringBootApplication
public class AplicacaoWeb extends SpringBootServletInitializer {

    public static void main(String... args) {
        SpringApplication.run(AplicacaoWeb.class, args);
    }
}
