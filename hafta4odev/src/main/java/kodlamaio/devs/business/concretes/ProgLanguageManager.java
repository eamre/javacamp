package kodlamaio.devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.devs.business.abstracts.ProgLanguageService;
import kodlamaio.devs.dataAccess.abstracts.ProgLanguageRepository;
import kodlamaio.devs.dataAccess.concretes.InMemoryProgLanguage;
import kodlamaio.devs.entities.concretes.ProgLanguage;

@Service
public class ProgLanguageManager implements ProgLanguageService {

	private ProgLanguageRepository progLanguageRepository;
	
	@Autowired
	public ProgLanguageManager(ProgLanguageRepository progLanguageRepository) {
		super();
		this.progLanguageRepository = progLanguageRepository;
	}
	
	@Override
	public List<ProgLanguage> getAll() {
		// TODO Auto-generated method stub
		return progLanguageRepository.getAll();
	}
	
	@Override
	public ProgLanguage getById(int id) {
		// TODO Auto-generated method stub
		return progLanguageRepository.getById(id);
	}
	@Override
	public boolean add(ProgLanguage progLanguage) {
		
		for(ProgLanguage pl : InMemoryProgLanguage.progLanguages) {
			if(pl.getName().matches(progLanguage.getName())) {
				return false;
			}
		}

		if(progLanguage.getName() != null && !progLanguage.getName().isEmpty()) {
			progLanguageRepository.add(progLanguage);
		}
		
		return true;
	}
	
	@Override
	public void update(ProgLanguage progLanguage) {
		progLanguageRepository.update(progLanguage);
	}
	@Override
	public void delete(int id) {
		progLanguageRepository.delete( id);
	}

}
