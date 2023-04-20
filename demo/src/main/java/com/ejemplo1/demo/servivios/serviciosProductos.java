package com.ejemplo1.demo.servivios;

import com.ejemplo1.demo.entidad.Productos;

import java.util.ArrayList;

public class serviciosProductos {
    private ArrayList<Productos> lista=new ArrayList<>();

    public serviciosProductos(){
        lista.add(new Productos(1,"manzanas",5000.0,"frutas",3));
        lista.add(new Productos(2,"Fresas",3000.0,"frutas",3));
        lista.add(new Productos(3,"Arroz",3000.0,"granos",5));
        lista.add(new Productos(4,"frijol",4000.0,"granos",7));
        lista.add(new Productos(5,"maiz",3000.0,"granos",4));
        lista.add(new Productos(6,"lentejas",3000.0,"granos",10));
        lista.add(new Productos(7,"chocoramo",3000.0,"dulces",5));
        lista.add(new Productos(8,"leche",4000.0,"lacteos",3));
        lista.add(new Productos(9,"clorox",5000.0,"aseo",10));
        lista.add(new Productos(10,"jabon",2000.0,"aseo",15));
    }

    public double SumaLista(){
        double suma = 0;
        for( Productos p: lista ){
            suma+= p.getPrecio ();
        }
        return suma;

    }

    public  int cantidad(){
        return  lista.size();
    }

    public ArrayList<Productos> mostrar() {
        return lista;
    }

    public void eliminarProductosPorCategoria(String categoria) {
        ArrayList<Productos> nuevosProductos = new ArrayList<>();
        for (Productos p : lista) {
            if (!p.getCategoria().equals(categoria)) {
                nuevosProductos.add(p);
            }
        }
        lista = nuevosProductos;
    }


    public void actualizarProductosPorCategoria(String categoria) {
        for (Productos p : lista) {
            if (p.getCategoria().equals(categoria)) {
                double nuevoPrecio = p.getPrecio() * 0.10;
                p.setPrecio(nuevoPrecio);
            }
        }
    }



}

