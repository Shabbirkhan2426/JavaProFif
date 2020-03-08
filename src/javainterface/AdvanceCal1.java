package javainterface;

public class AdvanceCal1 implements Calc{

    public static void main(String[] args) {

        //Base class referece and child class object will only allow you to access base class method only
        //you can not create object of an interface because it has an abstract mehtod which does not have an any body


        Calc obj1 = new AdvanceCal1();


        obj1.add();
        obj1.sub();

    }

    @Override
    public void add() {

    }

    @Override
    public void sub() {

    }
}
