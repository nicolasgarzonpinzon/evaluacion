package com.ejemplo1.demo.Controlador.paquetes;

import com.ejemplo1.demo.servivios.serviciosMascotas;
import com.ejemplo1.demo.entidad.mascotas;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
public class controladorMascotas {
    serviciosMascotas servicio=new serviciosMascotas();
    @RequestMapping("/pagina")
        public String hola(){
        return ("prueba mascotas");
    }

    //metodo de cantidad
    @RequestMapping("/Cantidad de mascotas")
    public String cantidad(){return "la cantidad de mascotas son "+servicio.cantidad();}

    //metodo de lista
    @RequestMapping("/Listar")
    public ArrayList<mascotas>listamacotas(){return servicio.mostrar();}

    //metodo sumar
    @RequestMapping("/Suma")
    public String sumatotal(){return "la suma de las mascotas es "+servicio.sumaLista();}

    @PostMapping("/AgregarPerro")
    public String agregar(@RequestBody mascotas m) {
        return servicio.agregar(m);
    }
    @GetMapping("/buscarNombre/{dato}")
    public  mascotas buscar(@PathVariable("dato") String nombre){
        return servicio.buscarNombre(nombre);
    }


    @GetMapping("/eliminarmascotas/{dato}")
    public String eliminar(@PathVariable("dato") String nombre){return  servicio.eliminarmascota(nombre);}



}
