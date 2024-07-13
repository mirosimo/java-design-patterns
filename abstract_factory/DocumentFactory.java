package aaa_examples.design_patterns.abstract_factory;

import aaa_examples.design_patterns.abstract_factory.enums.DocumentType;

public interface DocumentFactory {
	Document createDocument(DocumentType documentType, int id);
	
	Invoice createInvoiceDocument(int id);
	CarOffer createCarOfferDocument(int id);
}
