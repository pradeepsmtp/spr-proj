package pa.spr.vanila.demo;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;

import pa.spr.vanila.model.User;
import pa.spr.vanila.repo.UserRepo;



public class DatabaseDemo  {
	


	public void doDemo(JdbcTemplate jdbcTemplate, UserRepo userrepo) {
		
	
		System.out.println(" \nData " + userrepo.findAll());
		// userrepo.findAll().forEach(x -> System.out.println(x));
		Optional<User> u = userrepo.findById(1);
		System.out.println("\n Data " + (u.isPresent() ? u.get() : "U"));

/*		User u2 = new User("tkl@lol.com", "lol", "lol");
		u2.setPassword("JAMAL");
		userrepo.save(u2);
		userrepo.findAll().forEach(x -> System.out.println(x));*/
		
		System.out.println("\n JDBCTEMP ");
		
		List<Map<String, Object>> dt = jdbcTemplate.queryForList("select * from  spr.myuser" );
		dt.forEach(x -> System.out.println(x));
	}
}
