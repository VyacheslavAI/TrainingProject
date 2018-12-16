import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestCalculator {

    @Before
    public void before1() {
        System.out.println("before1");
    }

    @Before
    public void before2() {
        System.out.println("before2");
    }

    @After
    public void after1() {
        System.out.println("after1");
    }

    @After
    public void after2() {
        System.out.println("after2");
    }


    @BeforeClass
    public static void beforeClass1() {
        System.out.println("beforeClass1");
    }

    @BeforeClass
    public static void beforeClass2() {
        System.out.println("beforeClass2");
    }

    @AfterClass
    public static void afterClass1() {
        System.out.println("afterClass1");
    }

    @AfterClass
    public static void afterClass2() {
        System.out.println("afterClass2");
    }


    int firstParam;
    int secondParam;
    int expected;

    public TestCalculator(int firstParam, int secondParam, int expected) {
        this.firstParam = firstParam;
        this.secondParam = secondParam;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Collection<Integer[]> setParams() {
        return Arrays.asList(new Integer[][]{
                {2, 5, 7},
                {1, 9, 10},
                {6, 12, 18}
        });
    }


    @Test(timeout = 10)
    public void testAdd() {
        System.out.println("test");
        Calculator calculator = new Calculator();
        int result = calculator.add(firstParam, secondParam);
        Assert.assertEquals(expected, result);
    }

    @Test(expected = RuntimeException.class)
    @Ignore(value = "this is ignore annotation stays here just for test")
    public void testDivide() throws Exception {
        throw new Exception();
//        Calculator calculator = new Calculator();
//        calculator.divide(1, 0);
    }
}