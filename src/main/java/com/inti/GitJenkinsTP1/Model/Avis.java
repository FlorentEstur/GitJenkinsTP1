package com.inti.GitJenkinsTP1.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Avis {

	@Id
	long idAvis;
	String commentaire;
}
