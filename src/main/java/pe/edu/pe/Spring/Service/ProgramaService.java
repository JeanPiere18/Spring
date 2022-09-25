/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pe.Spring.Service;

import java.util.List;
import pe.edu.pe.Spring.entity.Programa;

/**
 *
 * @author HP-PERU
 */
public interface ProgramaService {
    public List<Programa> findAll();

    public Programa findById(Long id);

    public Programa save(Programa programa);

    public void delete(Programa programa);

    public void deleteById(Long id);
}
