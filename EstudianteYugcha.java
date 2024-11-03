/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1tarea1yugchaRomel;

/**
 *
 * @author RomelYugcha
 */
public class EstudianteYugcha {
    private String nombreYugcha;
    private int nota1Yugcha;
    private int nota2Yugcha;
    private int nota3Yugcha;

    // Constructor
    public EstudianteYugcha(String nombreYugcha, int nota1Yugcha, int nota2Yugcha, int nota3Yugcha) {
        this.nombreYugcha = nombreYugcha;
        this.nota1Yugcha = nota1Yugcha;
        this.nota2Yugcha = nota2Yugcha;
        this.nota3Yugcha = nota3Yugcha;
    }

    // Método para calcular el promedio
    public double calcularPromedioYugcha() {
        return (nota1Yugcha + nota2Yugcha + nota3Yugcha) / 3.0;
    }

    // Método para obtener el estado de aprobación o reprobación
    public String obtenerEstadoYugcha() {
        double promedio = calcularPromedioYugcha();
        return promedio >= 14 ? "APROBADO" : "REPROBADO";
    }

    // Getters (opcional, según si los necesitas en otro lugar)
    public String getNombreYugcha() {
        return nombreYugcha;
    }

    public int getNota1Yugcha() {
        return nota1Yugcha;
    }

    public int getNota2Yugcha() {
        return nota2Yugcha;
    }

    public int getNota3Yugcha() {
        return nota3Yugcha;
    }
}


