#ifndef ESTRUCTURAYUGCHA_H_INCLUDED
#define ESTRUCTURAYUGCHA_H_INCLUDED
#include <iostream>
#include "registroYugcha.h"
using namespace std;

void menu();

void menu(){
    int op;
    cout<<"CALIFICACIONES"<<endl;
    cout<<"Opcion 1: Registro Calificaciones"<<endl;
    cout<<"Opcion 2: Promedio"<<endl;
    cout<<"Opcion 3: Salir"<<endl;
    cout<<"Ingrese una Opcion: "<<endl;
    cin>>op;

    switch(op){
        case 1:
            registro();
            menu();
            break;
        case 2:
            promedio();
            menu();
            break;
        case 3:
                cout<<"Usted ha salido del programa"<<endl;
            break;
            default:
                cout<<"Opcion invalida, intente de nuevo"<<endl;
                menu();
                break;

    }

}







#endif // ESTRUCTURAYUGCHA_H_INCLUDED
