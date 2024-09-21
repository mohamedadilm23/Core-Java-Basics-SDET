package javafolder;

public class Returntypes {

	public Integer numberofrose=100;

	public Integer Trichygarden() {
		System.out.println("How many rose bought in this garden"+numberofrose+"and send new flowers buy the garden");
		return numberofrose;
	}


	public static void main(String[] args) {
		// returntypes
		Returntypes Rose=new Returntypes();
		Integer newrose=Rose.Trichygarden();
		System.out.println("new roses are printed again "+newrose);
		
	}


	}


	
	


