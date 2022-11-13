package kodlamaio.devs.business.abstracts;

import java.util.List;

import kodlamaio.devs.entities.concretes.ProgLanguage;

public interface ProgLanguageService {
	List<ProgLanguage> getAll();
	ProgLanguage getById(int id);
	boolean add(ProgLanguage progLanguage);
	void update(ProgLanguage progLanguage);
	void delete(int  id);

}
