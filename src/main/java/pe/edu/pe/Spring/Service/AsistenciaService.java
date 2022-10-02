/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pe.Spring.Service;

import java.util.List;
import pe.edu.pe.Spring.entity.Asistencia;

/**
 *
 * @author HP-PERU
 */
public interface AsistenciaService {
     public List<Asistencia> findAll();

    public Asistencia findById(Long id);

    public Asistencia save(Asistencia asistencia);

    public void delete(Asistencia asistencia);

    public void deleteById(Long id);
}
