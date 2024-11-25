// Parent class A
class A {
    void display() {
        System.out.println("Display from class A");
    }
}

// Parent class B
class B {
    void display() {
        System.out.println("Display from class B");
    }
}

// Child class C trying to inherit from both A and B (this will cause an error)
class C extends A, B {
    void display() {
        System.out.println("Display from class C");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}