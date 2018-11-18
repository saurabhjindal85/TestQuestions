package org.com.animal.insect;

import org.com.animal.Animal;
import org.com.animal.CommonFunctions;
/*
Metamorphosis from caterpillar to butterfly achieved using the transform function 
insect first state is Caterpillar and using transform function we will change it from caterpillar to Butterfly*/

public class FromCaterPillarToButterfly  implements Insect {

    private Insect state = new CaterpillarState();

    public void fly() { state.fly(); }
    public void walk() {state.walk();}
    public void sing() {state.sing(); }

    public void transform() { state = new ButterflyState(); }

    private class ButterflyState implements Insect {
        public void fly() { System.out.println("Butterfly can Fly"); }
        public void walk() { System.out.println("Butterfly cannot walk"); }
        public void sing() { System.out.println("Butterfly does not make Sound"); } 
    }

    private class CaterpillarState  implements Insect {
        public void fly() {  System.out.println("Caterpillar cannot Fly"); }
        public void walk() { System.out.println("Caterpillar can walk"); }
        public void sing() { System.out.println("Caterpillar does not make Sound"); }             
    }
}
