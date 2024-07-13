package aaa_examples.design_patterns.abstract_factory;

import aaa_examples.design_patterns.abstract_factory.enums.DocumentType;
import aaa_examples.design_patterns.abstract_factory.enums.FormatType;

public abstract class Document {
	FormatType formatType;
	DocumentType documentType;
	
	private String filePath;
	
	public Document(FormatType formatType, DocumentType documentType) {
		this.formatType = formatType;
		this.documentType = documentType;
	}
	
	abstract void create();

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}		
}
