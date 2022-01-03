package tutorial.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Working");
	}

	@Bean
	CommandLineRunner runner(StudentRepository repository){
		return args -> {
			Address address = new Address("USA", "St. Louis", "US2" );
			Student student = new Student(
				"Alex",
				"Ditto",
				"email@mail.com",
				Gender.MALE,
				address,
				List.of("Computer Science"),
				BigDecimal.TEN
			);

			repository.insert(student);
		};
	}

}
