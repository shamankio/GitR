package study;


public class MainServiceDelegate {
    public static void main(String[] args) {
        ArrayHelper resourse = new ArrayHelper();
        ServiceDelegate serviceDelegate=new ServiceDelegate(resourse);
        Fish fish1=new Fish.Builder().setName("fish1").setColor("red").setType("guppy").build();
        Fish fish2=new Fish.Builder().setName("fish2").setColor("yellow").setType("brabus").build();
        Fish fish3=new Fish.Builder().setName("fish3").setColor("white").setType("shark").build();
        Fish fish4=new Fish.Builder().setName("fish4").setColor("black").setType("whale").build();
        Fish[] ar1=new Fish[]{fish1,fish2};
        Fish[] ar2=new Fish[]{fish1,fish2,fish3,fish4};
        serviceDelegate.mergeFish(ar1,ar2);


    }
}
