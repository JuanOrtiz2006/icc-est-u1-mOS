package controllers;

public class QuickSort {

    public int sumaConsecutivos(int n) {
        if (n <= 1) {
            return n; // Caso base
        }
        return n + sumaConsecutivos(n - 1);
    }

    public int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }

    public int sumaDigitos(int numero) {
        if (numero < 10) {
            return numero; // Caso base
        }
        return (numero % 10) + sumaDigitos(numero / 10); 
    }
}
