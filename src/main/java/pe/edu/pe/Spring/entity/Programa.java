/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pe.Spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author HP-PERU
 */
@Data
@Entity
@Table(name = "programa")
public class Programa {
    @Id
    @Column(name = "prog_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long progId;

    @Column(name = "prog_nombre")
    private String progNombre;

    @Column(name = "prog_descripcion")
    private String progDescripcion;
}
