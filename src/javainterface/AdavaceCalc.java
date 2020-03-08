package javainterface;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class AdavaceCalc implements Calc {

    public static void main(String[] args) {

    AdavaceCalc obj1 = new AdavaceCalc();
        obj1.add();
        obj1.sub();
        obj1.calculatecos();
        obj1.calculatesic();

    }


    public void calculatesic (){
        System.out.println("I am in sin mehtod ");

    }

    public void calculatecos(){
        System.out.println("I am in cos method ");

    }

    @Override
    public void add() {
        System.out.println("I am in add method ");
    }

    @Override
    public void sub() {

        System.out.println("I am in sub method ");

    }
}
