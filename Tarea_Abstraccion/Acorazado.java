
package Tarea_Abstraccion;


public class Acorazado extends Acuatico{

    private int numeroTorreta;
    private String tipoCañon;

    public Acorazado(String matricula, String marca, int pasajeros, String color, String modelo, int helice, int cubiertas, int numeroTorreta, String tipoCañon) {
        super(matricula, marca, pasajeros, color, modelo, helice, cubiertas);
        this.numeroTorreta = numeroTorreta;
        this.tipoCañon = tipoCañon;
    }

    public int getNumeroTorreta() {
        return numeroTorreta;
    }

    public void setNumeroTorreta(int numeroTorreta) {
        this.numeroTorreta = numeroTorreta;
    }

    public String getTipoCañon() {
        return tipoCañon;
    }

    public void setTipoCañon(String tipoCañon) {
        this.tipoCañon = tipoCañon;
    }
    
    @Override
     public void mostrarDatos(){
       System.out.println("El Acorazado USS Missouri con matrciula "+getMatricula()+"\n marca "+getMarca()+"tiene capacidad para "+getPasajeros()+"\nes de color "+getColor()+"\n modelo "+getModelo()+"\n tiene "+getHelice()+" helices"+
               "\ntiene "+getCubiertas()+" cubiertas  y cuenta con "+numeroTorreta+" torretas y su tipo de cañon es "+tipoCañon);

       
       }
    @Override
     public void funcion(){
            System.out.println("su funcion es lograr la supremacia maritima con sus grandes cañones");
            
            
              
            }
}
