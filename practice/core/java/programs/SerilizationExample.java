package practice.core.java.programs;

import java.io.*;

public class SerilizationExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Dog dog = new Dog("Rohit", "Labrador");
//        Dog dog2 = new Dog("Sharad", "Rottwiller");
//
//        FileOutputStream fileOutputStream = new FileOutputStream("sonali.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//        objectOutputStream.writeObject(dog);
//        objectOutputStream.writeObject(dog2);
//
//        FileInputStream fileInputStream = new FileInputStream("sonali.txt");
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//
//      Dog d1 = (Dog) objectInputStream.readObject();
//        Dog d2 = (Dog) objectInputStream.readObject();
//
//        System.out.println(d1);
//        System.out.println(d2);
        //-------------------------------------------------------------

        MyDog myDog = new MyDog("Rohit", "Labrador", "American");
        MyDog myDog1 = new MyDog("Sharad", "Rottwiller", "German");

        FileOutputStream fileOutputStreamMydog = new FileOutputStream("mydog.txt");
        ObjectOutputStream objectOutputStreamMyDog = new ObjectOutputStream(fileOutputStreamMydog);

        objectOutputStreamMyDog.writeObject(myDog);
        objectOutputStreamMyDog.writeObject(myDog1);

        FileInputStream fileInputStreamMyDog = new FileInputStream("mydog.txt");
        ObjectInputStream objectInputStreamMyDog = new ObjectInputStream(fileInputStreamMyDog);

        MyDog myDog2 = (MyDog) objectInputStreamMyDog.readObject();
        MyDog myDog3 = (MyDog) objectInputStreamMyDog.readObject();

        System.out.println(myDog2);
        System.out.println(myDog3);

    }
}
