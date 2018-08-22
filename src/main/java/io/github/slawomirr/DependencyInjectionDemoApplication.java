package io.github.slawomirr;

import io.github.slawomirr.controllers.MyController;
import io.github.slawomirr.examplebeans.FakeDataSource;
import io.github.slawomirr.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");
//        System.out.println(controller.hello());

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println("Name:     " + fakeDataSource.getName());
        System.out.println("Password: " + fakeDataSource.getPassword());
        System.out.println("DB URL:   " + fakeDataSource.getUrl());

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);

        System.out.println("(jms) Name:     " + fakeJmsBroker.getName());
        System.out.println("(jms) Password: " + fakeJmsBroker.getPassword());
        System.out.println("(jms) DB URL:   " + fakeJmsBroker.getUrl());

//        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
//        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
