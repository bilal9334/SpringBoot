package com.dailycodebuffer.dcb.importer;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CSVImporter implements BaseImporter{

    public CSVImporter() {
        System.out.println("CSVImporter Init.");
    }

    public void importFile() {
        System.out.println("Importing CSV File");
    }

    public void getHeaders() {
        System.out.println("Providing list of Headers present in CSV File");
    }
}
