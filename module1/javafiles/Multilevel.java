class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void sound() {
        System.out.println("Puppy barks softly");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.sound();  
    }
}
