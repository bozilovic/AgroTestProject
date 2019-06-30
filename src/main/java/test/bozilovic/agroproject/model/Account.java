package test.bozilovic.agroproject.model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="accounts")
public class Account {

	@Id
	@Column(name="account_id")
	private Long id;
	private String username;
	private String password;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@ManyToMany(mappedBy="accounts")
	private Set<User> users;
	
	@OneToMany(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Farm> farms;

	public Account(Long id, String username, String password, Customer customer, Set<User> users, Set<Farm> farms) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.customer = customer;
		this.users = users;
		this.farms = farms;
	}

	public Account() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Set<Farm> getFarms() {
		return farms;
	}

	public void setFarms(Set<Farm> farms) {
		this.farms = farms;
	}

	@Override
	public String toString() {
		return "Account: " + username + ", property of " + customer;
	}
	
	
}
