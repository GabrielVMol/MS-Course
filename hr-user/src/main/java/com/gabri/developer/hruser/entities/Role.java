package com.gabri.developer.hruser.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                   // Usado para informar que a classe tambem é uma entidade
@Table(name = "tb_role")  // Usado para criar a tabela para gerenciar as chaves primarias
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id                                                  // Ultilizada para informar ao JPA qual atributo de uma entidade estará relacionado a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // Ultilizada para informar qua a geração do valor do identificador único da entidade será gerenciado pelo hibernate
	private Long id;
	private String roleName;
	
	public Role() {
	}

	public Role(Long id, String roleName) {
		super();
		this.id = id;
		this.roleName = roleName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override  // Reescrever um método que foi herdado
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((roleName == null) ? 0 : roleName.hashCode());
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
		Role other = (Role) obj;
		if (roleName == null) {
			if (other.roleName != null)
				return false;
		} else if (!roleName.equals(other.roleName))
			return false;
		return true;
	}
}