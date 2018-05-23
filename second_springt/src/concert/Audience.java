package concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
public class Audience {
    @Before( "execution(* concert.Performance.perform(..))")    // 该注解声明了silenceCellPhones()需要应用到的Pointcut。
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }
    @Before("execution(* concert.Performance.perform(..))")
    public void takeSeats() {
        System.out.println("Taking seats");
    }
    @AfterReturning("execution(* concert.Performance.perform(..))")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }
    @AfterThrowing("execution(* concert.Performance.perform(..))")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}