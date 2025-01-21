package com.interview.trnasit;

import java.io.*;

class User implements Serializable {
    String name;
    transient String password;

    User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}

public class TransientExample {
    public static void main(String[] args) throws Exception {
        User user = new User("John", "secret123");

        // Serialize the object
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.txt"));
        System.out.println("Password: " +user.password);
        out.writeObject(user);
        out.close();

        // Deserialize the object
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.txt"));
        User deserializedUser = (User) in.readObject();
        in.close();

        System.out.println("Name: " + deserializedUser.name); // Prints: John
        System.out.println("Password: " + deserializedUser.password); // Prints: null
    }
}

