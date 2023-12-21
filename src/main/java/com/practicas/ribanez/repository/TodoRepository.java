/************************************************** 
  Name    : "TodoRepository.java"
  Version : "1.0.0"
  Descripcion : "Interfaz del Modelo de Datos para la API-REST"
  Objetivo : "Practica de API Rest con Spring-Boot" 
  Autor    : "ribanez"
  Fecha    : 20/12/2023          
  ------------------------------------------------
  "documentacion": { Curso de API REST AlienExplorer }
 **************************************************   
*/
package com.practicas.ribanez.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practicas.ribanez.model.Task;

public interface TodoRepository extends JpaRepository<Task, Long>  {

}
