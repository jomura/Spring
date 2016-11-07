package concursantes;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class Audiencia {
	@Pointcut("execution(* concursantes.Concursante.ejecutar(..))")
	public void ejecutarShow(){
	}
	@Around("ejecutarShow()")
	public void monitorearShow(ProceedingJoinPoint joinpoint){
		try{
			System.out.println("El show esta por comenzar, favor de tomar asiento...");
			System.out.println("Favor de apagar celulares...");
			long horaInicio = System.currentTimeMillis();
			joinpoint.proceed();
			Thread.sleep(1000);
			long horaTermino = System.currentTimeMillis();
			System.out.println("El show ha terminado, aplausos");
			System.out.println("El show tuvo una duracion: " + (horaTermino - horaInicio));
		}
		catch(Throwable t){
			System.out.println("El show fue terrible, se devolveran las entradas");
		}
	}
	
	public void sentarse(){
		System.out.println("El show esta por comenzar, favor de tomar asiento...");
	}
	public void apagarCelulares(){
		System.out.println("Favor de apagar celulares...");
	}
	public void aplaudir(){
		System.out.println("El show ha termiando, clap, clap, clap");
	}
	public void devolucion(){
		System.out.println("El show fue terrible, se devlveran las entradas");
	}
}
