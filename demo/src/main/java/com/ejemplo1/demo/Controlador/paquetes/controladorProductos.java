package com.ejemplo1.demo.Controlador.paquetes;

import com.ejemplo1.demo.entidad.Productos;
import com.ejemplo1.demo.servivios.serviciosProductos;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
public class controladorProductos {
    serviciosProductos servivio = new serviciosProductos();

    @RequestMapping("/pagina")
    public String hola() {
        return "hola mundo:D";
    }

    @GetMapping("/cantidad")
    public String cantidad() {
        return "la cantidad de productos es:" + servivio.cantidad();
    }

    @GetMapping("/lista")
    public ArrayList<Productos> listadeproductos() {
        return servivio.mostrar();
    }

    @GetMapping("/suma")
    public String sumatotal() {
        return "la suma de los productos es " + servivio.SumaLista();
    }

    @DeleteMapping("/{categoria}")
    public String eliminarProductosPorCategoria(@PathVariable("categoria") String categoria) {
        servivio.eliminarProductosPorCategoria(categoria);
        return "Se han eliminado todos los productos de la categoría " + categoria;
    }

    @PutMapping("/{categoria}/actualizar")
    public String actualizarProductosPorCategoria(@PathVariable("categoria") String categoria) {
        servivio.actualizarProductosPorCategoria(categoria);
        return "Se han actualizado los precios de todos los productos de la categoría " + categoria + " con un aumento del 10%.";
    }
}