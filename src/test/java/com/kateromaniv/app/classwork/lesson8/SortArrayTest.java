package com.kateromaniv.app.classwork.lesson8;

import com.kateromaniv.app.utils.ArraysAsParams;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static com.kateromaniv.app.utils.Consts.RESOURCES_PATH_ARRAYS;
import static java.util.Arrays.copyOfRange;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;

/*Created by katr on 24.04.2017.
 */
public class SortArrayTest {
    SortArray sortArray;
    private static final String INPUT_DATA = RESOURCES_PATH_ARRAYS + "forSortArrayInput.txt";
    private static int[][] inputData = null;
    private static final String OUTPUT_DATA = RESOURCES_PATH_ARRAYS + "forSortArrayOutput.txt";
    private static int[][] outputData = null;



    @Before
    public void preConditionsForTest() throws IOException {
        inputData = ArraysAsParams.readTheFile(INPUT_DATA);
        outputData = ArraysAsParams.readTheFile(OUTPUT_DATA);
    }

    @Before
    public void setUp(){sortArray = new SortArray();}

    @Test
    public void sortArrayTest() {
        for (int i = 0; i < inputData.length; i++) {
            int[] inputArray = copyOfRange(inputData[i], 0, inputData[i].length);
            int[] outputArray = copyOfRange(outputData[i], 0, outputData[i].length);
                Assert.assertArrayEquals(outputArray, SortArray.sortArray(inputArray));
                if (i==inputData.length){
                    Assert.assertThat(outputArray, not(equalTo(SortArray.sortArray(inputArray))));
                }
            }
        }
    }

