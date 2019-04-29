/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad04;

/**
 *
 * @author javier
 */
public class Deportivo extends Vehiculo {

    private int cilindrada; // Atributo específico para Deportivo

    public Deportivo(int bastidor,String matricula, String marca, String modelo,
            String color, double tarifa, int cilindrada) {

        super(bastidor,matricula, marca, modelo, color, tarifa); // Constructor padre
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + " Cilindrada:" + cilindrada ;
    }
    
    @Override
    public String toStringFichero(){
        return super.toStringFichero() +":" + cilindrada ;
    }
    
    public void turbo(){
        System.out.println("Solo los deportivos tienen turbo");
    }
}
