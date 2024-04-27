//Jose Gabriel Fonseca Cortez//
// Carnet 2024-1641U//
//Grupo 1 M 7//

import java.util.Scanner;

public class App {

    // Este primer metodo esta enfocado en lo que es evaluar el numero mayor dentro de un arreglo asignado 
    // para el almacenamiento de los numeros
    //Se  programa un for para que se entre directamente al arreglo, con las condiciones que se siga jecutando siempre y cuando
    // la variable i siga siendo menor al tamaño del arreglo, se seguira ejecutando

    // la funcion if en este caso se ocupa para ir evaluando cada uno de los numeros del arreglo
    // a traves de una evaluación de cada uno por medio de una comparación mayor o menor que
    public static int encontrarMayor(int[] numeros) {
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }

    //En este arreglo se busca encontrar la suma de los dos numeros minimos
    //Primeramente se declara una variable sumaMinimos sera igual a Integer.MAX_VALUE (que es la cantidad maxima de un int en java)
    //Esto con el fin de evaluar el resto de numeros menores que este y poder asi encontrar la suma e igualmente
    //para asi evitar errores

    //Luego, se ingresan dos for para cada uno de los numeros minimos
    //Y se ingresa un if con la condicion de que la suma de ambos numeros sean menores al resulatado sumaMinimos
    //y que sean diferentes al valor mayor
    //Esto para cerrar el proceso
    public static int Minimos(int[] numeros, int mayor) {
        int sumaMinimos = Integer.MAX_VALUE;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] + numeros[j] < sumaMinimos && numeros[i] + numeros[j] != mayor) {
                    sumaMinimos = numeros[i] + numeros[j];
                }
            }
        }
        return sumaMinimos;
    }

    //En este metodo se hace hace uso de la fincion Integer.MIN_VALUE para lograr evaluar cuales de los tres numeros
    //son los maximos del arreglo
    //Posteriormente, con un ciclo for, se hace  una evaluación de estos  valores para que sean asignados en una variable
    //y finalmente hacer la resta de estos
    public static int Maximos(int[] numeros, int mayor) {
        int max1 = Integer.MIN_VALUE; 
        int max2 = Integer.MIN_VALUE; 
    
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max1) {
                max2 = max1; 
                max1 = numeros[i]; 
            } else if (numeros[i] > max2) {
                max2 = numeros[i]; 
            }
        }
    
        return max1 - max2;
    }

    //En el main simplemente se le da una bienvenida al usuario, que ingresa los tres numeros y posteriormente immprime imprime los resulatados
    public static void main(String[] args) throws Exception {

        Scanner capnumeros = new Scanner(System.in);

        int [] numeros = new int [3];

        System.out.println("Bienvenido al sistema 3 numeros");

        System.out.println("Ingrese 3 numeros");

        System.out.println("Ingrese el primer numero por favor");
        numeros [0] = capnumeros.nextInt();

        System.out.println("Ingrese el segundo numero");
        numeros [1] = capnumeros.nextInt();

        System.out.println("Ingrese el tercer numero");
        numeros [2] = capnumeros.nextInt();

        int mayor = encontrarMayor(numeros);
        System.out.println("El numero mayor de los tres es: "+mayor);

        int sumaMinimos = Minimos(numeros, mayor);
        System.out.println("La suma de los dos numeros minimos es: "+sumaMinimos);

        int diferenciaMaximos = Maximos(numeros, mayor);
        System.out.println("La diferencia de los dos numeros maximos es "+diferenciaMaximos);
    }
}
