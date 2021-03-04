package reflect;

public class Person {
    private String name = "张三";
    private int age = 22;

    public Person(){}

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void sayHello(){
        System.out.println(name+":hello!");
    }

    public void sayHi(){
        System.out.println(name+"hi!");
    }

    public void say(String line){
        System.out.println(name+":"+line);
    }

    public void say(String line, int num){
        for (int i = 0; i < num; i++) {
            System.out.println(name+":"+line);
        }
    }

    private void hehe(){
        System.out.println("我是Person的私有方法！");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
