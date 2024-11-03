/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p1tarea1yugchaRomel;

/**
 *
 * @author RomelYugcha
 */
import java.util.Scanner;

public class MainYugcha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EstudianteYugcha estudiante = null;
        int opcion;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Registro de notas");
            System.out.println("2. Promedio y Estado");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = scanner.next();

                    int nota1 = solicitarNota(scanner, 1);
                    int nota2 = solicitarNota(scanner, 2);
                    int nota3 = solicitarNota(scanner, 3);

                    estudiante = new EstudianteYugcha(nombre, nota1, nota2, nota3);
                    double promedio = estudiante.calcularPromedioYugcha();

                    // Guardar en archivos CSV y JSON
                    ArchivoYugcha.guardarEnCsv(nota1, nota2, nota3, promedio);
                    ArchivoYugcha.guardarEnJson(nota1, nota2, nota3, promedio);

                    System.out.println("Datos guardados en archivos CSV y JSON.");
                    break;

                case 2:
                    if (estudiante != null) {
                        System.out.println("Promedio: " + estudiante.calcularPromedioYugcha());
                        System.out.println("Estado: " + estudiante.obtenerEstadoYugcha());
                    } else {
                        System.out.println("Primero debe registrar las notas del estudiante.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 3);
    }

    private static int solicitarNota(Scanner scanner, int numeroNota) {
        int nota;
        do {
            System.out.print("Ingrese la nota " + numeroNota + " (0-20): ");
            nota = scanner.nextInt();
            if (nota < 0 || nota > 20) {
                System.out.println("La nota debe estar entre 0 y 20.");
            }
        } while (nota < 0 || nota > 20);
        return nota;
    }
}


