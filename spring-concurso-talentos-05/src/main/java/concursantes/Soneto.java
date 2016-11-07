package concursantes;
import org.springframework.stereotype.Component;
@Component("poema")
public class Soneto implements Poema {
	
	public void recitar(){
		String sonetoPasionSorJuana="Este, que ves, enga�o colorido, \n que del arte ostentado los primores, \n con falsos silogismos de colores, \n es cauteloso enga�o del sentido; \n este, en quien la lisonja ha pretendido \n excusar de los a�os los horrores, \n y venciendo del tiempo los rigores, \n trinfuar de la vejes y del olvido, \n es un vano artificio del cuidado, \n es una flor al viento delicada, \n es un resguardo inutil para el hado, \n es una necia diligencia errada, \n es un afan caduco y, bien mirado, \n es cadaver, es polvo, es sombra es nada. \n";
		System.out.println("\n Soneto: " + sonetoPasionSorJuana);
	}

}
