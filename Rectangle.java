package Encapsulation_Inheritance;

public class Rectangle {
    int length;
    int breadth;
    
   
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    void printArea() {
        int area = length * breadth;
        System.out.println("Area = " + area);
    }
    

    void printPerimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter = " + perimeter);
    }

    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.printArea();
        rectangle.printPerimeter();
        
       /* Ssquare square = new Ssquare(4);
        square.printArea();
        square.printPerimeter();
    }
        */
        
        
        
        //Using array
        Ssquare[] squares = new Ssquare[10];
        
        // Initialize the Square objects with side lengths 1 to 10
        for (int i = 0; i < squares.length; i++) {
            squares[i] = new Ssquare(i + 1);
        }
        
        // Print the area of each square
        for (Ssquare square : squares) {
            square.printArea();
        }
   
    
    }
   }


