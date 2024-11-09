package nit.IOCProj10_ValueAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.nt.Config.AppConfig;
import com.nt.sbeans.Employee;

public class App 
{
    public static void main(String[] args) {
   
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	Employee emp = ctx.getBean("emp",Employee.class);
    	Environment env = ctx.getEnvironment();
    	System.out.println("osname "+env.getProperty("os.name"));
    	System.out.println("property :"+env.getProperty("per.name"));
    	System.out.println(emp);
    	 
    	ctx.close();
    }
}
