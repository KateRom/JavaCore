package com.kateromaniv.app.classwork.lesson8;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/*Created by katr on 24.04.2017.
 */
public class CharArrayTest {
    CharArray charArray;

    @Before
    public void setUp(){ charArray = new CharArray();}
    @Test
    public void charArrayTest(){
        char[] inputArray = new char[128];
        String expResult = " !, \", #, $, %, &, ', (, ), *, +, ,, -, ., /, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, :, ;, <, =, >, ?, @, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, [, \\, ], ^, _, `, a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, {, |, }, ~, \u007F]"
                        .replace(",","")
                        .replace("[","")
                        .replace("]","")
                        .replace("","")
                        .trim();
        String charArr = Arrays.toString(CharArray.charArray(inputArray))
                .replace(",","")
                .replace("[","")
                .replace("]","")
                .replace("","")
                .trim();
        Assert.assertEquals(expResult, charArr);
    }
}
