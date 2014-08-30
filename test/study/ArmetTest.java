package study;
import org.junit.Test;
import org.junit.Assert;


public class ArmetTest {
    HW32 ob1 = new HW32("aaa",1);
    HW32 ob2 = new HW32("bbb",2);
    HW32 ob3 = new HW32("ccc",3);
    HW32 ob4 = new HW32("ddd",4);
    @Test
    public void mergeArrayEq(){
        HW32[]ar1=new HW32[]{ob1,ob2};
        HW32[] ar2 = new HW32[]{ob1,ob2,ob3,ob4};
        HW32[] expectedArrayMerge = new HW32[]{ob1,ob2,ob3,ob4};
        //initialize class
        Armet testObject =new Armet();
        HW32[]retArray=testObject.merge(ar1,ar2);
        Assert.assertArrayEquals(retArray,expectedArrayMerge);
    }
    @Test
    public void mergeAr2Empti(){
        HW32[]ar1=new HW32[]{ob1,ob2};
        HW32[] ar2 = new HW32[]{};
        HW32[] expectedArrayMerge = new HW32[]{ob1,ob2};
        //initialize class
        Armet testObject =new Armet();
        HW32[]retArray=testObject.merge(ar1,ar2);
        Assert.assertArrayEquals(retArray,expectedArrayMerge);
    }
    @Test
    public void mergeAr1Empti()throws Exception{
        HW32[]ar1=new HW32[]{};
        HW32[] ar2 = new HW32[]{ob1,ob2,ob3,ob4};
        HW32[] expectedArrayMerge = new HW32[]{};
        //initialize class
        Armet testObject =new Armet();
        HW32[]retArray=testObject.merge(ar1,ar2);
        Assert.assertArrayEquals(retArray,expectedArrayMerge);
    }
    @Test
    public void mergeAr1Null()throws Exception{
        HW32[]ar1=null;
        HW32[] ar2 = new HW32[]{ob1,ob2,ob3,ob4};
        HW32[] expectedArrayMerge = new HW32[]{ob1,ob2,ob3,ob4};
        //initialize class
        Armet testObject =new Armet();
        try{
            HW32[]retArray=testObject.merge(ar1,ar2);
            Assert.assertArrayEquals(retArray,expectedArrayMerge);
        }catch (NullPointerException e){System.out.println("Exeption catch"); };


    }
    @Test
    public void innerJoinArrayEq(){
        HW32[]ar1=new HW32[]{ob1,ob2};
        HW32[] ar2 = new HW32[]{ob1,ob2,ob3,ob4};
        HW32[] expectedArrayIJoin = new HW32[]{ob1,ob2};
        //initialize class
        Armet testObjectIJ =new Armet();
        HW32[]retArrayIJ=testObjectIJ.innerJoin(ar1,ar2);
        Assert.assertArrayEquals(retArrayIJ,expectedArrayIJoin);
    }
    @Test
    public void outerJoinArrayEq(){
        HW32[]ar1=new HW32[]{ob1,ob2};
        HW32[] ar2 = new HW32[]{ob1,ob2,ob3,ob4};
        HW32[] expectedArrayOJoin = new HW32[]{ob3,ob4};
        //initialize class
        Armet testObjectOJ =new Armet();
        HW32[]retArrayIJ=testObjectOJ.outerJoin(ar1,ar2);
        Assert.assertArrayEquals(retArrayIJ,expectedArrayOJoin);
    }
    @Test
    public void ArEqAr(){
        HW32[]ar1=new HW32[]{ob1,ob2,ob3,ob4};
        HW32[] ar2 = new HW32[]{ob1,ob2,ob3,ob4};
        //initialize class
         Assert.assertArrayEquals(ar1,ar2);
    }
    @Test
    public void Ar1EqMaxValue(){
        HW32[]ar1=new HW32[]{ob1,ob2,ob3,ob4};

        //initialize class
        Assert.assertEquals(ar1.length,Integer.MAX_VALUE);
    }
    @Test
    public void Ar2EqMaxValue(){
        HW32[]ar2=new HW32[]{ob1,ob2,ob3,ob4};

        //initialize class
        Assert.assertEquals(ar2.length,Integer.MAX_VALUE);
    }

}
