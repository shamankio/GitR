package study;

public class ServiceDelegate {
    private final ArrayHelper resource;
    public ServiceDelegate(ArrayHelper resource){
        this.resource=resource;
    }
    public Fish[] mergeFish(Fish[] ar1, Fish[] ar2){
        return resource.mergeFish(ar1, ar2);
    }

}
