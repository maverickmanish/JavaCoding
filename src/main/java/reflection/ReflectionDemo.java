package reflection;

class Parent {
    int a;
    int b;

    public Parent() {
        // TODO Auto-generated constructor stub
    }

    public Parent(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }

    public Parent(int a) {
        super();
        this.a = a;
    }
}

class child extends Parent {
}

public class ReflectionDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }
}
