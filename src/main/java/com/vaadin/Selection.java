package com.vaadin;

import com.vaadin.addon.spreadsheet.Spreadsheet.SelectionChangeEvent;
import com.vaadin.addon.spreadsheet.Spreadsheet.SelectionChangeListener;
import com.vaadin.ui.Notification;
import org.apache.poi.ss.util.CellRangeAddress;

public class Selection extends AbstractTab {
    public Selection() {
        spreadsheet.addSelectionChangeListener(new SelectionChangeListener() {
            @Override
            public void onSelectionChange(SelectionChangeEvent event) {
                StringBuilder addresses = new StringBuilder();
                for (CellRangeAddress address : event.getCellRangeAddresses()) {
                    addresses.append(address.formatAsString());
                    addresses.append(" ");
                }
                Notification.show("Selected " + addresses);
            }
        });

//        spreadsheet.setSelection("A2:B5");
//        spreadsheet.setSelection("C17");
//        spreadsheet.setSelection(10,10);
//        spreadsheet.setSelection(0,5,3,10);
    }
}
