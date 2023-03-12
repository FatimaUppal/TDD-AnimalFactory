package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


    @Test
    public void addCatTest(){
        Cat cat = new Cat ("", new Date(),0);

        CatHouse.add(cat);

        Integer actual= 1;

        Integer expected = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected,actual);

    }
@Test
    public void removeCatTest() {
    CatHouse.clear();

    Cat cat = new Cat("", new Date(), 1);

    CatHouse.add(cat);

    CatHouse.remove(1);

    Integer actual = 0;

    Integer expected = CatHouse.getNumberOfCats();

    Assert.assertEquals(expected, actual);
}

@Test
    public void removeCatCatTest(){
        CatHouse.clear();

        Cat cat = new Cat ("", new Date(), 0);

        CatHouse.add(cat);

        CatHouse.remove(cat);

        Integer actual= 0;

        Integer expected= CatHouse.getNumberOfCats();

        Assert.assertEquals(expected,actual);
    }
@Test
    public void getCatByIdTest(){
        CatHouse.clear();

        Cat cat = new Cat ("", new Date(), 0);

        CatHouse.add(cat);

        Cat expected =CatHouse.getCatById(0);

        Cat actual=cat;

        Assert.assertEquals(expected,actual);
    }
@Test
    public void getNumberOfCats() {
    //Given
    Cat cat = new Cat("", new Date(), 0);
    Integer actual = null;
    Integer expected = null;
    Assert.assertEquals(expected, actual);
    CatHouse.clear();

    //When
    CatHouse.add(cat);

    //Then
    expected = CatHouse.getNumberOfCats();

}
}



