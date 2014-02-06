package org.cccs.dtd.example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by boycook on 06/02/2014.
 */
public class TestPerson {

    @Test
    public void constructorShouldWork() {
        Person p = new Person("Bob", "Smith", 20);

        assertThat(p.getFirstName(), is(equalTo("Bob")));
        assertThat(p.getLastName(), is(equalTo("Smith")));
        assertThat(p.getAge(), is(equalTo(20)));
    }
}
