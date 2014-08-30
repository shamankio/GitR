package study;


import java.util.Arrays;

public class ServiseDelegate {
    private final Person resource;
    public ServiseDelegate(Person resource){
        this.resource=resource;
    }
    public Person[]merge(Person[]ar1,Person[]ar2) {
        int i = ar1.length + ar2.length;
        Person[] ar = new Person[i];
        System.out.println("merge:");
        ar = Arrays.copyOf(ar1, i);
        int c, d, f = 0, e = i;
        boolean pp = false;
        for (c = 0; c < ar2.length; c++) {
            for (d = 0; d < ar1.length; d++) {
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
            System.out.printf("name=%1$5s number=%2$5s%n", ar[i].getName(), ar[i].getNumber());
        }
        return ar;
        resource.merge();
    }
}
