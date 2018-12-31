package InterviewBuzz;

/**
 * Created by ls on 11/6/2018.
 */
public class Inheritance1
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        C c = new C ();
        System.out.println(c.ret().a);
        // this will fail
        // System.out.println(c.ret().b);
        System.out.println(((B)c.ret()).b);
    }
}

class C {

    A ret() {
        return new B();
    }

    // fail
    // B ret1() { return new A(); }
}

class A {
    int a;

    A() {
        this.a = 1;
    }
}

class B extends A {
    int b;

    B() {
        this.b = 2;
    }
}