package com.appthwack.sandwich.views.interfaces;

public interface IAEditText extends IAView {

	void enterText(String text);
	void enterTextAndSendEnter(String text);
	void clearText();
}
