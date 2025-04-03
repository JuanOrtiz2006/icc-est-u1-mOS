package controllers;
public class ShellSort {
    public void sort(int[] arr, boolean orden) {
        int n= arr.length;

        for(int gap=n/2; gap>0; gap/=2){
            for(int i=gap;i<n;i++){
                int temp=arr[i];
                int j=i;
                while(orden=true && j>=gap && arr[j-gap]>temp){
                    System.out.printf("Cambioes en Gap: %d",gap);
                    System.out.println("\nCambio de " + arr[j] +" y " + arr[j-gap]);
                    arr[j]=arr[j-gap];
                    j-=gap;
                }
                arr[j]=temp;
            }

        }
        imprimirShell(arr);
        System.out.println(" ");
        }


        public void imprimirShell(int arr[]){
            int n=arr.length;
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }    
        }
    }
