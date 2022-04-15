package com.spring.ioc.springIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.ioc.springIOC.bean.HelloWorldBean;
import com.spring.ioc.springIOC.bean.PrototypeBean;
import com.spring.ioc.springIOC.bean.SampleBean;
import com.spring.ioc.springIOC.bean.SampleComponent;
import com.spring.ioc.springIOC.bean.SampleLazyComponent;
import com.spring.ioc.springIOC.bean.SampleSingletonComponent;
import com.spring.ioc.springIOC.configuration.AppConfig;
import com.spring.ioc.springIOC.configuration.ApplicationConfiguration;
import com.spring.ioc.springIOC.service.MessageService;
import com.spring.ioc.springIOC.service.TelegramServiceImpl;


public class App 
{
    public static void main( String[] args )
    {
    	//Step1----- loading bean into container [create object -> call constructor to create object]
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class, AppConfig.class);
        
     // 2. access to bean with its custom name
		
		
		
		  HelloWorldBean bean = (HelloWorldBean)context.getBean("MynewBean");
		  String name = bean.getBeanName();
		  System.out.println("2.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> " + name);
		 /* 
		 * SampleSingletonComponent sampleSingletonComponent= (SampleSingletonComponent)
		  context.getBean("sampleSingletonComponent");
		  System.out.println("SampleSingletonComponent"+sampleSingletonComponent.
		 * hashCode());
		
		  
		  SampleComponent sampleComponent = (SampleComponent)context.getBean("sampleComponent");
		  MessageService messageService  = sampleComponent.getMessageService();
		  messageService.send("Hello Spring container, i am sending SMS to u."); */
        
        /*  SampleLazyComponent lazyComponent = context.getBean(SampleLazyComponent.class);
          TelegramServiceImpl telegramService = (TelegramServiceImpl) lazyComponent.getMessageService();
          telegramService.setDestination("Saman Delfani");
          telegramService.send("Hello Seefa world from Telegram service");*/
       /* 
        SampleSingletonComponent singletonComponent = context.getBean(SampleSingletonComponent.class);
        singletonComponent.setValue("anand");
        
        System.out.println("7.1 Singleton value = " + singletonComponent.getValue());
        
        SampleSingletonComponent singletonComponent2 = context.getBean(SampleSingletonComponent.class);
        System.out.println("7.2 Singleton value = " + singletonComponent.getValue());
        */
        
       /* PrototypeBean protoTypeComponent = context.getBean(PrototypeBean.class);
        protoTypeComponent.setValue("anand");
        
        System.out.println("8.1 ProtoType value = " + protoTypeComponent.getValue());
        PrototypeBean protoTypeComponent2 = context.getBean(PrototypeBean.class);
        
        System.out.println("8.2 ProtoType value = " + protoTypeComponent2.getValue());
        */
        
       // AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
        //annotationContext.getEnvironment().setActiveProfiles("dev");
        
        SampleBean sampleBean = context.getBean(SampleBean.class);
        
		 
    }
}
