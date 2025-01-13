package utils;

import org.testng.Assert;

public class AssertionsUtil {

    /**
     * Asserts that two strings are equal.
     *
     * @param actual   The actual string value.
     * @param expected The expected string value.
     * @param message  The message to display if the assertion fails.
     */
    public static void assertEquals(String actual, String expected, String message) {
        Assert.assertEquals(actual, expected, message);
    }

    /**
     * Asserts that two integers are equal.
     *
     * @param actual   The actual integer value.
     * @param expected The expected integer value.
     * @param message  The message to display if the assertion fails.
     */
    public static void assertEquals(int actual, int expected, String message) {
        Assert.assertEquals(actual, expected, message);
    }

    /**
     * Asserts that a condition is true.
     *
     * @param condition The condition to evaluate.
     * @param message   The message to display if the assertion fails.
     */
    public static void assertTrue(boolean condition, String message) {
        Assert.assertTrue(condition, message);
    }

    /**
     * Asserts that a condition is false.
     *
     * @param condition The condition to evaluate.
     * @param message   The message to display if the assertion fails.
     */
    public static void assertFalse(boolean condition, String message) {
        Assert.assertFalse(condition, message);
    }

    /**
     * Asserts that an object is not null.
     *
     * @param object  The object to evaluate.
     * @param message The message to display if the assertion fails.
     */
    public static void assertNotNull(Object object, String message) {
        Assert.assertNotNull(object, message);
    }

    /**
     * Asserts that an object is null.
     *
     * @param object  The object to evaluate.
     * @param message The message to display if the assertion fails.
     */
    public static void assertNull(Object object, String message) {
        Assert.assertNull(object, message);
    }

    /**
     * Asserts that two lists are equal.
     *
     * @param actual   The actual list.
     * @param expected The expected list.
     * @param message  The message to display if the assertion fails.
     */
    public static <T> void assertListsEqual(java.util.List<T> actual, java.util.List<T> expected, String message) {
        Assert.assertEquals(actual, expected, message);
    }

    /**
     * Asserts that a string contains a substring.
     *
     * @param fullString The full string to search.
     * @param substring  The substring to look for.
     * @param message    The message to display if the assertion fails.
     */
    public static void assertStringContains(String fullString, String substring, String message) {
        Assert.assertTrue(fullString.contains(substring), message);
    }



}
