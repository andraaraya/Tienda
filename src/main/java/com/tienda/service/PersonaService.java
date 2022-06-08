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
public abstract class PersonaService implements IPersonasService {

    @Autowired
    private PersonaRepository PersonaRepository;
    
    public List<personas> getAllpersonas() {
        return (List<personas>)PersonaRepository.findAll();
    }

    @Override
    public personas getpersonasById(long id) {
        return PersonaRepository.findById(id).orElse(null);
    }

    @Override
    public void savepersonas(personas personas) {
        PersonaRepository.save(personas);
    }

    @Override
    public void delete(long id) {
       PersonaRepository.deleteById(id);
    }

    
}
