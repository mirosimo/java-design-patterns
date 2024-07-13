package aaa_examples.design_patterns.abstract_factory;

import aaa_examples.design_patterns.abstract_factory.enums.FormatType;

public class InvoiceHTML extends Invoice {
	InvoiceHTML(int id) {
		super(FormatType.HTML, id);
	}

	@Override
	void create() {
			System.out.println("Creating " + documentType +" in format: " + formatType +
					" and ID " + super.getId());				
	}
}
