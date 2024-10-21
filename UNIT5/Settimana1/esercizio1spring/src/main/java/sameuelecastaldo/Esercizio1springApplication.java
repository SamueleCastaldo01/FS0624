package sameuelecastaldo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sameuelecastaldo.entities.Menu;

@SpringBootApplication
public class Esercizio1springApplication {

	public static void main(String[] args) {

		SpringApplication.run(Esercizio1springApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Esercizio1springApplication.class);
		Menu mn = context.getBean(Menu.class);
		System.out.println(mn);

		context.close();
	}

}
