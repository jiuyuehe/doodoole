package test.proxy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class AspectJForBuy {
	@Before("execution(* buy*(..))")
	public void  beforBuything(){
		System.out.println("为了-----干了一票");
	}

}
