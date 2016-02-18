package pack;

public class Oita {
	String nume;
	String rasa;
	String culoare;
	String gen;
	boolean areMiei;
	int varsta;
	int litriLapte;
	int grajd;
	int lana;
	
	public void scoateSunet(){
		System.out.println(nume + " face beeeee :> ");
	}
	
	public void mergeLaMuls(){
		litriLapte+=3;
	}
	
	public void mergeLaTuns(){
		lana+=3;
	}
	
	public void paste(){
		System.out.println(nume + "paste iarba proaspata");
	}
	
	public void imbatraneste(){
		varsta++;
	}
	
	public String infoOaie(){
		return "Oita cu numele " + nume + " e de rasa " + rasa +  ", e " + gen + ", are lana " + culoare+ ", are " + varsta + " ani a dat "
				+ litriLapte + " litri lapte " + " a dat " + lana + " kg lana si este tinuta in grajdul " + grajd;
	
	}
}
