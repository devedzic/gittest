/*
 * Created on Mar 12, 2015
 *
 */
package test;

import fruit.Apple;
import fruit.Pear;

public class Test {
    
    public void testApple() {
        Apple apple = new Apple("red", 5);
        System.out.println(apple);
    }
    
    public void testPear() {
        Pear pear = new Pear("very sweat");
        System.out.println(pear);
    }

}
