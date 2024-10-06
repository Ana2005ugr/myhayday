/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myhayday;
import modelos.Trigo;

/**
 *
 * @author pc
 */
public class MyHayDay{
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        Trigo test1 = new Trigo("aun no tiene", 1, 2, 3, 4);   
        System.out.println(test1.geticono() + " " + test1.getDuracionProduccion() + " " + test1.getexperienciaRecolecta() +" " + test1.getprecioVenta()+" " + test1.getRiego());
        
        Trigo test2 = new Trigo();
        System.out.println(test2.geticono()+" " + test2.getDuracionProduccion()+" " + test2.getexperienciaRecolecta()+" " + test2.getprecioVenta()+" " + test2.getRiego());
        
        Trigo test3 = new Trigo(test1);
        System.out.println(test3.geticono()+" " + test3.getDuracionProduccion()+" " + test3.getexperienciaRecolecta()+" " + test3.getprecioVenta()+" " + test3.getRiego());
        
        
        
    }
}