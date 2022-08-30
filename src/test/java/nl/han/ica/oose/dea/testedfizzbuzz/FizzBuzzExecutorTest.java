package nl.han.ica.oose.dea.testedfizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzExecutorTest {

    private FizzBuzzExecutor sut;

    @BeforeEach
    public void setup(){
        //Arrange
        sut = new FizzBuzzExecutor();
    }


    @Test
    void executeWithValidIntTest() {
        //Act
        var actual = sut.execute(37);

        //Assert
        Assertions.assertEquals(actual, "37");
    }

    @Test
    void doesThreeResultInFizzTest(){
        //Act
        var actual = sut.execute(3);

        //Assert
        Assertions.assertEquals(actual, "Fizz");
    }

    @Test
    void doesFiveResultInBuzzTest(){
        //Act
        var actual = sut.execute(5);

        //Assert
        Assertions.assertEquals(actual, "Buzz");
    }

    @Test
    void doesFifteenResultInFizzBuzzTest(){
        //Act
        var actual = sut.execute(15);

        //Assert
        Assertions.assertEquals(actual, "FizzBuzz");
    }


}