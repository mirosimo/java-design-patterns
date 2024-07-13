package aaa_examples.design_patterns.abstract_factory;

import aaa_examples.design_patterns.abstract_factory.enums.DocumentType;
import aaa_examples.design_patterns.abstract_factory.enums.FormatType;

public class FormatFactory {	
	public void createDocument(FormatType formatType, DocumentType documentType, int id) {				
		switch (formatType) {
			case HTML:
				this.getFactoryHTML().createDocument(documentType, id);			
				break;
			case PDF:
				this.getFactoryPDF().createDocument(documentType, id);			
				break;
			default:
				break;
		}				
			
	}
	
	public FactoryPdf getFactoryPDF() {
		return new FactoryPdf();
	}
	
	public FactoryHtml getFactoryHTML() {
		return new FactoryHtml();
	}
	
}
