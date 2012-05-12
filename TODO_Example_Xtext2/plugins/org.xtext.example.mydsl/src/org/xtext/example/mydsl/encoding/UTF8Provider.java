package org.xtext.example.mydsl.encoding;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.parser.IEncodingProvider;

import com.google.inject.Singleton;

@Singleton
public class UTF8Provider implements IEncodingProvider {
	
	@Override
	public String getEncoding(URI uri) {
		return "UTF-8";
	}
}
