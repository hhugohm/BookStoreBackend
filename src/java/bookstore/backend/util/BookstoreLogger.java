package bookstore.backend.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import bookstore.backend.annotations.SuppressLogging;

/**
 *
 * @author hhugohm
 */
public class BookstoreLogger {
    
     private static final Logger logger= Logger.getLogger(BookstoreLogger.class.getName());
     
     private static final int STACK_OWN_CLASS_METHOD=2;
     
     
     public static void log(Level level,String message){
         StackTraceElement[] stackTraceElements =Thread.currentThread().getStackTrace();
         StackTraceElement stackTraceElement = stackTraceElements[STACK_OWN_CLASS_METHOD];
         String invokedMethodName = stackTraceElement.getMethodName();
         String invokedClassName = stackTraceElement.getClassName();
         
        Class invokedClass = null;
        Method invokedMethod = null;
        try{
            invokedClass = Class.forName(invokedClassName);
            Method methods[] = invokedClass.getDeclaredMethods();
            for(Method method:methods){
                if(method.getName().equalsIgnoreCase(invokedMethodName)){
                    invokedMethod= method;
                    break;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
       Annotation annotationClass= invokedClass.getAnnotation(SuppressLogging.class);
       Annotation annotationMethod = invokedMethod.getAnnotation(SuppressLogging.class);
       
       if(annotationClass!=null){
           return;
       }
       if(annotationMethod == null){
           logger.log(level,message);
       }
       
         /*
         for(StackTraceElement stackTraceElement:stackTraceElements){
             System.out.println(stackTraceElement.getMethodName() + " - "+message);
         }
          System.out.println(invokedMethodName);
         System.out.println(invokedClassName);
         */   
     }
    
    
}
