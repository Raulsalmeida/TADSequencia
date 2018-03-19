

public interface Sequencia {
	//Vector
	public int size();
	public boolean isEmpty();
	public Object elemAtRank(int r);
	public Object replaceAtRank(int r, Object o);
	public Object insertAtRank(int r, Object o);
	public Object removeAtRank(int r, Object o);
	
	//LDL
	public No isFirst(No n);
	public No isLast(No n);
	public No first();
	public No last();
	public No before(No a);
	public No after(No p);
	public void replaceElem(No n, Object o);
	public void swapElem(No n, Object q);
	public Object insertBefore(No n, Object o);
	public Object insertAfter(No n, Object o);
	public void insertFirst(No o);
	public void insertLast(No o);
	public Object remove(No n);
	public No atRank(int r);
	public Object rankOf(No n);
}
