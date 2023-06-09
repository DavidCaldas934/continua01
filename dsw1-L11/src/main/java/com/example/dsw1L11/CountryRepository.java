package com.example.dsw1L11;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
	private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		Country spain = new Country();
		spain.setName("Spain");
		spain.setCapital("Madrid");
		spain.setComida("Paella");
		spain.setCurrency(Currency.EUR);
		spain.setPopulation(46704314);

		countries.put(spain.getName(), spain);

		Country poland = new Country();
		poland.setName("Poland");
		poland.setCapital("Warsaw");
		poland.setComida("Fetichini");
		poland.setCurrency(Currency.PLN);
		poland.setPopulation(38186860);

		countries.put(poland.getName(), poland);

		Country uk = new Country();
		uk.setName("United Kingdom");
		uk.setCapital("London");
		uk.setComida("Jaked Potato");
		uk.setCurrency(Currency.GBP);
		uk.setPopulation(63705000);

		countries.put(uk.getName(), uk);

		//Agrege estos paises y primero tienes que agregar a tu countries el tipo de moneda del current

		Country pe = new Country();
		pe.setName("Peru");
		pe.setCapital("Lima");
		pe.setComida("Ceviche");
		pe.setCurrency(Currency.PEN);
		pe.setPopulation(1005000);

		countries.put(pe.getName(), pe);


		Country eu = new Country();
		eu.setName("Estados Unidos");
		eu.setCapital("Washington DC");
		eu.setComida("Hamburguesa");
		eu.setCurrency(Currency.DOL);
		eu.setPopulation(1205000);

		countries.put(eu.getName(), eu);


		Country me = new Country();
		me.setName("Mexico");
		me.setCapital("Ciudad de Mexico");
		me.setComida("Enchiladas");
		me.setCurrency(Currency.PES);
		me.setPopulation(1305000);

		countries.put(me.getName(), me);

	}

	public Country findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return countries.get(name);
	}
}