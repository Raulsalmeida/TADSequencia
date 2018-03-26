
public class TADVetor implements Vetor {
	private No v[];
	private int t = -1;
	private int rank;
	
	
	
	@Override
	public int size() {
		
		return t+1;
	}

	@Override
	public boolean isEmpty() {
		return t == 0;
	}

	@Override
	public Object elemAtRank(int r) {
		return v[r];
	}

	@Override
	public Object replaceAtRank(int r, Object o) {
		//No no = (No) elemAtRank(r);
		//Object antigoElemento = no.getElemento();
		//no.setElemento(o);
		
		//return antigoElemento;
		
		Object antigoElemento = v[r].getElemento();
		v[r].setElemento(o);
		
		return antigoElemento;
	}

	@Override
	public void insertAtRank(int r, Object o) {
		//No antigo =  (No) elemAtRank(r);
		//No novo = null;
		//novo.setProximo(antigo.getProximo());
		//novo.setAnterior(antigo);
		//novo.setElemento(o);
		//t++;	
		Object antigo = v[r].getElemento();
		Object novo = null;
		for(int i = 0; i < v.length; i++) {
			
		}
		
	}

	@Override
	public Object removeAtRank(int r, Object o) {
		//No no = (No) elemAtRank(r);
		//Object NoRemovido = no.getElemento();
		//no = null;
		
		//return NoRemovido;
		
		
		return null;
	}
	
	
}
