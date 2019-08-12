package SGU.Kildeeva.SpringPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.HashSet;
import java.util.Set;


public class VegMeal extends Meal{
    @Autowired
    Set<Vegetables> products = new HashSet<Vegetables>();
}
