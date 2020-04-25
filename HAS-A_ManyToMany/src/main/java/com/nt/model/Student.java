package com.nt.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sttab")
public class Student {
	@Id
	@Column(name = "sid")
	private Integer stdId;
	@Column(name = "sname")
	private String stdName;
	@Column(name = "smail")
	private String stdmail;
	@ManyToMany
	@JoinTable(name = "scrtab", joinColumns = @JoinColumn(name = "sidfk"), inverseJoinColumns = @JoinColumn(name = "cidfk"))
	private List<Course> sobj;//HAS-A

}
