/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetShopTest;

/**
 *
 * @author an
 */
public class Main {
    public static void main(String[] args) {
        
        PetShopClerk clerk;
        clerk = new PetShopClerk();
        
        clerk.eat();
        
        clerk.setDogfeed(new Origen());
        clerk.eat();
        
        clerk.setDogfeed(new Acana());
        clerk.eat();
    }
}
