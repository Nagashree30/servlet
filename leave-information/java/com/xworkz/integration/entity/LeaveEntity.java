package com.xworkz.integration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "information")
public class LeaveEntity {
	@Id
	@Column(name = "ID")
	private int id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "NoOFLeaves")
	private String num;

	@Column(name = "REASON")
	private String reason;

	@Column(name = "DATE")
	private String date;

}
