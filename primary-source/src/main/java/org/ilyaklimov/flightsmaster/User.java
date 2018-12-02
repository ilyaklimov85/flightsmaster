package org.ilyaklimov.flightsmaster;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class User implements Serializable{
	private static final long serialVersionUID = 7941191825619282400L;
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	//TODO think about secure way to authenticate users
	private String login;
	private String password;

}
