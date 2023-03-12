package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

@Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
@Test
public void setName(){
        Cat cat = new Cat ("", new Date(), 0);
        String kitty = "Kitty";

        cat.setName(kitty);

        Assert.assertEquals(kitty,cat.getName());
}
@Test
    public void speakTest(){
        Cat cat = new Cat (null, null, null);
        String expected= "meow!";

        String actual= cat.speak();

        Assert.assertEquals(expected,actual);
    }
@Test
    public void setBirthDate(){
    Cat cat = new Cat (null, null, null);
    Date expected = new Date();

    cat.setBirthDate(expected);

    Date actual= cat.getBirthDate();
    Assert.assertEquals(expected,actual);
}
@Test
    public void eatTest(){
    Cat cat = new Cat(null, null, null);
    Food food = new Food();
    int expected = 1;

    cat.eat(food);
    int actual = cat.getNumberOfMealsEaten();

    Assert.assertEquals(expected, actual);
}
@Test
    public void getIdTest(){
        int expected = 2;
        Cat cat = new Cat(null, null, expected );

        int actual= cat.getId();

        Assert.assertEquals(actual,expected);
}
@Test
    public void animalInheritanceTest(){
        Cat cat = new Cat (null,null, null);

        Assert.assertTrue(cat instanceof Animal);

}
@Test
    public void mammalInheritanceTest(){
        Cat cat = new Cat (null, null, null);

        Assert.assertTrue(cat instanceof Mammal);
}

}


