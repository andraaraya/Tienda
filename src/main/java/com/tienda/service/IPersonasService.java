/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;
import com.tienda.entity.personas;
import java.util.List;
/**
 *
 * @author Andra Mckenzie Araya
 */
public interface IPersonasService {
    public List<personas> getAllpersonas();
    public personas findByNombre (String nombre);
    public personas getpersonasById (long id);
    public void savepersonas(personas personas);
    public void delete (long id);
}
