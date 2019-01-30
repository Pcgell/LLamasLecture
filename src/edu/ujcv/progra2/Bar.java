package edu.ujcv.progra2;

public class Bar {

    private Foo m_foo;


    public Foo getM_foo() {
        return m_foo;
    }

    public void setM_foo(Foo m_foo) {
        this.m_foo = m_foo;
    }

    public Bar(){
        this.m_foo = new Foo();
        m_foo.setMensaje("mensaje Bar");
    }

    public Bar(Bar aCopiar){
        this.m_foo = new Foo(aCopiar.m_foo);
    }

    public void presentFoo(){
        System.out.println(this.m_foo.getMensaje());
    }

}
