package com.hotel.model;
import javax.persistence.*;

@Table(name="Hotel")
@Entity
public class Hotel
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private String food;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	
	@Override
	public String toString() {
		return "Hotel{"+
		       "id="+ id +
		       ", Food="+food+"}";
		
	}
	
	
}