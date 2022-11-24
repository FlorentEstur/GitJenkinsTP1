package com.inti.GitJenkinsTP1.Model;

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
}
