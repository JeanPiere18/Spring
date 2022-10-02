/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pe.Spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pe.Spring.entity.Asistencia;

/**
 *
 * @author HP-PERU
 */

@Repository
public interface AsistenciaRepository extends CrudRepository<Asistencia, Long>{

}
    

