package org.xtext.example.mydsl.testutils;

import org.eclipse.swtbot.swt.finder.SWTBot;

import junit.framework.Assert;

public class ProjectWizardTestHelper {
	private SWTBot bot;

	public ProjectWizardTestHelper(SWTBot bot) {
		this.bot = bot;
	}

	public SWTBot getBot() {
		return bot;
	}
	
	protected void setBot(SWTBot bot) {
		this.bot = bot;
	}

	public void setText(int pos, String text, String... defaultText) {
		if (text != null) {
			bot.text(pos).setText(text);
		} else if (defaultText.length == 2) {
			Assert.assertEquals(defaultText[0], defaultText[1], bot.text(pos)
					.getText());
		}
	}
}
