package test.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * cglib 动态代理
 * @author jiuyuehe
 *
 */
public class CglibProxy implements MethodInterceptor {
	
	private Enhancer enhancer = new Enhancer();
	
	public Object getProxy(Class clazz){
		//设置需要创建子类的类
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		//通过字节码技术动态创建子类实例
		return enhancer.create();
	}
//拦截父类所有方法的调用
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("为了 "+obj.getClass().getName()+"."+method.getName()+" 准备去干一票");
		
		Object result = proxy.invokeSuper(obj, args);
		
		System.out.println("干完这一票 "+obj.getClass().getName()+"."+method.getName());
		return result;
	}

}
