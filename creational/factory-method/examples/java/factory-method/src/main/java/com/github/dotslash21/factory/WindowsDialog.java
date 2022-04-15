package com.github.dotslash21.factory;

import com.github.dotslash21.buttons.Button;
import com.github.dotslash21.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
