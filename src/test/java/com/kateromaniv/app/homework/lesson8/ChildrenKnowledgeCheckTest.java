package com.kateromaniv.app.homework.lesson8;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*Created by katr on 26.04.2017.
 */
public class ChildrenKnowledgeCheckTest {
    ChildrenKnowledgeCheck childrenKnowledgeCheck;

    @Before
    public void setup(){childrenKnowledgeCheck = new ChildrenKnowledgeCheck();}

    @Test
    public void knowledgeTest(){
        int[][] inputArray = new int[36][2];
        Assert.assertEquals(true, ChildrenKnowledgeCheck.numbersForCheck(inputArray)!=null);
    }
}
