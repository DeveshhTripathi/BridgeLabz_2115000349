import java.lang.reflect.*;
interface Greeting{
    void sayHello(String name);
}
class GreetingImpl implements Greeting{
    public void sayHello(String name){
        System.out.println("Hello, " + name + "!");
  }
}
class LoggingProxyHandler implements InvocationHandler{
    private final Object target;
    public LoggingProxyHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, java.lang.reflect.Method method, Object[] args) throws Throwable{
        System.out.println("Logging: Invoking method - " + method.getName());
        return method.invoke(target, args);
  }
}
public class DynamicProxyReflection{
    public static void main(String[] args){
        Greeting original = new GreetingImpl();
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
            Greeting.class.getClassLoader(),
            new Class[]{Greeting.class},
            new LoggingProxyHandler(original)
        );
        proxyInstance.sayHello("Rohan");
  }
}
