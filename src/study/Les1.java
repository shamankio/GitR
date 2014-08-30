package study;

import java.util.Arrays;

public class Les1 {
    public static void main(String[] args){
        Integer[] ar1=new Integer[]{1,2,3};
        Integer[] ar2=new Integer[]{1,2,3};
        if(Arrays.equals(ar1, ar2)){
              System.out.println("arrays equal method Arrays.equals");
            System.out.println(Arrays.toString(ar1));

        }
        else {
            System.out.print("Array no equals");
        }

        /*   if(ar1.length==ar2.length){
               System.out.println("leght arrays equal");
        for(int i=0;i<ar1.length;i++){

            if(ar1[i]==ar2[i]) {
                System.out.println( ar1[i] +" == "+ ar2[i]);
            }
            else{
                System.out.print("Array no ==");
            }

             if (ar1[i].equals(ar2[i])){
                    System.out.println( ar1[i]+" equals "+ ar2[i]);
                }
            else{
                    System.out.print("Array no equals");
                }
            }
        }
        else{
            System.out.print("Array no equals");
        }
        */

    }
}
