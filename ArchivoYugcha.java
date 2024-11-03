/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1tarea1yugchaRomel;

/**
 *
 * @author RomelYugcha
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoYugcha {
    private static final String FILE_PATH_CSV = "estudianteYugcha.csv";
    private static final String FILE_PATH_JSON = "estudianteYugcha.json";

    public static void guardarEnCsv(int nota1, int nota2, int nota3, double promedio) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH_CSV, true))) {
            writer.write("Primera nota: " + nota1);
            writer.write(", Segunda nota: " + nota2);
            writer.write(", Tercera nota: " + nota3);
            writer.write(", Promedio: " + promedio);
            writer.newLine(); // Añade una nueva línea después de cada registro
            System.out.println("ARCHIVO CSV GUARDADO: " + FILE_PATH_CSV);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void guardarEnJson(int nota1, int nota2, int nota3, double promedio) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH_JSON))) {
            writer.write("{\n");
            writer.write("  \"Primera nota\": " + nota1 + ",\n");
            writer.write("  \"Segunda nota\": " + nota2 + ",\n");
            writer.write("  \"Tercera nota\": " + nota3 + ",\n");
            writer.write("  \"Promedio\": " + promedio + "\n");
            writer.write("}");
            System.out.println("ARCHIVO JSON GUARDADO: " + FILE_PATH_JSON);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


