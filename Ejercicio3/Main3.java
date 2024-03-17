package Ejercicio3;
import Ejercicio3.NumeroRacional;
public class Main3 {
    public static void main(String[] args) {
        NumeroRacional numero1=new NumeroRacional(2,3);
        NumeroRacional numero2=new NumeroRacional(3, 5);
        NumeroRacional resultadosuma=new NumeroRacional();
        resultadosuma=resultadosuma.sumaRacionales(numero1, numero2);
        System.out.println("el resultado es" +resultadosuma);
    }
    
}
