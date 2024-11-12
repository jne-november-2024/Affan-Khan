@FunctionalInterface
interface A {
    void show(int i); 
}

class Lambda1 {
    public static void main(String[] args) {
      
        A obj =  i -> System.out.println("In void show   "+i);

        
        obj.show(7);
    }
}

