package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.event.AfterFilmInsertEvent;
import com.event.BeforeFilmInsertEvent;

@Aspect
@Component
public class ServicePointCut implements ApplicationContextAware{
	
	private ApplicationContext appContext;
	
	public ApplicationContext getApplicationContext(){
		return appContext;
	}
	
	@Override
	public void setApplicationContext(ApplicationContext appContext) throws BeansException {
		// TODO Auto-generated method stub
		this.appContext = appContext;
	}
	
	/**
	 * 定义切入点
	 */
	@Pointcut("execution(* com.service..*.*(..))")
	public void point(){}
	
	//环绕通知
	@Around(value="point()")
	public Object around(ProceedingJoinPoint pjp){
		try {
			//运行前置事件
			BeforeFilmInsertEvent before = new BeforeFilmInsertEvent("before");
			appContext.publishEvent(before);
			
			Object value = pjp.proceed();//运行对象的方法（控制方法的使用） 返回方法的返回值
			
			//运行后置事件
			AfterFilmInsertEvent after = new AfterFilmInsertEvent("after");
			appContext.publishEvent(after);
			
			return value;//返回方法的返回值
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("添加Film异常");
		}finally{
			//System.out.println("最终通知");
		}
		return null;
	}

	

}
