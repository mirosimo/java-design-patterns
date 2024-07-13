package aaa_examples.design_patterns.abstract_factory;

import aaa_examples.design_patterns.abstract_factory.enums.FormatType;

public class CarOfferPDF extends CarOffer {
	CarOfferPDF(int id) {
		super(FormatType.PDF, id);
	}
	
	@Override
	void create() {
		System.out.println("Creating " + documentType +" in format: " + formatType +
				" and ID " + super.getId());	
	}
}
