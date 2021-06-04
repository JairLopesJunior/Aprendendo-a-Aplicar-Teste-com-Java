package com.junittest;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.fail;

public class ExceptionTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void empty(){
        new ArrayList<Object>().get(0);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldTestExceptionMessage(){
        List<Object> list  = new ArrayList<>();

        expectedException.expect(IndexOutOfBoundsException.class);
        expectedException.expectMessage("Index: 0, Size: 0");
        list.get(0);
    }

    @Test
    public void testExceptionMessage(){
        try{
            new ArrayList<Object>().get(0);
            fail("Esperado que IndexOutOfBoundsException seja lançada.");
        }catch(IndexOutOfBoundsException e){
            Assert.assertThat(e.getMessage(), is("Index: 0, Size: 0"));
        }
    }
}
