package test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * jdk 动态代理
 * @author jiuyuehe
 *
 */
public class BuyPrivateHandler implements InvocationHandler {
	
	/**
	 * 目标对象类！
	 */
	private Object target;
	
	
	
	public BuyPrivateHandler(Object target) {
		this.target = target;
	}


	/**
	 * 实现 InvocationHandler 的invoke方法。
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		/**
		 * 方法之前 干什么
		 */
		System.out.println("为了 "+target.getClass().getName()+"."+method.getName());
		
		Object obj = method.invoke(target, args);
		
		System.out.println("终于 "+target.getClass().getName()+"."+method.getName());
		/**
		 * 方法之后干什么
		 */
		return obj;
	}

}
