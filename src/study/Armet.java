package study;


import java.util.Arrays;

public class Armet {
     HW32[]merge(HW32[]ar1,HW32[]ar2){
        int i = ar1.length+ar2.length;
        HW32[] ar = new HW32[i];
        System.out.println("merge:");
        ar = Arrays.copyOf(ar1, i);
        int c,d,f = 0,e=i;
        boolean pp = false;
        for (c = 0; c < ar2.length; c++) {
            for (d=0;d<ar1.length;d++) {
                System.out.println("d= "+d+"c="+c);
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
            System.out.println(Arrays.toString(ar));
        }

        ar = Arrays.copyOf(ar, e);
        for (i = 0; i < ar.length; i++) {
            System.out.printf("name=%1$5s number=%2$5s%n", ar[i].getName(), ar[i].getNumber());
        }
        return ar;

    }
    HW32[]innerJoin(HW32[]ar1,HW32[]ar2){
        System.out.println("inner join:");
        HW32[] ijo = new HW32[ar1.length + ar2.length];
        int c1, d1, f1 = 0, e1 = 0;
        boolean pp1 = false;
        for (c1 = 0; c1 < ar2.length; c1++) {

            for (d1 = 0; d1 < ar1.length; d1++) {
                if ((ar1[d1].equals(ar2[c1]))) {
                    pp1 = true;
                    break;
                }

            }
            if (pp1) {
                ijo[f1] = ar2[c1];
                f1++;
                e1 = f1;
                pp1 = false;
            }

        }

        ijo = Arrays.copyOf(ijo, e1);
         for (int i = 0; i < ijo.length; i++) {
            System.out.printf("name=%1$5s number=%2$5s%n", ijo[i].getName(), ijo[i].getNumber());
        }
        return ijo;
    }
    HW32[]outerJoin(HW32[]ar1,HW32[]ar2){
        System.out.println("outer join:");
        HW32[] ojo = new HW32[ar1.length + ar2.length];
        int c2, d2, f2 = 0, e2 = 0;
        boolean pp2 = false;
        for (c2 = 0; c2 < ar2.length; c2++) {
            for (d2 = 0; d2 < ar1.length; d2++) {
                if ((ar2[c2].equals(ar1[d2]))) {
                    pp2 = false;
                    break;
                } else {
                    if (!(ar2[c2].equals(ar1[d2]))) {
                        pp2 = true;
                    }
                }
            }
            if (pp2) {
                ojo[f2] = ar2[c2];
                f2++;
                e2 = f2;
            }
        }

        ojo = Arrays.copyOf(ojo, e2);
        for (int i = 0; i < ojo.length; i++) {
            System.out.printf("name=%1$5s number=%2$5s%n", ojo[i].getName(), ojo[i].getNumber());
        }
        return ojo;
    }
}
