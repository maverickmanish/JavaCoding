package y2021;

import java.util.ArrayList;

class AA {
}

class BB extends AA {
}

class C extends BB {
}

public class Naatu {

    public static void main(String[] args) {
        ArrayList<AA> x = new ArrayList<AA>();
        ArrayList a = new ArrayList();
        x.add(new AA());
        a = x;
        a.add(new BB());
        ArrayList b = a;
        ArrayList<C> c = (ArrayList<C>) b;
        c.add(new C());
        a.add(new AA());
        for (Object obj : c) {
            System.out.println(obj);
        }
    }

}
