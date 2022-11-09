package com.mdorici.crudclient.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import com.mdorici.crudclient.entities.Client;

public class ClientDTO {

	private Long id;
	
	@Size(min = 3, max = 80, message = "O nome precisa ter de 3 a 80 caracteres.")
	@NotBlank(message = "Campo obrigatório!")
	private String name;
	
	@Size(min = 11, max = 11, message = "CPF inválido!")
	@NotBlank(message = "Campo obrigatório!")
	private String cpf;
	
	private Double income;
	
	@PastOrPresent(message = "Data inválida!")
	private LocalDate birthDate;
	
	private Integer children;

	public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthDate = birthDate;
		this.children = children;
	}

	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		income = entity.getIncome();
		birthDate = entity.getBirthDate();
		children = entity.getChildren();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getIncome() {
		return income;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Integer getChildren() {
		return children;
	}

}
