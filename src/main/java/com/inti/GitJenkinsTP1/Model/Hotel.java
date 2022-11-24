package com.inti.GitJenkinsTP1.Model;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="hotel_GitJenkins")
@Data @NoArgsConstructor @AllArgsConstructor
public class Hotel {
	@Id
	long idHotel;
	String nom;
	int nbEtoile;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy ="hotel")
	private List<Avis> listeAvis;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy ="reservation")
	private List<Reservation> listeReservation;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable (name = "destinationHotel",
	joinColumns = @JoinColumn(name = "idHotel"),
	inverseJoinColumns =   @JoinColumn(name = "idDestination"))
	private Destination destination;
}
