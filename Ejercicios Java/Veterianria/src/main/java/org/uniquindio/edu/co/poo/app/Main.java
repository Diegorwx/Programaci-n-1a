package org.uniquindio.edu.co.poo.app;

import org.uniquindio.edu.co.poo.model.Mascota;

public class Main {
    public static void main(String[] args) {
        String nombre= "Luna";
        String especie= "Perro";
        String raza= "Pincher";
        byte edad= 5;
        String genero= "Masculino";
        String color= "café";
        float peso= 2.3f;

        Mascota mascota= new Mascota(nombre, especie, raza,
                edad, genero, color, peso);

        System.out.println(mascota);

        String especieMascota= mascota.getEspecie();
        System.out.println(especieMascota);

    }
}