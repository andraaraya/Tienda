/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.controller;

import com.tienda.entity.personas;
import com.tienda.service.IPersonasService;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**

 * @author Andra Mckenzie Araya
 */
@Controller
public class PersonaController {
   
    @Autowired
    private IPersonasService PersonaService;
    
    @GetMapping("/persona")
    public String index (Model model) {
        List<personas> listaspersonas = PersonaService.getAllpersonas();
        model.addAttribute("título","Tabla Personas");
        model.addAttribute("personas",listaspersonas);
        return "personas";
    }
}
