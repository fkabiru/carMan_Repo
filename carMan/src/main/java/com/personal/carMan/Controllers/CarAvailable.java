/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.personal.carMan.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fkabiru
 */
@RestController
public class CarAvailable {
    
    @GetMapping("/carsAvailable")
    public String availableCars(){
        System.out.print("***RESPONDING****");
        return "No available Cars";
    }
    
}
