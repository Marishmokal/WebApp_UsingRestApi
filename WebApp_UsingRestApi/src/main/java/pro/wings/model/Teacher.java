package pro.wings.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Teacher implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4161439426244216426L;
	@Id
	private int id;
	@Column
	private long phone;
	@Column
	private String name;
	@OneToOne(targetEntity = Address.class,cascade = CascadeType.ALL)
	@JoinColumn(name="addressId")
	@JsonManagedReference
	private Address address;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int id, long phone, String name, Address address) {
		super();
		this.id = id;
		this.phone = phone;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", phone=" + phone + ", name=" + name + ", address=" + address + "]";
	}

	
	
}
