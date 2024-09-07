package org.example;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Main.class.getName());

    static void newFather(final Father father, String newFatherName) {
        father.name = newFatherName;
    }

    public static void main(String[] args) throws InterruptedException {
//        MyInterface myObject = new MyInterface();
//        System.out.println("Hello world!" + myObject.getClass());
//        MyDataObject myDataObject = new MyDataObject();
//        myDataObject.setName("Biden");
//        myDataObject.setAge(30);
        logger.info("I am log4j logger...");
        //Print classpath
        String classpathStr = System.getProperty("java.class.path");
        System.out.println(classpathStr);

//        Father father = new Father();
//        father.name = ("Joe Biden");
//        System.out.println("father name: "+father.name);
//        newFather(father, "Joseph R. Biden");
//        System.out.println("father name: "+father.name);
//
//
//        List list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//
//        List list1 = new ArrayList();
//        list1.add(1);
//        list1.add(2);
//
//        System.out.println("list " + list);
//        System.out.println("list1 " + list1);
//
//        if(list.equals(list1)) {
//            System.out.println("List equals to list2");
//            System.out.println("list.hashCode(): "+list.hashCode());
//            System.out.println("list1.hashCode(): "+list1.hashCode());
//        } else {
//            System.out.println("List NOT equals to list1");
//        }
//
//
//        String str1 = "Biden";
//        String str2 = "Biden";
//        String str3 = "Bidan";
//        System.out.println("str1 hashcode " + str1.hashCode());
//        System.out.println("str2 hashcode " + str2.hashCode());
//        System.out.println("str3 hashcode " + str3.hashCode());
//        str1 = new String("Biden");
//        str2 = new String("Biden");
//        if(str1 == str2) {
//            System.out.println("str1 == str2");
//        }

    }
}