package com.keepconding.appweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.keepconding.appweb.entity.Prueba;

@Controller
public class HelloController {

	@GetMapping("/saludar")
	public String saludar(Model modelo) {
		//utilizamos el objeto model para pasar 
		//parametros desde el controlador a la vista hola.html
		
		List<Prueba> listaPrueba= new ArrayList<>();
		
		Prueba obj=new Prueba(1,"Ramon","Sanchez");
		Prueba obj2=new Prueba(2,"Maria","Ruiz");
		listaPrueba.add(obj);
		listaPrueba.add(obj2);
		
		
		modelo.addAttribute("key",listaPrueba);
		return "hola";
	}
}
