package kodlamaio.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlamaio.devs.dataAccess.abstracts.ProgLanguageRepository;
import kodlamaio.devs.entities.concretes.ProgLanguage;

@Repository
public class InMemoryProgLanguage implements ProgLanguageRepository {

	public static List <ProgLanguage> progLanguages;
	public InMemoryProgLanguage() {
		super();
		progLanguages=new ArrayList<ProgLanguage>();
		progLanguages.add(new ProgLanguage(1,"C#"));
		progLanguages.add(new ProgLanguage(2,"Java"));
		progLanguages.add(new ProgLanguage(3,"Python"));
	}

	@Override
	public List<ProgLanguage> getAll() {
		// TODO Auto-generated method stub
		return progLanguages;
	}

	@Override
	public ProgLanguage getById(int id) {
		for(ProgLanguage pl : progLanguages) {
			if(pl.getId()==id) {
				return pl;
			}
		}
		return null;
	}

	@Override
	public void add(ProgLanguage progLanguage) {
		progLanguages.add(progLanguage);
	}

	@Override
	public void update(ProgLanguage progLanguage) {
		ProgLanguage item = getById(progLanguage.getId());
		item.setName(progLanguage.getName());
	}

	@Override
	public void delete(int id) {
		progLanguages.removeIf(e -> e.getId()==id);
	}

}
