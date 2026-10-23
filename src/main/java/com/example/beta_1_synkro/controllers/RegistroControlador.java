package com.example.beta_1_synkro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beta_1_synkro.models.Registro;
import com.example.beta_1_synkro.services.ServicioRegistro;



@RestController
@RequestMapping("/api/Registros")
public class RegistroControlador {

    @Autowired
    ServicioRegistro servicio;

    //controlador para guardar 
    @postMapping
     public ResponseEntity<?> guardar(@RequestBody Registro datos) {
        return ResponseEntity.status(HttpStatus.ok).body(servicio.guardar(datos)); // temporal, luego llamamos al servicio
    }

    //controlador para buscar
    public ResponseEntity<?> buscar(){
        return ResponseEntity.status(HttpStatus.ok).body(servicio.buscar());
    }

    //controlador para modificar 
    @pustMapping("{/id}")
    public ResponseEntity<?> modificar(@pathVariable UUID id, @RequestBody Registro datos){
        return ResponseEntity.status(HttpStatus.ok).body(servicio.modificar(id, datos));
    }

    //controlador para eliminar
    @deleteMapping ("{/id}")
    public ResponseEntity<?> eliminar(pathVariable UUID id){
        return ResponseEntity.status(HttpStatus.ok).body(servicio.eliminar(id));

    }

}
