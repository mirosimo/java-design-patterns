package aaa_examples.design_patterns.abstract_factory;

import aaa_examples.design_patterns.abstract_factory.enums.DocumentType;
import aaa_examples.design_patterns.abstract_factory.enums.FormatType;

public abstract class CarOffer extends Document {
	
	private int id;
	
	CarOffer(FormatType formatType, int documentId) {
		super(formatType, DocumentType.CAR_OFFER);
		this.id = documentId;
		create();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
