package com.kateromaniv.app.homework.lesson8;

import com.kateromaniv.app.utils.ArraysAsParams;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static com.kateromaniv.app.utils.Consts.RESOURCES_PATH_ARRAYS;

/*Created by katr on 26.04.2017.
 */
public class RandomMaxTest {
    RandomMax randomMax;
    private static final String INPUT_DATA = RESOURCES_PATH_ARRAYS + "forArrayPrintInput.txt";
    private static int[][] inputData = null;


    @Before
    public void preConditionsForTest() throws IOException {
        inputData = ArraysAsParams.readTheFile(INPUT_DATA);
    }

    @Before
    public void setUp(){randomMax = new RandomMax();}

    @Test
    public void randomArrayCreationTest(){
        int[][] inputA = new int[3][2];
        boolean outputA = true;
        if(RandomMax.randomValueForArray(inputA)!=null){
            outputA = true;
        }else { outputA = false;}
        Assert.assertEquals(true, outputA);
    }

    @Test
    public void randomMaxTest(){
        int[][] inputA = new int[3][2];
        boolean outputA = false;
        inputA = RandomMax.randomValueForArray(inputA);
        for(int i = 0; i<inputA.length; i++){
            for (int j = 0; j<inputA[i].length; j++){
                if (inputA[i][inputA[i].length-1]>=inputA[i][j]) {
                    outputA=true;
                }
            }
        }Assert.assertEquals(true, outputA);
    }

    @Test
    public void findMaxTest(){
        int expResult = 1000;
        Assert.assertEquals(expResult, RandomMax.findMax(inputData));
    }
}
