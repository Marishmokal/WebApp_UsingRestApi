package pro.wings.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Address {

	@Id
	private int addressId;
	@Column
	private int pin;
	@Column
	private String city;
	
	private String subject;
	
	
	@OneToOne(targetEntity = Teacher.class,mappedBy = "address")
	@JsonBackReference
	Teacher teacher;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int addressId, int pin, String city, String subject, Teacher teacher) {
		super();
		this.addressId = addressId;
		this.pin = pin;
		this.city = city;
		this.subject = subject;
		this.teacher = teacher;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", pin=" + pin + ", city=" + city + ", subject=" + subject
				+ ", teacher=" + teacher + "]";
	}
	
	
	
}
