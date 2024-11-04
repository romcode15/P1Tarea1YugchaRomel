#ifndef REGISTROYUGCHA_H_INCLUDED
#define REGISTROYUGCHA_H_INCLUDED
#include <iostream>

using namespace std;
void registro();
void promedio();
float nota1,nota2,nota3;
string nombre;



void registro(){
    cout<<"Ingrese el nombre del estudiante"<<endl;
    cin.ignore();
    getline(cin, nombre);

    cout<<"Ingrese las notas del estudiante"<<endl;
    cout<<"Ingres la primera nota"<<endl;
    cin>>nota1;
    while (nota1<0 || nota1>20){
        cout<<"Error, ingrese nuevamente"<<endl;
        cin>>nota1;
    }

    cout<<"Ingrese la segunda nota"<<endl;
    cin>>nota1;
    while (nota2<0 || nota2>20){
        cout<<"Error, ingrese nuevamente"<<endl;
        cin>>nota2;
    }

    cout<<"Ingrese la tercera nota"<<endl;
    cin>>nota3;
    while (nota3<0 || nota3>20){
        cout<<"Error, ingrese nuevamente"<<endl;
        cin>>nota3;
    }
}

void promedio(){
    float promedio = (nota1 + nota2 + nota3) / 3;
    cout << "El promedio de " << nombre << " es: " << promedio << endl;
    cout<<endl;

    if(promedio>13){
        cout<<"APROBADO"<<endl;
        cout<<endl;
    }else{
        cout<<"REPROBADO"<<endl;
        cout<<endl;
    }
}

#endif // REGISTROYUGCHA_H_INCLUDED
