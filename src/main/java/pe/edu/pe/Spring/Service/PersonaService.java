/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pe.Spring.Service;

import java.util.List;
import pe.edu.pe.Spring.entity.Persona;

/**
 *
 * @author HP-PERU
 */
public interface PersonaService {
    public List <Persona> findAll();
    
    public Persona findById (Long id);
    
    public Persona save (Persona persona);
    
    public void delete (Persona persona);
    
    public void deleteById (Long id);
}
