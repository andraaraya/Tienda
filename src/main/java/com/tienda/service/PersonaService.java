/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.entity.personas;
import com.tienda.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andra Mckenzie Araya
 */
@Service
public class PersonaService implements IPersonasService {

    @Autowired
    private PersonaRepository personasRepository;

    @Override
    public List<personas> getAllpersonas() {
        return (List<personas>) personasRepository.findAll();
    }

    @Override
    public personas getpersonasById(long id) {
        return personasRepository.findById(id).orElse(null);
    }

    @Override
    public void savepersonas(personas personas) {
        personasRepository.save(personas);
    }

    @Override
    public void delete(long id) {
        personasRepository.deleteById(id);
    }

    @Override
    public personas findByNombre(String nombre) {
        return personasRepository.findByNombre(nombre);
    }

}
