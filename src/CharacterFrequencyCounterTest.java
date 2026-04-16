import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
    @Test
    void testcharactershowsupmultipletimesgivecorrectfrequency() {
        //Arrange 
        CharacterFrequencyCounter counter  = new CharacterFrequencyCounter("hello");
        //Act 
        int actual = counter.getFrequency('l');
        //Assert
        assertEquals(2, actual);
    }

    @Test 
    void testGetRelativeFrequencyREturns0ForMissingCharacter() {
        //Arrange 
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");
        //Act 
        double actual = counter.getRelativePercentage('x');
        //Assert
        assertEquals(40.0, actual, 0.0001);
    }
}
