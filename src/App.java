import controllers.ShellSort;
import controllers.QuickSort;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        // Ejemplo de uso de ShellSort
        int[] arr = {100, 23, 13, 54, 51, 69, 37, 89, 14};
        ShellSort shellSort = new ShellSort();
        System.out.println("Ascendente");
        shellSort.sort(arr, true);

        System.out.println("Descendente");
        shellSort.sort(arr, false);

        // Ejemplo de uso de QuickSort
        QuickSort quickSort = new QuickSort();

        // Llamadas a los métodos de QuickSort
        int sumaConsecutivos = quickSort.sumaConsecutivos(5);
        int potencia = quickSort.potencia(2, 3);
        int sumaDigitos = quickSort.sumaDigitos(123);

        // Mostrar resultados de QuickSort
        System.out.println("Suma de números consecutivos hasta 5: " + sumaConsecutivos);
        System.out.println("2 elevado a la 3: " + potencia);
        System.out.println("Suma de los dígitos de 123: " + sumaDigitos);        
        
    }    
}        
    

