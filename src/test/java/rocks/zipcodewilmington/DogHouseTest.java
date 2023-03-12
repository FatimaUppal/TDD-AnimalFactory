package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
@Test
    public void addDogTest() {
    //Given
    DogHouse.clear();
    Dog dog = new Dog("", new Date(), null);
    Integer actual = 0;
    Integer expected = 0;
    Assert.assertEquals(expected, actual);


    //When
    DogHouse.add(dog);

    //Then
    expected = DogHouse.getNumberOfDogs();
}
@Test
    public void removeByIdTest() {
    //Given
    DogHouse.clear();
    Dog dog = new Dog("", new Date(), 0);
    Integer actual = 0;
    Integer expected = 0;
    Assert.assertEquals(expected, actual);
    DogHouse.add(dog);


    //When
    DogHouse.remove(1);

    //Then
    expected = DogHouse.getNumberOfDogs();
}
@Test
public void removeDogDogTest() {
    //Given
    DogHouse.clear();
    Dog dog = new Dog("", new Date(), null);
    Integer actual = null;
    Integer expected = null;
    Assert.assertEquals(expected, actual);
    DogHouse.add(dog);


    //When
    DogHouse.remove(dog);

    //Then
    expected = DogHouse.getNumberOfDogs();
}
    @Test
    public void getDogByIdTest() {
        //Given
        DogHouse.clear();
        Dog dog = new Dog("", new Date(), 0);
        Integer expected = null;
        Dog actual = null;
        Assert.assertEquals(expected, actual);
        DogHouse.add(dog);


        //When
        actual = dog;

        //Then
        expected = DogHouse.getNumberOfDogs();
    }

}
