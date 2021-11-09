package Entity;

import org.mongodb.morphia.annotations.Entity;

import persistence.PersistentEntity;

@Entity(value = "users", noClassnameStored = true)
public class UserEntity extends PersistentEntity{
	
	private String firstname;
	private String lastName;
	private String email;
	private String password;
	private String username;
	
	public UserEntity() {
		super();
	}
	public UserEntity(String firstname, String lastName, String email, String password, String username) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "UserEntity [firstname=" + firstname + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", username=" + username + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
}
