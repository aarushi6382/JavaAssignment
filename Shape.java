package Encapsulation_Inheritance;

public class Shape {
	

	    void printShape() {
	        System.out.println("This is shape");
	    }
	

    public static void main(String[] args) {
       
        Square square = new Square();
  
        square.printShape();      
        square.printRectangle();  
        square.printSquare();     
    }

}