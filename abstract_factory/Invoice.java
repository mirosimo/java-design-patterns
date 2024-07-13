package aaa_examples.design_patterns.abstract_factory;

import aaa_examples.design_patterns.abstract_factory.enums.DocumentType;
import aaa_examples.design_patterns.abstract_factory.enums.FormatType;

public abstract class Invoice extends Document {

	private int id;
	
	Invoice(FormatType formatType, int id) {		
		super(formatType, DocumentType.INVOICE);
		this.id = id;
		create();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
