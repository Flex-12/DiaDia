package base;

public class Giocatore {
	
	static final private int CFU_INIZIALI = 20;
	private int cfu;
	private Borsa borsa;
	
	public Giocatore() {
		cfu = CFU_INIZIALI;
		borsa = new Borsa();
	}
	
	public void setCfu(int cfu) {
		this.cfu = cfu;
	}
	
	public int getCfu() {
		return cfu;
	}
	
	public boolean addAttrezzo(Attrezzo attrezzo) {
		return borsa.addAttrezzo(attrezzo);
	}
}
