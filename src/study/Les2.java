package study;


import java.util.Arrays;

public class Les2 {
    public static void main(String [] args){
        Integer[] ar1=new Integer[]{1,5,4,23,65,32,78};
        Integer[] ar2=new Integer[]{3,5,24,4,1,2,34,45,32,5};
        int i = ar1.length+ar2.length;
        Integer[] ar=new Integer[i];
        ar=Arrays.copyOf(ar1,i);
        int c,d,f,e;
        f=0;
        e=0;
        for(c=0;c<ar1.length;c++){
            for(d=0;d<ar2.length;d++) {
                if (ar1[c].equals(ar2[d])) {
                    ar[ar1.length+f]=ar2[d];
                    f++;
                    e=ar1.length+f;

                }

            }

        }
        System.out.println(Arrays.toString(ar));
        ar=Arrays.copyOf(ar,e);
        System.out.println(Arrays.toString(ar));

    }
}
