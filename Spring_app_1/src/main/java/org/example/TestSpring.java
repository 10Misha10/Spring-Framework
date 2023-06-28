package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"//этот файл обязательно должен быть в папке помеченной как папка с ресурсами
        );//этот класс обращается к файлу applicationContext, считывает его и поещает все бины в applicationContex
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        context.close();
    }
    /*то есть описав бин в конфигурационном
     файле спринга мы смогли с помощью applicationContext
      сделать так чтоб сприн прочитал этот файл,
       создал бины которые там прописаны и затем мы получили созданный бин и у этого бина вызвали метод getName */
}
