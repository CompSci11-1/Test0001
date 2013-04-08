/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test0001;

/**
 *
 * @author kevin.lawrence
 */
public class Test0001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This is the third test");
        testMammals();
    }

    private static void testMammals() {
        Mammal mammal = new Mammal();
        System.out.println("First mammal is a " + mammal.getType());

        Pig pig = new Pig();
        System.out.println("Second mammal is a " + pig.getType());
    }
}
