package com.example.domain.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * O Entity é utilizado para referenciar a instância do objeto como uma entidade no Spring Boot.
 * O Table é utilizado para criação de uma table no H2Database.
*/

@Entity
@Table(name = "tb_client")
public class Client {
	
	/*
	 * O Id referencia um objeto como o nome de mesmo tipo.
	 * O GeneretedValue cria automaticamente um objeto do tipo Id.
	*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	
	public Client() {
		
	}

	public Client(Long id, String email, String name) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
