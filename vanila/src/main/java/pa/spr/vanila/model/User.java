package pa.spr.vanila.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
@Table(schema ="SPR", name = "myuser")
public class User {
	@Id	 
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer user_id;
	@Email(regexp= ".+\\@.+\\..+", message= "Please enter proper email" )
	private String email;
	@Size(min=2, max=11, message=" Need data >{min}& <{max} ")
	private String name;
	private String last_name;
	private String password;

	protected User() {
	}

	public User(String email, String name, String last_name) {
		super();
		this.email = email;
		this.name = name;
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", email=" + email + ", name=" + name + ", last_name=" + last_name
				+ ", password=" + password + "]";
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

}
