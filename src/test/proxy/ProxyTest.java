package test.proxy;

import java.lang.reflect.Proxy;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**'
 * jdk 动态代理
 * @author jiuyuehe
 *
 */
public class ProxyTest {

	public static void main(String[] args) {
		
//		jdkProxy();
//		cglibProxy();
		aspectProxy();
	}
	
	private static void aspectProxy(){
		Buy b = new Buyshow();
		
		AspectJProxyFactory factory = new AspectJProxyFactory();
		factory.setTarget(b);
		factory.addAspect(AspectJForBuy.class);
		
		Buy proxy = factory.getProxy();
		
		proxy.buyCar(50000);
		proxy.buyHouse(30000);
		proxy.buyNoteBook(52513);
	}
	
	
	private static void cglibProxy(){
		CglibProxy proxy = new CglibProxy();
		Buyshow show = (Buyshow)proxy.getProxy(Buyshow.class);
		show.buyCar(500000);
		show.buyHouse(30);
		show.buyNoteBook(63000);
		
		
	}

	private static void jdkProxy() {
		Buy b = new Buyshow();
		//将业务目标与横切面，织到一起
		BuyPrivateHandler handler = new BuyPrivateHandler(b);
		
		//给织在一起的横切面对象创建一个代理的实例。
		//这里只能给接口 创建代理实例
		Buy proxy = (Buy) Proxy.newProxyInstance(b.getClass().getClassLoader(),
				b.getClass().getInterfaces(), handler);

		proxy.buyCar(300000);
		proxy.buyHouse(550000);
		proxy.buyNoteBook(10000);
	}

}
