package test.bozilovic.agroproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.bozilovic.agroproject.model.Farm;
import test.bozilovic.agroproject.repository.FarmRepository;

@Service
public class FarmServiceImpl implements FarmService {

	@Autowired
	private FarmRepository repository;
	
	@Override
	public List<Farm> getAllFarms() {
		return repository.findAll();
	}

	@Override
	public List<Farm> getFarmsByAccountId(Long id) {
		List<Farm> farms = repository.findAll();
		List<Farm> selectedFarms = new ArrayList<>();
		for(Farm farm : farms) {
			System.out.println(farm.getAccount().getId());
			if(farm.getAccount().getId() == id) {
				selectedFarms.add(farm);
			}
		}
		System.out.println(repository.findAll().toString());
		return selectedFarms;
	}

	@Override
	public void deleteFarmById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public void addUpdateFarm() {
		repository.save(new Farm());
	}

	@Override
	public Farm getFarmById(Long id) {
		return repository.getOne(id);
	}

}
