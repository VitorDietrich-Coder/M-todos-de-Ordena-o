package aula0810;
import java.util.Random;
public class Exercicio2 {
    private static int quickfind[] = new int[100];

    public static void main(String[] args){
    	pegainfo();
        int small = Integer.MAX_VALUE;
        int in = -1;
        for(int i =0;i<quickfind.length;i++) {
            if(small > quickfind[i]) {
                small = quickfind[i];
            }
          }
       for(int i = 0; i < quickfind.length; i++) {
           if(quickfind[i] == small) {
               in = i;
               break;
           }
       }System.out.println("Index of "+small+" is : "+in);
    }
    private static int pegPivo(int[] quickfind, int left, int right) {
        int pivo = quickfind[(left+right)/2];
        while(left < right){
            while(quickfind[left]<pivo){
                left++;
            }
            while(quickfind[right]>pivo){
                right--;
            }
            if(left<=right){
                troca(quickfind,left,right);
                left++;
                right--;
            }
        }
        return left;
    }
    private static void troca(int[] a, int i, int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
        private static void pegainfo() {
            Random random = new Random();
            System.out.println("Números aleatórios ");
            for (int i = 0; i < quickfind.length; i++) {
            	quickfind[i] = random.nextInt(100);
                System.out.print(quickfind[i] + ",");
            }
            System.out.println(" ");
            System.out.println(" ");
        
        }
}