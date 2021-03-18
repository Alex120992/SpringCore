package ru.zateev.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        try {
            // Данный класс обращается к applicationcontext
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                    "applicationcontext.xml"
            );
            TestBeans testBeans = context.getBean("testBean", TestBeans.class);
            System.out.println(testBeans.getName());

            context.close();// закрываем контекст
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
    }
}
