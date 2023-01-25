package in.revan.reactivespring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

@SpringBootApplication
public class ReactiveSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveSpringApplication.class, args);
	}

	interface ReservationRepository extends ReactiveCrudRepository<Reservation,String>{

	}


	@AllArgsConstructor
	@Data
	@NoArgsConstructor
	@Document
	class Reservation {

		@Id
		private String id;

		private String name;
	}

}
