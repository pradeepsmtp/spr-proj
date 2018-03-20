package pa.spr.vanila;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
public class VanilaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VanilaApplication.class, args);
	}
}

/*@SpringBootApplication
//@Configuration
//@ComponentScan(value={"pa.spr.vanila"})
public class VanilaApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(VanilaApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(VanilaApplication.class, args);
    }
}
*/