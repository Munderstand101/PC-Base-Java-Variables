package Algo;

public class Exercice1 {

    public static void ex0(){
        System.out.println("J’ai compris comment faire une méthode !");
    }

    public static void ex1(int nombre){

        if (nombre<0)
        {
            System.out.println(nombre);
        }
        else {
            for(int a = 0 ; a <= nombre ; a++)
            {
                System.out.println(a);
            }
        }




    }

    public static void ex2(String mot){
        for (char ch: mot.toCharArray()) {
            System.out.println(mot);
        }
    }
    public static void ex3(int nombre){

    }
    public static void ex4(int nombre){

    }

}
