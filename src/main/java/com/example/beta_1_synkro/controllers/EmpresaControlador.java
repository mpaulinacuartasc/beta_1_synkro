package com.example.beta_1_synkro.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beta_1_synkro.models.Prioridad;
import com.example.beta_1_synkro.services.ServicioEmpresa;
import com.example.beta_1_synkro.services.ServicioPrioridad;

@RestController 
@RequestMapping("/api/empresas")
public class EmpresaControlador {
    @Autowired 
    ServicioEmpresa servicio;
    //controlador para guardar
    @PostMapping 
    public ResponseEntity<?> guardarEmpresa(@RequestBody Empresa datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.guardarPrioridad(datos));
    }
    //controlador para buscar
    public ResponseEntity<?> buscar(){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.buscar());
    }
    //controlador para modificar
    @PutMapping("/id")
    public ResponseEntity<?>modificar(@PathVariable UUID id, @RequestBody Empresa datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.modificar(id, datos));
    }
    //controlador para eliminar
    public ResponseEntity<?>eliminar(@PathVariable UUID id){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.eliminar(id));
    }
}
