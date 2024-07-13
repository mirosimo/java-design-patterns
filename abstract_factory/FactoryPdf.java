package aaa_examples.design_patterns.abstract_factory;

import aaa_examples.design_patterns.abstract_factory.enums.DocumentType;

public class FactoryPdf implements DocumentFactory {

	/*
	 * Invoice in PDF format
	 * 
	 * */
	@Override
	public Invoice createInvoiceDocument(int id) {							
		return new InvoicePDF(id);
	}

	/*
	 * Car offer in PDF format
	 * 
	 * */
	@Override
	public CarOffer createCarOfferDocument(int id) {
		return new CarOfferPDF(id);
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
