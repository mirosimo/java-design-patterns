package aaa_examples.design_patterns.abstract_factory;

import aaa_examples.design_patterns.abstract_factory.enums.DocumentType;

public class FactoryHtml implements DocumentFactory {

	
	/*
	 * Invoice in HTML format
	 * 
	 * */
	@Override
	public Invoice createInvoiceDocument(int id) {		
		return new InvoiceHTML(id);
	}

	/*
	 * Car offer in HTML format
	 * 
	 * */
	@Override
	public CarOffer createCarOfferDocument(int id) {
		return new CarOfferHTML(id);
	}

	@Override
	public Document createDocument(DocumentType documentType, int id) {
		switch (documentType) {
			case INVOICE:
				return createInvoiceDocument(id);
			case CAR_OFFER:
				return createCarOfferDocument(id);
		}
		return null;
	}
}
