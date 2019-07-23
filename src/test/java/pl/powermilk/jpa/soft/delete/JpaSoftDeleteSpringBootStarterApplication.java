package pl.powermilk.jpa.soft.delete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.powermilk.jpa.soft.delete.repository.EnableJpaSoftDeleteRepositories;

@SpringBootApplication
@EnableJpaSoftDeleteRepositories
public class JpaSoftDeleteSpringBootStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaSoftDeleteSpringBootStarterApplication.class, args);
	}
}
