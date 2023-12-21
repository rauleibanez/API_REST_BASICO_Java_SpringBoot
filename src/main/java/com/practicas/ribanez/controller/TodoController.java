/************************************************** 
  Name    : "TodoController.java"
  Version : "1.0.0"
  Descripcion : "Controlador Principal - API REST 
                Básico con Mysql"
  Objetivo : "Practica de API Rest con Spring-Boot" 
  Autor    : "ribanez"
  Fecha    : 20/12/2023          
  ------------------------------------------------
  "documentacion": { Curso de API REST AlienExplorer }
 **************************************************   
*/
package com.practicas.ribanez.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practicas.ribanez.model.Task;
import com.practicas.ribanez.repository.TodoRepository;

@RestController
public class TodoController {
	/* INYECCION DE NTERFAZ*/
	@Autowired
	private TodoRepository TodoRepository;
	/***************************************
	 *             ENDPOINTS 
	 * *************************************
	 */
	@GetMapping(value = "/")
	public String holaMundo() {
		return "HOLA MUNDO API REST FULL";
	}
	
	@GetMapping(value = "/tasks")
	public List<Task> getTasks(){
		return TodoRepository.findAll();
	}
	
	@PostMapping(value = "/savetask", consumes = {"*/*"})
	public String saveTask(@RequestBody Task task) {
		TodoRepository.save(task);
		return "Save Task"; 
	}
	
	@PutMapping(value = "/update/{id}", consumes = {"*/*"})
	public String updateTask(@PathVariable long id, @RequestBody Task task) {
		Task updatedTask = TodoRepository.findById(id).get();
		updatedTask.setTitle(task.getTitle());
		updatedTask.setDescription(task.getDescription());
		TodoRepository.save(updatedTask);
		return "Updated Task";
	}

	@DeleteMapping(value = "/delete/{id}")
	public String deleteTask(@PathVariable long id){
		Task deleteTask = TodoRepository.findById(id).get();
		TodoRepository.delete(deleteTask);
		return "Task Deleted";		
	}
}
