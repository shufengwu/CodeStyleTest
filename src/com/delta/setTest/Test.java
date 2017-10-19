package com.delta.setTest;

interface A {
    void change();
}

public class Test {


    public static void main(String[] args) {
        new C().testChange();
    }


}

class C implements A {
    int test = 0;

    void testChange() {

        B b = new B(this);
        System.out.println(test + "");
        b.change();
        System.out.println(test + "");
    }

    @Override
    public void change() {
        test++;
    }

    class B implements A {
        A a;

        public B(A a) {
            this.a = a;
            System.out.println(this.a == a);
        }


        @Override
        public void change() {
            a.change();
        }
    }
}