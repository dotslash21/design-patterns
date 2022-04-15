package com.github.dotslash21.factory;

import com.github.dotslash21.buttons.Button;
import com.github.dotslash21.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
