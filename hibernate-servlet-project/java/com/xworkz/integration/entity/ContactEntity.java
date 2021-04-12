package com.xworkz.integration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Data
@NoArgsConstructor
@Setter

@Entity
@Table(name="contact")
@NamedQueries({
	@NamedQuery(name = "findByName",query = "select con from  ContactEntity con where con.name=:name"),
	@NamedQuery(name = "findByEmail",query = "select con from  ContactEntity con where con.email=:email"),
	@NamedQuery(name = "findAll",query = "select con from ContactEntity con")
})
public class ContactEntity {
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PHONE")
	private String phone;
	
	@Column(name="COMPANY")
	private String company;
	
	@Column(name="ABOUT")
	private String about;
	
}

