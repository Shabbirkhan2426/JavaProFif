package abstract1;

import java.sql.SQLOutput;

public class HRTeam extends ITDept {

    public static void main(String[] args) {

        //Mukesh video

        HRTeam hr = new HRTeam();
        hr.Goodies();
        hr.Work();
        hr.Salary();
        hr.bonus();

        ITDept it = new HRTeam() ;
        it.Goodies();
        it.Work();
        it.Salary();

        //if your class is not fully implemented then we will not allow you to create object
        //Interface we dont have single method implemented
        //Interface is 100% abastract class

    }
    public void bonus(){

        System.out.println("Bonus is 1lK");
    }

    @Override
    public void Salary() {
        System.out.println("5L");
    }
}
