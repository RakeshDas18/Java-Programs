// Interface X
interface X {
    void display();
}

// Interface Y
interface Y {
    void display();
}

// Class Z implements both X and Y
class Z implements X, Y {
    public void display() {
        System.out.println("Display from class Z");
    }
}

public class InterfaceMultipleInheritanceDemo {
    public static void main(String[] args) {
        Z obj = new Z();
        obj.display();
    }
}
