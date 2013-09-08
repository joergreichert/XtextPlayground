package org.xtext.example.mydsl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.mydsl.myDsl.Model;

import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;
import com.google.inject.Inject;

@RunWith(XtextRunner.class)
@InjectWith(MyDslInjectorProvider.class)
public class MyDslTest {
	@Inject
	XtextResourceSet rs;
	@Inject
	ParseHelper<?> parseHelper;

	@Test
	public void testMydsl() throws Exception {
		File file = new File("res/test.mydsl");
		// Resource res =
		// rs.getResource(URI.createFileURI(file.getAbsolutePath()), true);
		// Map<String, String> options = new HashMap<String, String>();
		// options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		// res.load(options);
		// Assert.assertEquals("errors: " + res.getErrors(),
		// 0,res.getErrors().size());
		// Assert.assertEquals("root element exists", 1,
		// res.getContents().size());
		// Model m = (Model) res.getContents().get(0);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			String stringFromStream = CharStreams
					.toString(new InputStreamReader(fis, Charsets.UTF_8));
			Model model = (Model) parseHelper.parse(stringFromStream);
			Assert.assertNotNull("model null", model);
			Assert.assertEquals("errors: " + model.eResource().getErrors(), 0,
					model.eResource().getErrors().size());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		} finally {
			if (fis != null)
				fis.close();
		}
	}
}
