#ifndef REGISTROYUGCHA_H_INCLUDED
#define REGISTROYUGCHA_H_INCLUDED
#include <iostream>
#include <fstream>  // Para manejar archivos
#include <iomanip>  // Para formatear la salida
using namespace std;

void registro();
void promedio();
void guardarRegistro(float promedio);
float nota1, nota2, nota3;
string nombre;

void registro(){
    cout << "Ingrese el nombre del estudiante: " << endl;
    cin.ignore();
    getline(cin, nombre);

    cout << "Ingrese las notas del estudiante: " << endl;

    cout << "Ingrese la primera nota: " << endl;
    cin >> nota1;
    while (nota1 < 0 || nota1 > 20) {
        cout << "Error, ingrese nuevamente: " << endl;
        cin >> nota1;
    }

    cout << "Ingrese la segunda nota: " << endl;
    cin >> nota2;
    while (nota2 < 0 || nota2 > 20) {
        cout << "Error, ingrese nuevamente: " << endl;
        cin >> nota2;
    }

    cout << "Ingrese la tercera nota: " << endl;
    cin >> nota3;
    while (nota3 < 0 || nota3 > 20) {
        cout << "Error, ingrese nuevamente: " << endl;
        cin >> nota3;
    }
}

void promedio() {
    float promedio = (nota1 + nota2 + nota3) / 3;
    cout << "El promedio de " << nombre << " es: " << fixed << setprecision(2) << promedio << endl; // Salida formateada a 2 decimales

    if (promedio > 13) {
        cout << "APROBADO" << endl;
    } else {
        cout << "REPROBADO" << endl;
    }

    guardarRegistro(promedio);  // Llamada a la función para guardar el registro
}

void guardarRegistro(float promedio) {
    ofstream archivo("registro_estudiantes.txt", ios::app);  // Abrir el archivo en modo append
    if (archivo.is_open()) {
        archivo << "Nombre: " << nombre << endl;
        archivo << "Notas: " << nota1 << ", " << nota2 << ", " << nota3 << endl;
        archivo << "Promedio: " << fixed << setprecision(2) << promedio << endl;  // Guardar el promedio con 2 decimales
        archivo << (promedio > 13 ? "Estado: APROBADO" : "Estado: REPROBADO") << endl;  // Guardar el estado
        archivo << "------------------------" << endl;
        archivo.close();  // Cerrar el archivo
    } else {
        cout << "Error al abrir el archivo." << endl;
    }
}

#endif // REGISTROYUGCHA_H_INCLUDED
