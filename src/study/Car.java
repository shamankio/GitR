package study;

import java.util.Arrays;

enum  Position {hatchback, suv, golf}

class Car {
    private String name;
    private String manufacturer ;
    private Position type;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getmanufacturer () {
        return manufacturer ;
    }
    public void setmanufacturer (String manufacturer ) {
        this.manufacturer  = manufacturer ;
    }
    public Position gettype() {
        return type;
    }
    public void settype(Position type) {
        this.type = type;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((manufacturer  == null) ? 0 : manufacturer .hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        if (manufacturer  == null) {
            if (other.manufacturer  != null)
                return false;
        } else if (!manufacturer .equals(other.manufacturer ))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (type != other.type)
            return false;
        return true;
    }

    public static void main(String [] args){

        Car p1= new Car();
        Car p2= new Car();
        Car p3= new Car();
        Car[] r1 = new Car[3];
        Car[] r2 = new Car[3];
        r1[0]=p1;
        r1[1]=p2;
        r1[2]=p3;
        r2[0]=p1;
        r2[1]=p2;
        r2[2]=p3;
        //p1.setName("tttt");
        //p2.setName("tttt");
        p1.settype(Position.hatchback);
        p2.settype(Position.suv);
        p3.settype(Position.golf);
        System.out.println(p1.gettype());
        System.out.println(p2.gettype());
        System.out.println(p3.gettype());
        if(p1.equals(p2)){
            System.out.println("Equal");}
        else{System.out.println("null");
        }
        if(p1.hashCode()==p2.hashCode()){
            System.out.println("Equal hash code");}
        else{System.out.println("not equal has code");
        }
        if(Arrays.equals(r1, r2)){
            System.out.println("Equal arrays");}
        else{System.out.println("not equal arrays");
        }
    }

}
