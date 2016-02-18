package pack;

public class Principala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Oita ioana = new Oita();
		ioana.nume="Ioana";
		ioana.culoare="roz";
		ioana.lana=5;
		
		
		Oita mariuca=new Oita();
		mariuca.nume="Mariuca";
		mariuca.rasa="romaneasca";
		mariuca.varsta=10;
		
		mariuca.mergeLaTuns();
		ioana.mergeLaMuls();
		
		ioana.infoOaie();
		mariuca.infoOaie();
		
		System.out.println(ioana.infoOaie());
		
		System.out.println(mariuca.infoOaie());
	}

}
