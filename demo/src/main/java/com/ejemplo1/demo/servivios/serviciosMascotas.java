package com.ejemplo1.demo.servivios;

import com.ejemplo1.demo.entidad.mascotas;

import  java.util.ArrayList;

public class serviciosMascotas{

    private ArrayList<mascotas> lista=new ArrayList<>();

    public serviciosMascotas(){
        lista.add(new mascotas(1,"moky",2000.0,"canino"));
        lista.add(new mascotas(2,"coco",3000.0,"felino"));
        lista.add(new mascotas(3,"coky",5000.0,"canino"));
        lista.add(new mascotas(4,"chimuelo",6000.0,"felino"));
        lista.add(new mascotas(5,"pay",2000.0,"felimp"));
    }

    // motras la suma de precios de nuestra lista

    public double sumaLista(){
        double suma=0;
        for(mascotas p: lista){
            suma+= p.getPrecio();

        }
            return suma;
    }

    //motras tamaño de nuestra lista
    public  int cantidad() {return lista.size();}

    //motras solo las mascotas
    public ArrayList<mascotas> mostrar(){return lista;}

    public  String agregar(mascotas m){
        lista.add(m);
        return "Registro del perro Exitoso";
    }

  public mascotas buscarNombre(String nombre) {
      mascotas mascotas = null;
      for (mascotas m : lista) {
          if (m.getNombre().equalsIgnoreCase(nombre)) {
              mascotas = m;
              break;
          }
      }
      return mascotas;

  }

    public  String eliminarmascota(String nombre){
        if(buscarNombre(nombre) != null){
            lista.remove(buscarNombre(nombre));
            return "el dato se elimino con exito";
        } else{
            return "no se elimino el dato error";
        }
    }




}
