package study;


import javax.annotation.Resource;

public class Delegate {
    public static void main(String[] args) {
        Person.Builder  ob1 = new Person.Builder();
        Person.Builder ob2=new Person.Builder();
        Person.Builder ob3= new Person.Builder();
        Person.Builder ob4= new Person.Builder();
        Person[]ar1=new Person[]{ob1,ob2,ob3};
        Person[]ar2=new Person[]{ob1,ob2,ob3,ob4};
        Person resourse = new Person ();
        ServiseDelegate del=new ServiseDelegate(resourse);
        del.merge(ar1,ar2);
    }
}
