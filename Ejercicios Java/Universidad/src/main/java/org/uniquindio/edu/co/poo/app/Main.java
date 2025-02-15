package org.uniquindio.edu.co.poo.app;

import org.uniquindio.edu.co.poo.model.Estudiante;

public class Main {
    public static void main(String[] args) {
        String nombres= "Juan Pablo";
        String apellidos= "Florez Serna";
        String cedula = "1321453574";
        byte edad = 19;
        String telefono = "3227563837";
        String correo = "juanpablo@gmail.com";


        Estudiante estudiante = new Estudiante(nombres, apellidos, cedula,
                edad,  telefono, correo);
        System.out.println(estudiante);
    }
}