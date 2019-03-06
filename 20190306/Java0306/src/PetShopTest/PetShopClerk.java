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
public class PetShopClerk {
    
    private Dogfeed dogfeed;
    
    public void setDogfeed(Dogfeed dogfeed) {
        this.dogfeed = dogfeed;
    }
    
    public void eat() {
        if (dogfeed == null) {
            System.out.println("사료가 없어요, 구매하세요!");
        }
        else {
         
        dogfeed.eat();
        }
    }
}
