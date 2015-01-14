package com.vaadin;

import com.vaadin.addon.spreadsheet.PopupButton;
import org.apache.poi.hssf.util.CellReference;

public class PopupButtonInSheet extends AbstractTab {

    public PopupButtonInSheet() {
        PopupButton button = new PopupButton(new CellReference(1,1));
        spreadsheet.addPopupButton(button);

//        spreadsheet.setPopup("A2", new Label("foo"));
//        spreadsheet.setPopup(1,1, new Label("foo"));
//        spreadsheet.getCell(1,1).setPopup(new Label("Foo"));
    }
}
