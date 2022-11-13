package kodlamaio.devs.dataAccess.abstracts;

import java.util.List;

import kodlamaio.devs.entities.concretes.ProgLanguage;

public interface ProgLanguageRepository {
	
	List<ProgLanguage> getAll();
	ProgLanguage getById(int id);
	void add(ProgLanguage progLanguage);
	void update(ProgLanguage progLanguage);
	void delete(int id);
}
