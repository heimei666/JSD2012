package xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * 使用DOM4J解析XML文档
 */
public class ParseXmlDemo {
    public static void main(String[] args) {
        /*
            解析XML文档的大致流程
            1：创建SAXReader
            2：使用SAXReader读取xml文档并生成Document对象
            3：通过Document对象获取根元素
            4：按照XML文档的结构从根元素开始逐级获取子元素以达到解析目的
         */
        try{
            SAXReader reader = new SAXReader();
            Document doc = reader.read("./emplist.xml");
            //获取根标签
            /*
                Element的每一个实例用于表示XML文档中的一个元素（一对标签）
                其提供了很多获取对应元素相关信息的方法，常用的有：
                String getName（）
                获取元素名，标签的名字

                String getText（）
                获取开始与结束标签中的文本。

                Element element（String name）
                获取当前标签中指定名字的子标签

                List elements()
                获取当前标签中的所有子标签

                List elements(String name)
                获取当前标签中所有同名子标签(指定的名字)

             */
            Element root = doc.getRootElement();
            String name = root.getName();
            System.out.println("根标签名字"+name);
            //解析所有的员工信息
            //获取所有<emp>标签
            List<Element> list = root.elements("emp");
            System.out.println("共有"+list.size()+"个<emp>标签");
            //遍历集合，获取每一个<emp>标签，并通过它获取到该员工的相关信息
            for(Element empEle:list){
                //获取员工名字
                //1获取<name>标签
                //2获取<name>标签中间的文本
                String ename = empEle.elementText("name");

                //获取员工年龄
                int age = Integer.parseInt(empEle.elementText("age"));

                //获取性别
//                String gender = empEle.element("gender").getText();
                String gender = empEle.elementText("gender");

                //获取工资
                int salary = Integer.parseInt(empEle.elementText("salary"));

                //获取<emp>标签的属性：id
                int id = Integer.parseInt(empEle.attributeValue("id"));

                System.out.println(id+":"+ename+","+age+","+gender+","+salary);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
