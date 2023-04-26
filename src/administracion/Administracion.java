/*Para el pago de la administración se tiene un numero N de registros 
(nro_apartamento, tamaño en metros, valor por metro), hacer un algoritmo que
realice las siguientes tareas:

- Total bruto a pagar por concepto de administración 
- Descuento (es del 20% sobre el total bruto si el tamaño del apartamento es de 40 metros o menos, del 15% si el tamaño del apartamento es mayor a 40 metros, pero igual o menor a 60 metros y del 10% si el tamaño del apartamento es mayor de 60 metros)
- El neto a pagar por administración de cada apartamento

 */
package administracion;

import java.util.Scanner;

/**
 *
 * @author luistorresco
 */
public class Administracion {

    /**
     * @param args 
     */
    public static void main(String[] args) {
    Scanner objread=new Scanner(System.in);
        int nro_apto,n;
        float cant_metros,val_metro,descuento,
        valor_admin,valor_neto;   
        //Leer la cantidad de apartamentos
        System.out.print("¿Cuantos apartamentos son? ");
        n=objread.nextInt();
        for (int i = 1; i <= n; i++) {
            //Lectura de los registros
            System.out.print("Numero del apartamento ");
            nro_apto=objread.nextInt();
            System.out.print("Tamaño en metros del apartamento ");
            cant_metros=objread.nextFloat();
            System.out.print("Valor por metro ");
            val_metro=objread.nextFloat();
            //Operaciones
            valor_admin=cant_metros * val_metro;
            if (cant_metros <= 40)
                descuento=(valor_admin * 20)/100;
            else
                if (cant_metros <= 60)
                    descuento=(valor_admin * 15)/100;
                else
                    descuento=(valor_admin * 10)/100;
            valor_neto=valor_admin - descuento;
            System.out.println("\n El valor bruto a pagar es " + valor_admin);
            System.out.println(" El descuento es de " + descuento);
            System.out.println(" El neto a pagar es de " + valor_neto);
        }//fin para 
    }
    
}	


