package com.gabri.developer.hrworker.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                     // Usado para informar que a classe tambem é uma entidade
@Table(name = "tb_worker")  // Usado para criar a tabela para gerenciar as chaves primarias
public class Worker implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id                                                  // Ultilizada para informar ao JPA qual atributo de uma entidade estará relacionado a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // Ultilizada para informar qua a geração do valor do identificador único da entidade será gerenciado pelo hibernate
	private Long id;
	private String name;
	private Double dailyIncome;

	public Worker() {
	}

	public Worker(Long id, String name, Double dailyIncome) {
		super();
		this.id = id;
		this.name = name;
		this.dailyIncome = dailyIncome;
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

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	@Override  // Reescrever um método que foi herdado
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}