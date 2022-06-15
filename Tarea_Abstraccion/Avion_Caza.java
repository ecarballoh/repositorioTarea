
package Tarea_Abstraccion;

public class Avion_Caza extends Aereo {
    
    private int misil;

    public Avion_Caza(String matricula, String marca, int pasajeros, String color, String modelo, String tipoAla, int cantidadMotor,int misil) {
        super(matricula, marca, pasajeros, color, modelo, tipoAla, cantidadMotor);
        this.misil = misil;
    }

    public int getMisil() {
        return misil;
    }

    public void setMisil(int misil) {
        this.misil = misil;
    }
    
    @Override
      public void mostrarDatos(){
       System.out.println("El avion de caza F35 con matricula "+getMatricula()+"\n marca "+getMarca()+"tiene capacidad para "+getPasajeros()+"\nes de color "+getColor()+"\n modelo "+getModelo()+"\n tiene alas tipo "+getTipoAla()+
               "\ntiene "+getCantidadMotor()+" motor  y cuenta con misiles tipo "+misil);
       
           
       }
        public void funcion(){
            System.out.println("su funcion es dar apoyo aereo, bombardeo tactico y capacidad de combate de aire-aire ");
            
               
            }
                

    }
