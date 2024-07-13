package aaa_examples.design_patterns.abstract_factory;

import aaa_examples.design_patterns.abstract_factory.enums.DocumentType;
import aaa_examples.design_patterns.abstract_factory.enums.FormatType;

public class main {

	public static void main(String[] args) {
						
		new FormatFactory().createDocument(FormatType.PDF, DocumentType.INVOICE, 232);
		new FormatFactory().getFactoryHTML().createCarOfferDocument(1006);
		new FormatFactory().getFactoryPDF().createCarOfferDocument(10005);
	}

}
