package edu.eci.arsw.happ.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Nurses {
	
	private int nurseId;
	
	private User users;
	
	private String name;
	
	private String rh;
	
	private boolean registered = true;
	
	private String position;
	
	private List<Oncall> OncallId;
	
	private List<Undergoes> undergoes;

	public Nurses( String name, String rh, String position) {

		this.name = name;
		this.rh = rh;
		this.position = position;
	}
	
	public Nurses() {}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRh() {
		return rh;
	}

	public int getNurseId() {
		return nurseId;
	}

	public void setNurseId(int nurseId) {
		this.nurseId = nurseId;
	}

	public void setRh(String rh) {
		this.rh = rh;
	}

	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean registered) {
		this.registered = registered;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public List<Oncall> getOncallId() {
		return OncallId;
	}

	public void setOncallId(List<Oncall> oncallId) {
		OncallId = oncallId;
	}

	public List<Undergoes> getUndergoes() {
		return undergoes;
	}

	public void setUndergoes(List<Undergoes> undergoes) {
		this.undergoes = undergoes;
	}	
}
