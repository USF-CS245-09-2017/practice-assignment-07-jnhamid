
public interface List<T> {
	
	 void add(T item);
	void add(int pos, T item);
	T get(int pos);
	T remove(int pos);
	int size();

}
