package nit.IOCProj09_Scopes_PrototypeScope;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Config.AppConfig;
import com.nt.Sbeans.Student;
import com.nt.pton.CSE_Book;
public class App {
    public static void main(String[] args) 
    {
        System.out.println("START!");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Student s1 = ctx.getBean("stud",Student.class);
        Student s2=ctx.getBean("stud",Student.class);
        String result = s1.getCourse("mba");
        System.out.println(result);
        
        System.out.println("==============================");
        
        System.out.println(s1.hashCode()+" "+s2.hashCode());
        System.out.println(s1==s2);
        
        System.out.println("========================");
        
        CSE_Book b1 = ctx.getBean("getInsta",CSE_Book.class);
        
        CSE_Book b2 = ctx.getBean("getInsta",CSE_Book.class);
        System.out.println(b1.hashCode()+" "+b2.hashCode());
        
        System.out.println(ctx.getBeanDefinitionCount());
        System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
        ctx.close();
    
    }
}
