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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.pe.Spring.Service.ProgramaService;
import pe.edu.pe.Spring.entity.Programa;

/**
 *
 * @author HP-PERU
 */
@RestController
@RequestMapping("/programa")
@Api(value = "Microservicio de gestion de programas", description = "Microservicio de Gestion de taller")
public class ProgramaController {
  

    @Autowired
    ProgramaService programaService;

        @ApiOperation(value = "Lista de programas")
    @GetMapping("/all")
    public List<Programa> findAll() {
        return programaService.findAll();
    }
    @ApiOperation(value = "Obtiene datos de un programa")
    @GetMapping("/{id}")
    public ResponseEntity<Programa> findById(@PathVariable Long id) {
        Programa programa = programaService.findById(id);
        return ResponseEntity.ok(programa);
    }

        @ApiOperation(value = "Elimina un programa")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        programaService.deleteById(id);
    }

        @ApiOperation(value = "Crea un programa")
    @PostMapping("/save")
    public Programa save(@RequestBody Programa programa) {
        return programaService.save(programa);
    }
    
    @ApiOperation(value = "Modifica datos de un programa")

    @PutMapping("/update")
    public Programa update(@RequestBody Programa programa) {
        return programaService.save(programa);
    }
}
