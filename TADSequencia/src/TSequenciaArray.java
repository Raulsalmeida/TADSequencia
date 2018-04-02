
public class TSequenciaArray implements Sequencia {

	private No v[];
	private No fim;
	private No inicio;
	private int tamanho;
	int tam;
	
	
	public TSequenciaArray(int t) {
		
		v = new No[t]; 
		this.inicio = v[0];
		//this.fim = v[5];
		this.tamanho = v.length;
	}
	
	@Override
	public int size() {
		
		return tam;
	}

	@Override
	public boolean isEmpty() {
		
		return tam == 0;
	}

	@Override
	public Object elemAtRank(int r) {
		
		return v[r];
	}

	@Override
	public Object replaceAtRank(int r, Object o) {
		//No no = atRank(r);
		//Object antigoElemento = no.getElemento();
		//no.setElemento(o);
		//return antigoElemento;
		Object antigo = v[r].getElemento(); 
		v[r].setElemento(o);
		return antigo;
		
	}

	@Override
	public void insertAtRank(int r, Object o) {
		v[r].setElemento(o);
		v[r-1].setProximo(v[r]);
		v[r+1].setAnterior(v[r]);
		tam++;
		
	}

	@Override
	public Object removeAtRank(int r) {
		// TODO Auto-generated method stub
		v[r].setElemento(null);
		v[r+1].setAnterior(v[r-2].getProximo());
		v[r].setElemento(v[r+1].getElemento());
		v[r-1].setProximo(v[r+2].getAnterior());
		tam--;
		
		return v[r].getElemento();
	}

	@Override
	public boolean isFirst(No n) {
		if(v[0].getElemento().equals(n.getElemento())) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public boolean isLast(No n) {
		if(v[tam].getElemento().equals(n.getElemento())) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public No first() {
		
		return v[1].getAnterior();
	}

	@Override
	public No last() {
		
		return v[tam-1].getProximo();
	}

	@Override
	public No before(No n) {
		No before = null;
		for (int i = 0; i < tamanho; i++) {
			if (v[i].getElemento().equals(n.getElemento())) {
				before = (No) v[i].getAnterior().getElemento();
			}
		}
		return before;
	}

	@Override
	public No after(No n) {
		No after = null;
		for (int i = 0; i < tamanho; i++) {
			if (v[i].getElemento().equals(n.getElemento())) {
				after = (No) v[i].getProximo().getElemento();
			}
		}
		return after;
	}

	@Override
	public void replaceElem(No n, Object o) {
		for (int i = 0; i < tamanho; i++) {
			if(v[i].getElemento().equals(n.getElemento())) {
				v[i].setElemento(o);
			}
			
		}
		
	}

	@Override
	public void swapElem(No n, No q) {
		Object novo = new Object();
		novo = n.getElemento();
		n.setElemento(q.getElemento());
		q.setElemento(novo);
		
	}

	@Override
	public Object insertBefore(No n, Object o) {
		Object iB = null;
		for (int i = 0; i < tamanho; i++) {
			if(v[i].getElemento().equals(n.getElemento())) {
				v[i-1].setElemento(o);
				v[i-1].setProximo(v[i]);
				v[i].setAnterior(v[i-1]);
				v[i-1].setAnterior(v[i-2]);
				v[i-2].setProximo(v[i-1]);
				iB = v[i-1].getElemento();
			}
		}
		tam++;
		return iB;
	}

	@Override
	public Object insertAfter(No n, Object o) {
		Object iA = null;
		for (int i = 0; i < tamanho; i++) {
			if(v[i].getElemento().equals(n.getElemento())) {
				v[i+1].setElemento(o);
				v[i+1].setAnterior(v[i]);
				v[i].setProximo(v[i+1]);
				v[i+1].setProximo(v[i+2]);
				v[i+2].setAnterior(v[i+1]);
				iA = v[i+1].getElemento();
			}
		}
		tam++;
		return iA;
	}

	@Override
	public void insertFirst(No o) {
		inicio.setElemento(o);
		
	}

	@Override
	public void insertLast(No o) {
		fim.setElemento(o);
		
	}

	@Override
	public Object remove(No n) {
		Object t = n.getElemento();
		for (int i = 0; i < tamanho; i++) {
			if (v[i].getElemento().equals(n.getElemento())) {
				v[i].getAnterior().setProximo(v[i].getProximo());
				v[i].getProximo().setAnterior(v[i].getAnterior());
				v[i].setAnterior(null);
				v[i].setProximo(null);
				tam--;
			}
		}
		return t;
	}

	@Override
	public No atRank(int r) {
		No node = null;
		if(r <= (v.length / 2)){
			node = inicio.getProximo();
			for(int i = 1; i < r; i++) {
				//node = node.getProximo();
				node = v[i].getProximo();
			}
		}else {
			for (int e = tam; e > r; e++) {
				node = v[e].getAnterior();
			}
			//node = fim.getAnterior(); 
		}
		return node;
	}

	@Override
	public Object rankOf(No n) {
		No node = null;
		node = inicio.getProximo();
		int r = 0;
		while(node != n && n != fim) {
			n.getProximo();
			r++;
		}
		return r;
	}

}
