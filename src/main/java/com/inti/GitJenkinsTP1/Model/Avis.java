package com.inti.GitJenkinsTP1.Model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="avis_GitJenkins")
@Data @NoArgsConstructor @AllArgsConstructor
public class Avis {
	@Id
	long idAvis;
	String commentaire;
	
@ManyToOne
@JoinTable (name = "avisHotel",
joinColumns = @JoinColumn(name = "idAvis"),
inverseJoinColumns =   @JoinColumn(name = "idHotel"))
private Hotel hotel;
}
