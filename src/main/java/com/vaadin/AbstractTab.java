package com.vaadin;

import com.vaadin.addon.spreadsheet.Spreadsheet;
import com.vaadin.ui.VerticalLayout;

public class AbstractTab extends VerticalLayout {
    protected Spreadsheet spreadsheet;

    public AbstractTab() {
        setCaption(getClass().getSimpleName());
        setSizeFull();
        spreadsheet = new Spreadsheet();
        spreadsheet.createCell(1,1,"");
        addComponent(spreadsheet);
    }
}
