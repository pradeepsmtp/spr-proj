package pa.spr.vanila;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import pa.spr.vanila.demo.DatabaseDemo;
import pa.spr.vanila.repo.UserRepo;

@SpringBootApplication
public class CommandLineApp implements CommandLineRunner {


	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private UserRepo userrepo;
	
 

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CommandLineApp.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		
	//	DatabaseDemo db = new DatabaseDemo();		 
	//	db.doDemo(jdbcTemplate, userrepo );
	}

}
