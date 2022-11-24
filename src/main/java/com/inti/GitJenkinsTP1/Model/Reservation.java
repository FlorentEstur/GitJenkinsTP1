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
	@JoinTable (name = "avisHotel",
	joinColumns = @JoinColumn(name = "idVoyageur"),
	inverseJoinColumns =   @JoinColumn(name = "idHotel"))
	private Hotel hotel;
	
}
