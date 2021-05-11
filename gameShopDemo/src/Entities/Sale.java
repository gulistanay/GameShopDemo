package Entities;

import java.time.LocalDate;

import Abstract.Entity;

public class Sale implements Entity{
	private int id;
	private double totalPrice;
	private LocalDate dateOfSales;
	private boolean active;
	Gamer gamer;
	Game[] games;
	
	public Sale() {}

	public Sale(int id, double totalPrice, LocalDate dateOfSales, boolean active, Gamer gamer, Game[] games) {
		super();
		this.id = id;
		this.totalPrice = totalPrice;
		this.dateOfSales = dateOfSales;
		this.active = active;
		this.gamer = gamer;
		this.games = games;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTotalPrice() {
		
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public LocalDate getDateOfSales() {
		return dateOfSales;
	}

	public void setDateOfSales(LocalDate dateOfSales) {
		this.dateOfSales = dateOfSales;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Gamer getGamer() {
		return gamer;
	}

	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}

	public Game[] getGames() {
		return games;
	}

	public void setGames(Game[] games) {
		this.games = games;
	}
	
}
