package samuelecastaldo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import samuelecastaldo.entities.Menu;

@SpringBootApplication
public class Giorno2Application {

	public static void main(String[] args) {


		SpringApplication.run(Giorno2Application.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Giorno2Application.class);
		Menu mn = context.getBean(Menu.class);
		System.out.println(mn);

		context.close();
	}

}
