package com.jarus.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.jarus.model.Insurence;

@Service
public class InsurenceService {
	
	public List<Insurence> getInsurences() {
		ArrayList<Insurence> arrayList = new ArrayList<Insurence>();
		arrayList.add(new Insurence(1L, "Bank of Baroda", "Yusafguda, Hyderabad, Telangan 500045"));

		arrayList.add(new Insurence(2L, "Bank of America", "ECIL, secunderabad, Telangan 500089"));
		arrayList.add(new Insurence(3L, "SBI", "Koti, Hyderabad, Telangan 500090"));

		return arrayList;

	}

	public Insurence getInsurence(String name) throws Exception { 
		Optional<Insurence> findAny=this.getInsurences()
				.stream()
				.filter (a -> StringUtils.equals(name, a.getName()))
				.findAny();

		return findAny.orElseThrow(() -> new Exception("Insurence not found"));
	}

	public Insurence save(Insurence insurence) {
		this.getInsurences().add(insurence);
		return insurence;

	}

}
