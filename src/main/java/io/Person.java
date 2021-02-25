package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 使用当前类测试对象流的对象读写操作
 *
 *  当一个类的实例希望被对象流进行读写时，该类必须实现接口：
 *  java.io.Serializable
 *
 *  Serializable接口中没有任何抽象方法，这是一个签名接口，该接口是
 *  编译器敏感的结构，当编译器编译一个类时如果这个类实现了序列化接口
 *  则会在编译后的class文件中添加一个方法，作用是按照该类结构转换为
 *  一组字节（对象流就是依靠这个方法做对象序列化的）
 */
public class Person implements Serializable {
    private String name;
    private  int age;
    private  String gender;
    /*
        transient关键字可以在对象序列化时忽略该属性的值
        忽略不重要的属性可以达到对象序列化时的瘦身操作，减少资源开销
     */
    private transient String[] otherInfo;

    public Person(String name, int age, String gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }
}
