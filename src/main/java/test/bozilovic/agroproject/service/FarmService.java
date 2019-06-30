package test.bozilovic.agroproject.service;

import java.util.List;

import test.bozilovic.agroproject.model.Farm;

public interface FarmService {

	public List<Farm> getAllFarms();
	public Farm getFarmById(Long id);
	public List<Farm> getFarmsByAccountId(Long id);
	public void deleteFarmById(Long id);
	public void addUpdateFarm();
}
