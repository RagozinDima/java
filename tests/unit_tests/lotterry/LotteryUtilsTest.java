package unit_tests.lotterry;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import intro_Java.week3.UnitTests.LotteryUtils;

/**
 * Created by Joker on 04.01.2017.
 */
@RunWith(JUnit4.class)
public class LotteryUtilsTest {

    @Test
    public void generSixNumbersTest() {
        int[] result = LotteryUtils.generSixNumbers(1, 42);
        Assert.assertTrue(result.length == 6);

        for (int i = 0; i < result.length; i++) {
            Assert.assertTrue(result[i] >= 1 && result[i] <= 42);
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                Assert.assertTrue(result[i] != result[j]);
            }

        }
    }
    @Test
    public void countSameNumbersTest1(){

        int[] lottery = {1, 2, 3, 4, 5, 6};
        int[] user = {1, 2, 3, 4, 5, 6};
        int result = LotteryUtils.countSameNumbers(lottery, user);

        Assert.assertEquals(6, result);
    }
    @Test
    public void countSameNumbersTest2(){

        int[] lottery = {1, 2, 3, 4, 5, 6};
        int[] user = {11, 22, 33, 44, 55, 66};
        int result = LotteryUtils.countSameNumbers(lottery, user);

        Assert.assertEquals(0, result);
    }
    @Test
    public void countSameNumbersTest3(){

        int[] lottery = {1, 2, 3, 4, 5, 6};
        int[] user = {11, 2, 33, 4, 55, 66};
        int result = LotteryUtils.countSameNumbers(lottery, user);

        Assert.assertEquals(2, result);
    }

}