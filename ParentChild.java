package Encapsulation_Inheritance;


public class ParentChild {
    
    
     class Parent {
       
        void printParent() {
            System.out.println("This is parent class");
        }
    }

  
    class Child extends Parent {
  
        void printChild() {
            System.out.println("This is child class");
        }
    }

    public static void main(String[] args) {
     
      ParentChild p = new ParentChild();
        
        Parent parent = p.new Parent();
       parent.printParent();

        Child child = p.new Child();
        child.printChild();

   
        child.printParent();
    }
}

