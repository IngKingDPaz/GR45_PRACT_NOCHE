/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g45_poo;

/**
 *
 * @author Ing_Rey
 */
import Modelo.Abanico;
import java.util.Scanner;
public class G45_POO {
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int opc;
        
        Scanner sc = new Scanner(System.in);   
       
        Abanico obj_1=new Abanico();
        System.out.println("Abanico 1");
        System.out.println("Color: "+obj_1.getColor());
         System.out.println("Marca: "+obj_1.getMarca());
         System.out.println("Estado: "+obj_1.getEstado());
         
         System.out.println("Ingrese color Abanico 1");
        String color=sc.next();
        obj_1.setColor(color);
        
        System.out.println("Color: "+obj_1.getColor());       
        System.out.println("Abanico 3");
        Abanico obj_3=new Abanico("Azul");
        System.out.println("Color: "+obj_3.getColor());
        System.out.println("Marca: "+obj_3.getMarca());
        System.out.println("Estado: "+obj_3.getEstado());
        obj_3.setColor("Negro");
         System.out.println("Color: "+obj_3.getColor());       
        
        System.out.println("Abanico 4");
        Abanico obj_4=new Abanico("Azul","Sankey",true);
        System.out.println("Color: "+obj_4.getColor());
        System.out.println("Marca: "+obj_4.getMarca());
        System.out.println("Estado: "+obj_4.getEstado());
        
        
//        Abanico obj_2=new Abanico();
           
//        System.out.println("Abanico 1");
//        System.out.println("Ingrese Color:");
//        color=sc.next();
//        
//        obj_1.setEstado(true);
//        obj_1.setColor(color);
//        System.out.println("Color: "+obj_1.getColor());
//        System.out.println("Ingrese Otro Color:");
//        color=sc.next();
//        obj_1.setColor(color);
//        
//        System.out.println("Color: "+obj_1.getColor());
//        System.out.println("Abanico 2");
//        System.out.println("Ingrese Color:");
//        color=sc.next();
//        obj_2.setEstado(false);
//        obj_2.setColor(color);
//        
//        System.out.println("Abanico 1");
//        System.out.println("Estado: "+obj_1.getEstado());
//        System.out.println("Color: "+obj_1.getColor());
//        System.out.println("Abanico 2");
//        System.out.println("Estado: "+obj_2.getEstado());
//        System.out.println("Color: "+obj_2.getColor());
  
do
{
    System.out.println("Selecciones Opción del Abanico \n 1.Encender \n 2.Apagar \n 3.Ver Estado \n 4.Salir");
    opc=sc.nextInt();    
    switch(opc)
    {
        case 1:
            obj_1.Prender();
            break;
        case 2:
            obj_1.Apagar();
            break;
        case 3:
            boolean sw=false;
            if(obj_1.getEstado()==sw)
            {
                System.out.println("El Abanico se encuentra: Apagado");            
            }
            else
            {System.out.println("El Abanico se encuentra: Encendido");            
            }
            break;
        case 4:
            opc=4;
            break;
        default:
            System.out.println("Solo Opciones del Menu"); 
            break;
    
    }
}
while(opc!=4);       
    }
    
}
