package kodlama.io.rentACar.business.abtracts;

import java.util.List;

import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandService {
	List<Brand> getAll();
}
