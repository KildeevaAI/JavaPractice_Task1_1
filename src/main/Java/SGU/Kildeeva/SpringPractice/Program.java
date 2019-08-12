package SGU.Kildeeva.SpringPractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        VegMeal vegMeal = context.getBean("VegMealBean1", VegMeal.class);

        vegMeal.Cook();

        Vegetables veg1 = context.getBean("VegBean1", Vegetables.class);
        Vegetables veg2 = context.getBean("VegBean1", Vegetables.class);

        veg1.displayInfo();
        veg2.displayInfo();

        System.out.println(veg1 == veg2); //указывает на разные объекты

        Chef chefMeal = context.getBean("ChefBean", Chef.class);
        chefMeal.ChefCook();


        context.close();
    }
}
