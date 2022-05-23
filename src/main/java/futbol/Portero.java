package futbol;
import java.lang.*;
public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre,edad,"Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	public int compareTo(Object obj) {
		Portero f = (Portero) obj;
		int result = this.golesRecibidos-f.golesRecibidos;
		return Math.abs(result);
	}
	public boolean jugarConLasManos() {
		return true;
	}
	public String toString() {
		return super.toString()+" con el dorsal "+dorsal+". Le han marcado "+golesRecibidos;
	}
	
}
