package com.kateromaniv.app.homework.lesson8;

import java.util.*;

/*Created by katr on 18.04.2017.
 */
public class ChildrenKnowledgeCheck {
    public static int[][] numbersForCheck(int[][] d) {
        Random random = new Random();
        int i = 2;
        int a;
        int counter = 0;
        int z = 8;
        int stepUp = 0;
        boolean flagToLoop;
        for (int j = 0; j < d.length; j++) {
            for (int k = 0; k < d[j].length; k++) {
                switch (k) {
                    case 0:
                        d[j][k] = i;
                        break;
                    default:
                        do {
                            flagToLoop = false;
                            a = random.nextInt(10 - i) + i;
                            for (int c = stepUp; c <= j; c++) {
                                int[][] u = new int[d.length][d[j].length];
                                u[c][k] = a;
                                if (u[c][k] == d[c][k]) {
                                    flagToLoop = true;
                                    break;
                                }
                            }
                        } while (flagToLoop);
                        d[j][k] = a;
                        counter++;
                        break;
                }
                if (counter == z && z > 0) {
                    i++;
                    stepUp += z;
                    z--;
                    counter = 0;
                }
            }
        }return d;
    }
}





