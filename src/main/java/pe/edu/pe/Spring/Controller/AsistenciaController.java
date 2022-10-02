/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pe.Spring.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.pe.Spring.Service.AsistenciaService;
import pe.edu.pe.Spring.entity.Asistencia;

/**
 *
 * @author HP-PERU
 */
@RestController
@RequestMapping("/asistencia")
@Api(value = "Microservicio de gestión de personas", description = "Microservicio de Asistencia")
public class AsistenciaController {
    
    @Autowired
    private AsistenciaService asistenciaService;
    
    @ApiOperation (value = "Lista de asistencia")
    @GetMapping("/all")
    public List<Asistencia> findAll() {
        return asistenciaService.findAll();
    }
    
     @ApiOperation (value = "Obtiene datos de Asistencia")
    @GetMapping("/{id}")
    public ResponseEntity<Asistencia> findById(@PathVariable Long id) {
        Asistencia asistencia = asistenciaService.findById(id);
        return ResponseEntity.ok(asistencia);
    }
     @ApiOperation (value = "Modifica asistencia")
    @PostMapping("/save")
    public Asistencia save(@RequestBody Asistencia asisntecia) {
        return asistenciaService.save(asisntecia);
    }
    
     @ApiOperation (value = "Actualiza asistencia")
    @PutMapping("/update")
    public Asistencia update(@RequestBody Asistencia asisntecia) {
        //TipoDocumento aut = new TipoDocumento(tipoDocumento.getId(),tipoDocumento.getNombres(),tipoDocumento.getApellidos(), tipoDocumento.getEstado());        
        return asistenciaService.save(asisntecia);
    } 
    @ApiOperation (value = "Elimina asistencia")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        asistenciaService.deleteById(id);
    }
}

