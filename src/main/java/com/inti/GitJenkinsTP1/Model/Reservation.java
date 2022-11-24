package com.inti.GitJenkinsTP1.Model;

import java.sql.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="reservation_GitJenkins")
@Data @NoArgsConstructor @AllArgsConstructor
public class Reservation {
	@Id
	long idVoyageur;
	Date Voyageur;
	int nbJours;
	
	@ManyToOne
	@JoinTable (name = "reservationHotel",
	joinColumns = @JoinColumn(name = "idReservation"),
	inverseJoinColumns =   @JoinColumn(name = "idHotel"))
	private Reservation reservation;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable (name = "reservationVoyageur",
	joinColumns = @JoinColumn(name = "idReservation"),
	inverseJoinColumns =   @JoinColumn(name = "idVoyageur"))
	private Voyageur voyageur;
}
