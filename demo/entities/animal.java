package com.pet.demo.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.annotation.Generated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@EntityScan
@Table(name = "Animal")
public class animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private String name;
	private String especie;
	private String idade;
	private String cliente;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String Cliente) {
		this.cliente = cliente;
	}
}
