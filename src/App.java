import controllers.ShellSort;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] arr = {100, 23, 13, 54, 51,69,37,89,14};
        ShellSort shellSort = new ShellSort();
        System.out.println("Ascendente");
        shellSort.sort(arr,true);

        System.out.println("Desscendente");
        shellSort.sort(arr,false);

    }
}
