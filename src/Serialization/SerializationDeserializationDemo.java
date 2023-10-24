package Serialization;

import java.io.*;

public class SerializationDeserializationDemo {
    public static void main(String[] args) {
        Student st = new Student("Priya",21,"cbe");
        st.setTransientExample(35); //To check the use case of transient setting their value


        //Now i want to store the state of this student object, when you serialize it sent to the network
        //Since we are running this demo on same machine, i will serialize this into my local file system
        // same thing as sharing through network: put it somewhere later you can fetch it

        String fileName = "C:\\Users\\Priya D\\Documents\\serializeDeSerializeDemo.txt";
        FileOutputStream fileObj = null; //these two classes is for writing to the file
        ObjectOutputStream objOut = null;

        //Serialization - writeObject
        try{
            //these two lines can also be given there itself to catch exception we are giving it like this
            fileObj = new FileOutputStream(fileName);  //to mention the location where to write
            objOut = new ObjectOutputStream(fileObj);  //creating object for that file
            objOut.writeObject(st); //FOCUS HERE -> writing the student obj to that file

            objOut.close();
            fileObj.close();
            System.out.println("Object has been serialized: \n"+st);


        }
        catch(IOException io){
            System.out.println("IO exception is caught during serialization");
        }

        //Deserialization - Read Object

        FileInputStream fileIn = null;
        ObjectInputStream objectInputStream = null;

        try{
            fileIn = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileIn);

            Student studentObj =(Student) objectInputStream.readObject();
            /**
             * Note here that we typecasted: why? read object doesn't know anything about student class
             * After serialization the class type info is lost, you cannot store class type object when you
             * serialize an object.
             *
             * we have to tell explicitly that we should read object of student type.
             */
            System.out.println("Object has been deserialized: \n"+studentObj);

            System.out.println("After deserializing the transient variable: "+studentObj.getTransientExample());
            System.out.println("As because it is transient even after setting their value as 10 its output shows 0");

            fileIn.close();
            objectInputStream.close();
        }
         catch (IOException e) {
             System.out.println("IO exception is caught during deserialization");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFound exception is caught during deserialization");

        }


    }
}
