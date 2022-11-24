package com.inti.GitJenkinsTP1.Model;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Voyageur {

	@Id
	long idVoyageur;
	String nom, prenom;
	int age;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "voyageur")
	private List<Reservation> listeReservation;
	
}
