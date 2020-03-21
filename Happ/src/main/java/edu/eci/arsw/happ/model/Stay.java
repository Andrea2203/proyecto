package edu.eci.arsw.happ.model;

import java.sql.Timestamp;
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
public class Stay {
	
	private int stayId;
	
	private int patientId;
	
	private int bedId;
	
	private Timestamp startTime;
	
	private Timestamp endTime;	
	
	private List<Undergoes> undergoes;
	
	public Stay() {}

	public int getStayId() {
		return stayId;
	}

	public void setStayId(int stayId) {
		this.stayId = stayId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getBedId() {
		return bedId;
	}

	public void setBedId(int bedId) {
		this.bedId = bedId;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public List<Undergoes> getUndergoes() {
		return undergoes;
	}

	public void setUndergoes(List<Undergoes> undergoes) {
		this.undergoes = undergoes;
	}

}
