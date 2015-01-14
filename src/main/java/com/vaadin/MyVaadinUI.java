package com.vaadin;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.UI;

@Theme("mytheme")
@SuppressWarnings("serial")
public class MyVaadinUI extends UI
{

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = MyVaadinUI.class, widgetset = "com.vaadin.AppWidgetSet")
    public static class Servlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest request) {
        TabSheet spreadsheetUseCases = new TabSheet();
        spreadsheetUseCases.setSizeFull();
        setContent(spreadsheetUseCases);

        spreadsheetUseCases.addComponent(new AddEmptySpreadsheetToView());
        spreadsheetUseCases.addComponent(new OpenAndSaveXLSXInSpreadsheet());
        spreadsheetUseCases.addComponent(new Selection());
        spreadsheetUseCases.addComponent(new ProtectedSheets());
        spreadsheetUseCases.addComponent(new ChangeCellStyling());
//        spreadsheetUseCases.addComponent(new PopupButtonInSheet()); // Completely broken in empty spreadsheets.

        // Add method:
        // Spreadsheet.addMergedRegion("A2:B5");

        // TODO (API should not be fully public):
        // ItemFilter - contains checkboxes for filtering region column contents.

        // TODO (OK API, just need an example):
        //  - create new spreadsheet, delete spreadsheet, select spreadsheet, spreadsheet selection event
        //  - API for hiding/showing columns and rows
        //  - Components in cells, make component visible in cell when focused
        //  - Add cell comment
        //  - Freeze panes
        //  - Info label – e.g. for showing sum of selected cells or other info
        //  - Context menu for cells
        //  - SpreadsheetFilterTable - extends SpreadsheetTable, automatically contains ItemFilters for each region column, handles cascading of filters, adds "clear filters"-button for each popup.
        // API for shifting rows up/down (don't understand even a little bit of what the method is supposed to do)

    }

}
