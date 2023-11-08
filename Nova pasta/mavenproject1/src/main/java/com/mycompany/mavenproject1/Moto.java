
package com.mycompany.mavenproject1;
public class Moto extends Veiculo implements iTerrestre{
    @Override
    public void andar(){
        System.out.println("andando...");
    } 
       @Override
       public void abastecer(){ 
        System.out.println("Abastecendo com gasolina...");
    
    }
}
    

