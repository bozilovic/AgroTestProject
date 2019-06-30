package test.bozilovic.agroproject.model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

	@Id
	@Column(name = "customer_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String address;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Account> accounts;

	public Customer(Long id, String name, String address, Set<Account> accounts) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.accounts = accounts;
	}

	public Customer() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return name + ", address: " + address;
	}
	
}
