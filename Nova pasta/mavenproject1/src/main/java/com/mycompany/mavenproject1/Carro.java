
package com.mycompany.mavenproject1;


public class Carro extends Veiculo implements iTerrestre{
    @Override
    public void andar(){
        System.out.println("andando...");
    } 
       @Override
       public void abastecer(){
        System.out.println("Carregando na tomada...");
    
    }
}
