package edu.eci.arsw.happ.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Procedure {
	
    private long id;
	
	private String name;
	
	private String description;

	private List<Undergoes> undergoes;
	

	public Procedure(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public Procedure(){}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Undergoes> getUndergoes() {
		return undergoes;
	}

	public void setUndergoes(List<Undergoes> undergoes) {
		this.undergoes = undergoes;
	}	
	
}
