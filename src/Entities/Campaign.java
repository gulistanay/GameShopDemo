package Entities;

import java.time.LocalDate;

public class Campaign extends Game{
	private int id;
	private double discountRate;   
	private String name;
	private LocalDate dateOfStart;
	private LocalDate dateOfEnd;
	
	public Campaign() {}

	public Campaign(int id, double discountRate, String name, LocalDate dateOfStart, LocalDate dateOfEnd) {
		super();
		this.id = id;
		this.discountRate = discountRate;
		this.name = name;
		this.dateOfStart = dateOfStart;
		this.dateOfEnd = dateOfEnd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDiscountRate() {
		return discountRate;		
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfStart() {
		return dateOfStart;
	}

	public void setDateOfStart(LocalDate dateOfStart) {
		this.dateOfStart = dateOfStart;
	}

	public LocalDate getDateOfEnd() {
		return dateOfEnd;
	}

	public void setDateOfEnd(LocalDate dateOfEnd) {
		this.dateOfEnd = dateOfEnd;
	}
	
	
	
}
