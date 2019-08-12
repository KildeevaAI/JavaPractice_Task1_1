package SGU.Kildeeva.SpringPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Chef {
    private Meal meal;

    @Autowired

    public Chef( @Qualifier("VegMealBean1") Meal meal) {
        this.meal = meal;
    }

    public void ChefCook()
    {
        System.out.println("Шеф повар готовит из: ");
        meal.Cook();
    }
}
