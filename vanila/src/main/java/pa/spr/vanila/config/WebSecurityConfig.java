package pa.spr.vanila.config;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
//@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
/*		http.authorizeRequests().antMatchers("/lab/*").authenticated()
			 .antMatchers("/admin/*").access("hasRole('ADMIN')" )
			.and().formLogin().permitAll()
			.and().logout().logoutUrl("/nonsec/land").permitAll()
			.and().exceptionHandling().accessDeniedPage("/403");*/
		
		
		
		// .antMatchers("/nonsec/*").permitAll()
		// .and()
		// .formLogin();
		// .anyRequest().authenticated()
		/*
		 * .and() .formLogin() .loginPage("/login") .permitAll() .and() .logout()
		 * .permitAll();
		 */
	}

	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		UserDetails user = User.withDefaultPasswordEncoder().username("user").password("password").roles("USER")
				.build();
		UserDetails admin = User.withDefaultPasswordEncoder().username("admin").password("password").roles("ADMIN")
				.build();
		List<UserDetails> ls = new ArrayList<>();
		ls.add(user);ls.add(admin);

		return new InMemoryUserDetailsManager(ls);
	}
}