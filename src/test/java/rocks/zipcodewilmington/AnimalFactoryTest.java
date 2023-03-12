package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreateDog(){
        Date today = new Date ();
        Dog dog = AnimalFactory.createDog("Skip", today);

        String expected= "Skip";

        String actual = dog.getName();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testCreateCat(){  Date expectedDate = new Date();
        Date today = new Date ();
        Cat cat = AnimalFactory.createCat("Skip", today);

        String expected= "Skip";

        String actual = cat.getName();
        Assert.assertEquals(expected,actual);

    }





}
