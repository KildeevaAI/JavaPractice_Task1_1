package SGU.Kildeeva.SpringPractice;


import org.springframework.beans.factory.annotation.Qualifier;

public class Vegetables extends Products{

    public Vegetables(String Name, int CalorificValue, int Amount){
        super(Name, CalorificValue, Amount);
    }
}
