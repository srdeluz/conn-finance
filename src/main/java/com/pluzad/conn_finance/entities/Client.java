package com.pluzad.conn_finance.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_client")
public class Client implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String street;
	private Integer number;
	private String district;
	private String city;
	private String observation;
	private Boolean active;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant registered;
	
	@JsonIgnore
	@OneToMany(mappedBy = "client")
	private List<Order> orders;
	
	public Client() {
		
	}
	
	

	public Client(Long id, String name, String email, String phone, String street, Integer number, String district,
			String city, String observation, Boolean active, Instant registered) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.street = street;
		this.number = number;
		this.district = district;
		this.city = city;
		this.observation = observation;
		this.active = active;
		this.registered = registered;
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Instant getRegistered() {
		return registered;
	}

	public void setRegistered(Instant registered) {
		this.registered = registered;
	}

	public List<Order> getOrders() {
		return orders;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
