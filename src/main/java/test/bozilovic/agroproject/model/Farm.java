package test.bozilovic.agroproject.model;

import javax.persistence.*;

@Entity
@Table(name="farms")
public class Farm {
	
	@Id
	@Column(name="farm_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String address;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="account_id")
	private Account account;

	public Farm(Long id, String name, String address, Account account) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.account = account;
	}

	public Farm() {
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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Farm [id=" + id + ", name=" + name + ", address=" + address + ", account=" + account + "]";
	}

}
