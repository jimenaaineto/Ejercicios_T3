package Ejercicio3;

public class NumeroRacional {

    int num; 
    int den;
    public NumeroRacional(){
        this.num=0;
        this.den=0;
    }

    public NumeroRacional(int num, int den){
        this.num=num;
        this.den=den;
    }

    public NumeroRacional(NumeroRacional R){  //constructor de copia
        this.num = R.num;
        this.den = R.den;
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num=num;
    }

    public int getDen(){
        return den;
    }

    public void setDen(int den){
        this.den=den;
    }

    public NumeroRacional sumaRacionales(NumeroRacional n1, NumeroRacional n2 ){
        NumeroRacional suma=new NumeroRacional();
        int sumanum=(n1.getNum()*n2.getDen())+(n1.getDen()*n2.getNum());
        int sumadenom=n1.getDen()*n2.getDen();
        suma.setDen(sumadenom);
        suma.setNum(sumanum);
        
        return suma;
    }

    
    public NumeroRacional restaRacionales(NumeroRacional n1, NumeroRacional n2 ){
        NumeroRacional resta=new NumeroRacional();
        int restanum=(n1.getNum()*n2.getDen())-(n1.getDen()*n2.getNum());
        int restaden=n1.getDen()*n2.getDen();
        resta.setDen(restaden);
        resta.setNum(restanum);
        
        return resta;


}
    public NumeroRacional multiRacionales(NumeroRacional n1, NumeroRacional n2 ){
        NumeroRacional multi=new NumeroRacional();
        int multinum=(n1.getNum()*n2.getNum());
        int multiden=n1.getDen()*n2.getDen();
        multi.setDen(multiden);
        multi.setNum(multinum);
        
        return multi;

}
}