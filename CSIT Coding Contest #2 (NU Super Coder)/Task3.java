import java.util.Scanner;
//import java.lang.*;
//import java.io.*;
// The main method must be in a class named "Main".
class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean jolly = true;
        int n = 0;
        int ant = 0;
        int sig = 0;
        int diff = 0;
        while(sc.hasNext()){
            n = sc.nextInt();
            boolean[] validos = new boolean[n-1];
            for(int i = 0; i < n-1; i++) validos[i] = false;
            jolly = true;
            sig = sc.nextInt();
            for(int i = 0; i < n-1; i++){
                ant = sig;
                sig = sc.nextInt();
                if(ant < sig) diff = sig-ant;
                else diff = ant-sig;
                if(0 < diff && diff < n){
                    validos[(diff-1)] = true;
                }
            }
            for(int i = 0; i < n-1; i++){
                jolly = jolly && validos[i];
            }
            if(jolly) System.out.println("Jolly");
            else System.out.println("Not jolly");
        }
    }
}