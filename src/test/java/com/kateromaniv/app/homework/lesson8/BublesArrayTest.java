package com.kateromaniv.app.homework.lesson8;

import com.kateromaniv.app.utils.ArraysAsParams;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static com.kateromaniv.app.utils.Consts.RESOURCES_PATH_ARRAYS;
import static java.util.Arrays.copyOfRange;

/*Created by katr on 26.04.2017.
 */
public class BublesArrayTest {
    BublesArrays bublesArrays;
    private static final String INPUT_DATA = RESOURCES_PATH_ARRAYS + "forSortArrayInput.txt";
    private static int[][] inputData = null;
    private static final String OUTPUT_DATA = RESOURCES_PATH_ARRAYS + "forSortArrayOutput.txt";
    private static int[][] outputData = null;
    private static final String OUTPUT_DATA1 = RESOURCES_PATH_ARRAYS + "forBublesArrayTestOutput.txt";
    private static int[][] outputData1 = null;


    @Before
    public void preConditionsForTest() throws IOException {
        inputData = ArraysAsParams.readTheFile(INPUT_DATA);
        outputData = ArraysAsParams.readTheFile(OUTPUT_DATA);
        outputData1 = ArraysAsParams.readTheFile(OUTPUT_DATA1);
    }

    @Before
    public void setUp(){bublesArrays = new BublesArrays();}

    @Test
    public void bublesArrayTest(){
        for (int i = 0; i < inputData.length; i++) {
            int[] inputArray = copyOfRange(inputData[i], 0, inputData[i].length);
            int[] outputArray = copyOfRange(outputData[i], 0, outputData[i].length);
            int[] outputArray1 = copyOfRange(outputData1[i], 0, outputData1[i].length);
            Assert.assertArrayEquals(outputArray, BublesArrays.fromMinToMax(inputArray));
            Assert.assertArrayEquals(outputArray1, BublesArrays.fromMaxtoMin(inputArray));
        }
    }


}
