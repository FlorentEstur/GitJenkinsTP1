package com.inti.GitJenkinsTP1.Model;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Destination {
	
	@Id
	long idDestination;
	long longitude;
	long latitude;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "Destination")
	private List<Hotel> listeHotel;
}
