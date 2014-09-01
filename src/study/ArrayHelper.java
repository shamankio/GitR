package study;

import java.util.Arrays;


public class ArrayHelper {
    private Fish[] ar1;
    private Fish[] ar2;

    Fish[]mergeFish(Fish[]ar1,Fish[]ar2){
        this.ar1 = ar1;
        this.ar2 = ar2;
        int i = ar1.length+ar2.length;
        Fish[] ar = new Fish[i];
        System.out.println("merge:");
        ar = Arrays.copyOf(ar1, i);
        int c,d,f = 0,e=i;
        boolean pp = false;
        for (c = 0; c < ar2.length; c++) {
            for (d=0;d<ar1.length;d++) {
                if ((ar2[c].equals(ar1[d]))) {
                    pp = false;
                    break;
                }
                pp = true;
            }
            if (pp) {
                ar[ar1.length + f] = ar2[c];
                f++;
                e = ar1.length + f;
                pp = false;
            }

        }

        ar = Arrays.copyOf(ar, e);
        for (i = 0; i < ar.length; i++) {
            System.out.printf("name=%1$7s color=%2$7s type=%3$7s%n", ar[i].getName(), ar[i].getColor(), ar[i].getType());
        }
        return ar;

    }
 }
