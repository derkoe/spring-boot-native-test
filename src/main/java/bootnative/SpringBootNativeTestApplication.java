package bootnative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

@SpringBootApplication
@ImportRuntimeHints({ LiquibaseNativeHints.class, HibernateNativeHints.class, ActuatorNativeHints.class })
public class SpringBootNativeTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNativeTestApplication.class, args);
	}

}
