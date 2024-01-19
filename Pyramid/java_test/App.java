/* Nawaphon Makornsirisri พัฒนาต่อ*/
/* Credit by uniwuttinan */

package java_test;

public class App {
    /**
     * เมทอด main เป็นจุดเริ่มต้นของโปรแกรม
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Pyramid with size 3:");
        PyramidMaker pyramidMaker3 = new PyramidMaker(3);
        pyramidMaker3.create();
        pyramidMaker3.print();

        System.out.println("\nPyramid with size 5:");
        PyramidMaker pyramidMaker5 = new PyramidMaker(5);
        pyramidMaker5.create();
        pyramidMaker5.print();

        System.out.println("\nPyramid with size 10:");
        PyramidMaker pyramidMaker10 = new PyramidMaker(10);
        pyramidMaker10.create();
        pyramidMaker10.print();
    }
}
