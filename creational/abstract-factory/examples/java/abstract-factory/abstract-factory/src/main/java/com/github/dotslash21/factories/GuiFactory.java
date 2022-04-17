package com.github.dotslash21.factories;

import com.github.dotslash21.buttons.Button;
import com.github.dotslash21.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GuiFactory {
    
    Button createButton();
    Checkbox createCheckbox();
}
