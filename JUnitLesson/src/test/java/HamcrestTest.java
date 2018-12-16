import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestTest {

    @Test
    public void test() {
        String result = "one";

        assertThat(result, anything());
        assertThat(result, is(anything()));
        assertThat(result, is("one"));
        assertThat(result, not("two"));
        assertThat(result, anyOf(containsString("one"), containsString("two")));
        assertThat(result, allOf(containsString("one")));
        assertThat(result, is(anyOf(containsString("one"))));
        assertThat(result, is(any(String.class)));
        assertThat(result, equalTo(result));
        assertThat(result, any(String.class));
        assertThat(result, instanceOf(String.class));
        assertThat(result, notNullValue());
        assertThat(result, sameInstance(result));

        List<Integer> list = Arrays.asList(1, 4, 6);
        assertThat(list, hasItem(4));
        assertThat(list, hasItems(4, 6));

        Integer[] array = {1, 3, 6, 8, 4};
        assertThat(array, hasItemInArray(4));

        double d = 6;
        assertThat(d, closeTo(6, 0.5));

        int i = 2;
        assertThat(i, greaterThan(1));

        String s = "hello";
        assertThat(s, equalToIgnoringCase("HELlo"));
        assertThat(s, equalToIgnoringWhiteSpace("hello"));
        assertThat(s, containsString("hel"));
    }
}