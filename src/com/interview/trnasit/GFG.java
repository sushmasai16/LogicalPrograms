package com.interview.trnasit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test  { 
  
    // Making Accesskey transient for security 
	 String accessKey; 
  
    // Making age transient as age can be 
    // calculated from Date of Birth 
    // and current date. 
	 int age; 
  
    // serialize other fields 
    String name, address; 
    public Test(String accessKey, int age, 
                String name, String address) 
    { 
        this.accessKey = accessKey; 
        this.age = age; 
        this.name = name; 
        this.address = address; 
    } 
} 
  
public class GFG { 
    public static void main(String[] args) 
        throws Exception 
    { 
        
    	Test obj1 = new Test("mySecureKey123", 30, "John Doe", "123 Main St");
        FileOutputStream fileOut = new FileOutputStream("abc.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(obj1); // Write object to file
        out.close();
        fileOut.close();
        ObjectInputStream in 
        = new ObjectInputStream( 
            (new FileInputStream( 
                "abc.txt")));
        Test obj = (Test)in.readObject(); 
  
        /* Transient variable will be shown  
        null due to security reasons.*/
        System.out.println("Accesskey: "
                           + obj.accessKey); 
        System.out.println("Age: "
                           + obj.age); 
        System.out.println("Name: "
                           + obj.name); 
        System.out.println("Address: "
                           + obj.address); 
    } 

}
