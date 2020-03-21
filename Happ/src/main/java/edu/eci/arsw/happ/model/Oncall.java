package edu.eci.arsw.happ.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Oncall {
	
    private long oncallId;	
	
	private int nurseId;
	
	private int blockCode;	
	
	private Timestamp oncallstrart; 
	
	private Timestamp oncallsend; 
	
	public Oncall() {}

	public long getOncallId() {
		return oncallId;
	}

	public void setOncallId(long oncallId) {
		this.oncallId = oncallId;
	}

	public int getNurseId() {
		return nurseId;
	}

	public void setNurseId(int nurseId) {
		this.nurseId = nurseId;
	}	

	public int getBlockCode() {
		return blockCode;
	}

	public void setBlockCode(int blockCode) {
		this.blockCode = blockCode;
	}

	public Timestamp getOncallstrart() {
		return oncallstrart;
	}

	public void setOncallstrart(Timestamp oncallstrart) {
		this.oncallstrart = oncallstrart;
	}

	public Timestamp getOncallsend() {
		return oncallsend;
	}

	public void setOncallsend(Timestamp oncallsend) {
		this.oncallsend = oncallsend;
	}
	
}
