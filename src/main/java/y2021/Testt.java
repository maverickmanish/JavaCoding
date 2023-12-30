package y2021;

public class Testt {
    void display(Testt t) {
        System.out.println("testt");
    }

    void display(String str) {
        System.out.println("string");
    }

    public static void main(String[] args) {
        new Testt().display((String) null);
        /*
         * It'll give compiler error
         *
         *  new Testt().display(null); */
        new Testt().display((Testt) null);
    }


}

