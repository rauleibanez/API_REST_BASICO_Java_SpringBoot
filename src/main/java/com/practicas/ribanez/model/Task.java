/************************************************** 
  Name    : "Task.java"
  Version : "1.0.0"
  Descripcion : "Clase del Modelo de  Datos para la API-REST"
  Objetivo : "Practica de API Rest con Spring-Boot" 
  Autor    : "ribanez"
  Fecha    : 20/12/2023          
  ------------------------------------------------
  "documentacion": { Curso de API REST AlienExplorer }
 **************************************************   
*/
package com.practicas.ribanez.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "TaskCrud")
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private Long id;
	@Column
	private String title;
	@Column
	private String description;
	/**
	 * CONSTRUCTOR
	 */
	public Task(Long id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	/**
	 * CONSTRUCTOR VACIO
	 */
	public Task() {		
	}
	/**
	 * GETTERS Y SETTERS
	 */
	public Long getId() {
		return id;
	}	
	public void setId(Long id) {
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
	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", description=" + description + "]";
	}	
	
}
