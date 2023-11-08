
package com.mycompany.mavenproject1;
public class Barco extends Veiculo{
    
    public void navegar(){
        System.out.println("Navegando...");
    } 
       @Override
       public void abastecer(){
        System.out.println("Abastecendo com diesel...");
    
    }
    
}
