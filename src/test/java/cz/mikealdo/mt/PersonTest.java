package cz.mikealdo.mt;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PersonTest {

    @Test
    public void shouldNotBeInRetirement() throws Exception {
        Person person = new Person(59);

        assertFalse(person.isInRetirement());
    }

    @Test
    public void shouldNotBeInRetirementForSixtyYearOldMan() throws Exception {
        Person person = new Person(60);

        assertFalse(person.isInRetirement());
    }

    @Test
    public void shouldBeInRetirement() throws Exception {
        Person person = new Person(61);

        assertTrue(person.isInRetirement());
    }

    @Test
    public void shouldBeInRetirementBeforeLimit() throws Exception {
        Person person = new Person(79);

        assertTrue(person.isInRetirement());
    }

    @Test
    public void shouldNotBeInRetirementForEightyYearOldMan() throws Exception {
        Person person = new Person(80);

        assertFalse(person.isInRetirement());
    }

    @Test
    public void shouldNotBeInRetirementForEightyOneYearOldMan() throws Exception {
        Person person = new Person(81);

        assertFalse(person.isInRetirement());
    }
}