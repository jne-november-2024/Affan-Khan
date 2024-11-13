@FunctionalInterface
interface A {
    void show(); 
}

class Lambda {
    public static void main(String[] args) {
      
        A obj = () -> System.out.println("In void show");

        
        obj.show();
    }
}

