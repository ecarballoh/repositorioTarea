
package Herencia_Tarea;


public class Bote extends Acuatico {
    
    private int remo;

    public Bote(String matricula, String marca, int pasajeros, String color, String modelo, int helice, int cubiertas,int remo) {
        super(matricula, marca, pasajeros, color, modelo, helice, cubiertas);
        this.remo = remo;
    }

    public int getRemo() {
        return remo;
    }

    public void setRemo(int remo) {
        this.remo = remo;
    }
    
    @Override
      public void mostrarDatos(){
       System.out.println("El bote tiene matricula "+getMatricula()+"\n marca "+getMarca()+"tiene capacidad para "+getPasajeros()+"\nes de color "+getColor()+"\n modelo "+getModelo()+"\n tiene "+getHelice()+" helices"+
               "\ntiene "+getCubiertas()+" cubiertas  y cuenta con "+remo+" remos");
       
           
       }
       
}
