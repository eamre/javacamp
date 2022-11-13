package kodlama.io.rentACar.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abtracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service //bu class bir business nesnesidir
public class BrandManager implements BrandService {
	private BrandRepository brandRepository;
	
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}

	@Override
	public List<Brand> getAll() {
		
		return brandRepository.getAll();
	}
	
}
