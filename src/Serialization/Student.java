package Serialization;

import java.io.Serializable;
import java.net.IDN;


public class Student implements Serializable {
    /**
     * After implementing serializable it asks to give serialVersion universal ID to this particular class
     * This is added so that java uniquely identify your object once is serialized and deserialized
     * Also it keep versioning tracks of it. Because when you serialize the object what if somebody
     * hops over the network line and change the representation of our object, and the consumer application
     * will get a diff object copy now.
     */

    private static final long serialVersionUID = -7020873215445479148L;// by default 1L
    /*whenever you do an update to your object it is going to increase that universal ID by 1,
    you create an obj serialize it for the 1st time the value is set by default 1 ntu, as you mutate
    the obj again and again before you deserialize it the counts keeps increasing.
     */


/**
 * 1) Implement serializable
 * 2) Mention serial version universal ID
 * 3) Add the required fields
 * 4) Create constructor
 * 5) Add getters and setters
 * 6) Add toString() method -> To print nicely
 */

    public String name;
    public int age;
    public String address;


    //You may have 50 diff properties like name, age etc...
    //But you want one particular field not be serialized/deserialized.
     transient int transientExample;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        //this.transientExample = transientExample;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // transient oda getter and setters

    public int getTransientExample() {
        return transientExample;
    }

    public void setTransientExample(int transientExample) {
        this.transientExample = transientExample;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
