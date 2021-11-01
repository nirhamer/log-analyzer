package il.nir.windowfunction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * Test how to calculate sum of 3 consequent numbers
 * Should ignore first two lines of input because of inaccurate results
 */
class CalcSumTest {


    @Test
    void testWindowSumExcel() {
        int[] excelData = {451, 45, 78, 484, 369, 484};
        int[] expectedSums = {574, 607, 931, 1337};
        assertThat(CalcSum.windowSum(excelData, 3)).isEqualTo(expectedSums);
    }

    @Test
    void testWindowTooSmallData() {
        int[] smallData = {1, 2};
        int[] expectedSums = {};
        assertThat(CalcSum.windowSum(smallData, 3)).isEqualTo(expectedSums);
    }

    @Test
    void testWindowSize1() {
        final int length = 100;
        int[] sourceData = new int[length];
        int[] expectedSums = new int[length];
        for (int i = 0; i < length; i++) {
            sourceData[i] = expectedSums[i] = i * 10;
        }
        assertThat(CalcSum.windowSum(sourceData, 1)).isEqualTo(expectedSums);
    }

    @Test
    void testDataEqualsWindow() {
        int[] windowSizeData = {1, 2, 3, 4};
        int[] expectedSums = {10};
        assertThat(CalcSum.windowSum(windowSizeData, windowSizeData.length)).isEqualTo(expectedSums);
    }

}