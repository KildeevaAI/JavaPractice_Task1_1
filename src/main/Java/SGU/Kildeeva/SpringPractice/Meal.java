package SGU.Kildeeva.SpringPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.HashSet;
import java.util.Set;

public class Meal implements Cooker{
    Set<Products> products = new HashSet<Products>();

    public void Cook() {
        System.out.println(products);
    }

    public Set<Products> getProducts() {
        return products;
    }

    public void setProducts(Set<Products> products) {
        this.products = products;
    }
}
