package com.test.coddix.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Data;

@Entity
@Document(indexName="users")
@Data
@Table(name="users")
public class User {

	@Id
	@Column(name="id", unique=true)
	private String id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
}
