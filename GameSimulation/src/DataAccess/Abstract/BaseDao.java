package DataAccess.Abstract;

public interface BaseDao <T> {
	void add(T object);
	void update(T object);
	void delete (T object);
}
