package ro.fmi.unibuc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by User on 3/19/2017.
 */
public class SumaCifrelorTest {

    private SumaCifrelor adder;

    @Before
    public void initialize(){
        adder = new SumaCifrelor();
    }

    @Test
    public void test1() throws Exception {
        Integer sum = adder.compute(12,13);
        Assert.assertEquals(sum, new Integer(7));
    }

    @Test
    public void test2() throws Exception {
        Integer sum = adder.compute(4,4);
        Assert.assertEquals(sum, new Integer(8));
    }

    @Test
    public void test3() throws Exception {
        Integer sum = adder.compute(58,99);
        Assert.assertEquals(sum, new Integer(31));
    }

    @Test
    public void test4() throws Exception {
        Integer sum = adder.compute(1,52);
        Assert.assertEquals(sum, new Integer(8));
    }

    @Test
    public void test5() throws Exception {
        Integer sum = adder.compute(84,100);
        Assert.assertEquals(sum, new Integer(13));
    }

    @Test
    public void test6() throws Exception {
        Integer sum = adder.compute(10, 100);
        Assert.assertEquals(sum, new Integer(2));
    }

    @Test
    public void test7() throws Exception {
        Integer sum = adder.compute(1,1);
        Assert.assertEquals(sum, new Integer(2));
    }

    @Test(expected=Exception.class)
    public void testThatItShouldThrowException() throws Exception {
        adder.compute(-1, 1);
    }

    @Test(expected=Exception.class)
    public void testThatItShouldThrowException2() throws Exception {
        adder.compute(120, 55);
    }

    @Test(expected=Exception.class)
    public void testThatItShouldThrowException3() throws Exception {
        adder.compute(12, -1);
    }

    @Test(expected=Exception.class)
    public void testThatItShouldThrowException4() throws Exception {
        adder.compute(10000,5555);
    }

    @Test(expected=Exception.class)
    public void testThatItShouldThrowException5() throws Exception {
        adder.compute(12,444);
    }

    @Test(expected=NullPointerException.class)
    public void testThatItShouldThrowException6() throws Exception {
        adder.compute(null,44);
    }

    @Test(expected=NullPointerException.class)
    public void testThatItShouldThrowException7() throws Exception {
        adder.compute(55,null);
    }


}
