package Ejercicio1;

public class OrigenCoordenadas {
    int pos1;
    int pos2;
    int pos3;

    public OrigenCoordenadas(){
        this.pos1=0;
        this.pos2=0;
        this.pos3=0;
    
    }

    public OrigenCoordenadas(int pos1, int pos2, int pos3){
        this.pos1=pos1;
        this.pos2=pos2;
        this.pos3=pos3;
    }

    @Override
    public String toString(){
        return "el objeto es: ("+pos1+","+pos2+","+pos3+")";
    }
    
}
