package org.school.config;


import org.school.entity.Student;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MultipleBeans {

    //We can not have multiple beans with same name as spring will give duplicate bean exception
    //to remove this exception we need to add property to override the bean check properties file.
    @Bean(name = "student1")
    public Student getStudent1(){
        Student obj = new Student();
        obj.setFirstName("Amit");
        return obj;
    }
    @Bean(name = "student2")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Student getStudent2(){
        Student obj = new Student();
        obj.setFirstName("Vikas");
        return obj;
    }

    @Bean
    public Student student(){
        Student obj = new Student();
        obj.setFirstName("Kondal");
        return obj;
    }

}
