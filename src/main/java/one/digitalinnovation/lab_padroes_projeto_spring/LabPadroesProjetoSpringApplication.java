package one.digitalinnovation.lab_padroes_projeto_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database (http://localhost:8080/h2-console)
 * - OpenFeign
 * - Open Api Swagger ( http://localhost:8080/swagger-ui/index.html )
 * -
 *  @author aryvitorss
 *  @see <a href="https://viacep.com.br">ViaCEP</a>
 *  *
 */
@SpringBootApplication
@EnableFeignClients
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
	}

}
