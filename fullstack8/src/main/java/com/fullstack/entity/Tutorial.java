package com.fullstack.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name = "tutorials")
public class Tutorial {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "published")
	private boolean published;
	
	@Column(name = "checkIn")
	@JsonFormat
	@JsonSerialize
	private LocalDate checkIn;
	
	@Column(name = "checkOut")
	@JsonFormat
	@JsonSerialize
	private LocalDate checkOut;
	
	@Column(name = "numberClicks")
	private int numberClicks;	
	
	public Tutorial(long id, String title, String description, boolean published, LocalDate checkIn, LocalDate checkOut,
			int numberClicks) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.published = published;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.numberClicks = numberClicks;
	}
	
	public Tutorial(long id, String title, LocalDate checkIn, LocalDate checkOut,int numberClicks) {
		this.id = id;
		this.title = title;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.numberClicks = numberClicks;
	}

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(LocalDate checkOut) {
		this.checkOut = checkOut;
	}

	public int getNumberClicks() {
		return numberClicks;
	}

	public void setNumberClicks(int numberClicks) {
		this.numberClicks = numberClicks;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", description=" + description + ", published=" + published
				+ ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", numberClicks=" + numberClicks + "]";
	}
	
}