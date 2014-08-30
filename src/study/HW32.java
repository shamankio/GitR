package study;


import java.util.Arrays;
//POJO
public class HW32 {
    private String name;
    private int number;
    HW32(String name, int number){
        this.name=name;
        this.number=number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HW32)) return false;

        HW32 hw32 = (HW32) o;

        if (number != hw32.number) return false;
        if (name != null ? !name.equals(hw32.name) : hw32.name != null) return false;

        return true;
    }
  //main()
     public static void main(String[] args) {
        HW32 ob1 = new HW32("aaa",1);
        HW32 ob2 = new HW32("bbb",2);
        HW32 ob3 = new HW32("ccc",3);
        HW32 ob4 = new HW32("ddd",4);
          //arrays
       HW32[] ar1 = new HW32[]{ob1,ob2};
      // HW32[] ar1 = null;
       HW32[] ar2 = new HW32[]{ob1,ob2,ob3,ob4};
 //inition object class methods
         Armet kkk=new Armet();
  //merge method
         HW32[] ar=kkk.merge(ar1,ar2);
          HW32[] expectedArrayMerge = new HW32[]{ob1,ob2,ob3,ob4};
        boolean isArraysEqualsM = Arrays.equals(expectedArrayMerge, ar);
        System.out.println(String.format("Test successful : %s \n", isArraysEqualsM));
        assert (isArraysEqualsM);
//inner join method
          HW32[]ijo=kkk.innerJoin(ar1,ar2);
         HW32[] expectedArrayIn = new HW32[]{ob1,ob2};
         boolean isArraysEqualsI = Arrays.equals(expectedArrayIn, ijo);
         System.out.println(String.format("Test successful : %s \n", isArraysEqualsI));
         assert (isArraysEqualsI);
 //outer join
          HW32[]ojo=kkk.outerJoin(ar1,ar2);
         HW32[] expectedArrayOu = new HW32[]{ob3,ob4};
         boolean isArraysEqualsO = Arrays.equals(expectedArrayOu, ojo);
         System.out.println(String.format("Test successful : %s \n", isArraysEqualsO));
         assert (isArraysEqualsO);

    }
  }
