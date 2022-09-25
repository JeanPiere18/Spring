/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pe.Spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pe.Spring.entity.Persona;

/**
 *
 * @author HP-PERU
 */
@Repository
public interface PersonaRepository extends CrudRepository< Persona, Long> {
  
}
