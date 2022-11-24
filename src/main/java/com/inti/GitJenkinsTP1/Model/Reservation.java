package com.inti.GitJenkinsTP1.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Reservation {

	@Id
	long idVoyageur;
	Date dateReservation;
	int nbJours;
}
