package training.k2.dao;

import java.util.Collection;
import java.util.Optional;

public interface ItemDAO<T> {
	
	Optional<T> get(int code);
	Collection<T> getAll();
	int save(T t);
	void update(T t);
	void delete(T t);

}
