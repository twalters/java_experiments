package twalters.experiments.canYouExtendUtilClass;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Looks like you CAN override a utility class, BUT against checkstyle, there has to be a public constructor, even
 * though we don't ever want to call it.
 *
 * Why would we want to be able to override static util classes?
 * To mix object oriented programming with functional programming. These "static classes" are functions that will
 * operate on some POJO. So we have our immutable data objects that contain no behavior, and then we have all the
 * "procedures" that contain the behavior for the POJOs. Being able to inherit means that we can easily add more
 * functionality to a procedure that just doesn't quite do what we want and we don't have to re add all the other
 * methods provided by a library.
 */
public final class MyUtilsExtensionTest {

    public static final String TEST_VALUE = MyUtilsExtension.someManipulation("test");

    @Test
    public void test() {
        assertEquals("Should be able to call first-class static method.",
            TEST_VALUE, MyUtilsExtension.doSomething(TEST_VALUE));
        assertEquals("Would like to be able to call super static method from inherited class",
            TEST_VALUE, MyUtilsExtension.doSomething(TEST_VALUE));

        assertTrue("MyUtils override says this is true.", MyUtils.isNotBlank(""));
    }
}
