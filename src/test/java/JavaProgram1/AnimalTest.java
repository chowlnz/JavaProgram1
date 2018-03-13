package JavaProgram1;

import JavaProgram1.domain.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    // here is to declare the animal
    // by putting it here means this is global so can be used by other mtd

    private Animal dog = new Animal();

    //create a mtd in here but every method needs to have the @test so that you can test
    @Test
    public void octopusTest() {

        Animal octopus = new Animal();
        octopus.setName("Slimy");
        octopus.setColor("Orange");
        octopus.setNoOfLegs(8);

        assertEquals(octopus.getName(), "Slimy");
        assertEquals(octopus.getColor(), "Orange");
        assertEquals(octopus.getNoOfLegs(), 8);
    }

    @Test
    public void dogNameTest() {
        //set the name of the animal
        dog.setName("Luckie");
        assertEquals(dog.getName(), "Luckie");
    }

    @Test
    public void dogColorTest() {
        //set the color of the animal
        dog.setColor("White");
        assertEquals(dog.getColor(), "White");
    }

    @Test
    public void dogNoOfLegsTest() {
        //set the number of legs of the animal
        dog.setNoOfLegs(2);
        assertEquals(dog.getNoOfLegs(), 4);
    }
}
