package com.mycompany.proyectooad;

//JHIMY ANDRES VERGARA VILLACIS

import java.util.Scanner;

class Triangulo {
    private char[][] matriz;

    // Constructor de la clase Triangulo que inicializa la matriz
    public Triangulo(int size) {
        matriz = new char[size][size];
    }

    // Método para generar el Triángulo A
    public void generarTrianguloA(char caracter) {                            
    int i = 0;                                       //                        /1/     ta
    while (i < matriz.length) {                      //                        /2/     n*tc + tc
        int j = 0;                                   //                        /3/     ta
        while (j <= i) {                             //                        /4/     n*tc + tc 
            matriz[i][j] = caracter;                 //                        /5/     n*ta 
            j++;                                     //                        /6/     n*(ta + to) 
        }                                                                                
        i++;                                         //                        /7/    n*(ta + to)  
    }
}
    
// operacion del generado de ingreso del triangulo A
// T=ta+n⋅tc+2⋅tc+n⋅ta+n⋅(ta+to)+n⋅(ta+to)
 
// 1. Tiempo Mejor Esperado:
//   T=ta+n⋅tc+tc+n⋅ta+n⋅(ta+to)+n⋅(ta+to)

// 2. Tiempo Peor Esperado
//   T=ta+n⋅tc+2⋅tc+n⋅ta+n⋅(ta+to)+n⋅(ta+to)

// 3. tiempo Esperado
//   T=ta+n⋅tc+2⋅tc+n⋅ta+n⋅(ta+to)+n⋅(ta+to)
    
    // Método para generar el Triángulo B
    public void generarTrianguloB(char caracter) {                            
    int size = matriz.length;
    int i = 0;                                       //                        /1/     ta
    while (i < size) {                               //                        /2/     n*tc + tc
        int j = 0;                                   //                        /3/     ta
        while (j < size - i) {                       //                        /4/     n*tc + tc 
            matriz[i][j] = caracter;                 //                        /5/     n*ta 
            j++;                                     //                        /6/     n*(ta + to) 
        }                                                                                
        i++;                                         //                        /7/    n*(ta + to)  
    }
}
    
// operacion del generado de ingreso del triangulo B
//T=ta+n⋅tc+2⋅tc+n⋅ta+n⋅(ta+to)+n⋅(ta+to)

// 1. Tiempo Mejor Esperado:
//   T=ta+n⋅tc+tc+n⋅ta+n⋅(ta+to)+n⋅(ta+to)

// 2. Tiempo Peor Esperado
//   T=ta+n⋅tc+2⋅tc+n⋅ta+n⋅(ta+to)+n⋅(ta+to)

// 3. tiempo Esperado
//   T=ta+n⋅tc+2⋅tc+n⋅ta+n⋅(ta+to)+n⋅(ta+to)
 
    // Método para imprimir la matriz en forma de triángulo
    public void imprimirTriangulo() {
    int i = 0;                                       //                        /1/     ta
    while (i < matriz.length) {                      //                        /2/     n*tc + tc
        int j = 0;                                   //                        /3/     ta
        while (j < matriz[i].length) {               //                        /4/     n*tc + tc 
            char c = matriz[i][j];
            if (c == 0) {                            //                        /5/     n*tc 
                System.out.print("  ");
            } else {
                System.out.print(c + " ");           //                        /6/     n*ta 
            }
            j++;                                     //                        /7/     n*(ta + to)
        }
        System.out.println();                        //                        /8/     ta
        i++;                                         //                        /9/     n*(ta + to)  
    }
}
// operacion de la impresiondel triangulo 
//T=ta+n⋅tc+2⋅tc+n⋅ta+n⋅(ta+to)+n⋅(ta+to)
    
// 1. Tiempo Mejor Esperado:
//   T=ta+n⋅tc+tc+n⋅ta+n⋅(ta+to)+n⋅(ta+to)

// 2. Tiempo Peor Esperado
//   T=ta+n⋅tc+2⋅tc+n⋅ta+n⋅(ta+to)+n⋅(ta+to)

// 3. tiempo Esperado
//   T=ta+n⋅tc+2⋅tc+n⋅ta+n⋅(ta+to)+n⋅(ta+to)
     
}

public class proyeT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del triángulo: ");
        int size = scanner.nextInt();

        System.out.println("Ingrese el carácter para formar el triángulo: ");
        char caracter = scanner.next().charAt(0);

        Triangulo trianguloA = new Triangulo(size);
        System.out.println("El triángulo A:");
        trianguloA.generarTrianguloA(caracter);
        trianguloA.imprimirTriangulo();

        System.out.println("El triángulo B:");
        Triangulo trianguloB = new Triangulo(size);
        trianguloB.generarTrianguloB(caracter);
        trianguloB.imprimirTriangulo();

        scanner.close();
    }
}
