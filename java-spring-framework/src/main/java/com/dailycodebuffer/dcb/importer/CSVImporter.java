package com.dailycodebuffer.dcb.importer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CSVImporter implements BaseImporter{

    public void importFile() {
        System.out.println("Importing CSV File");
    }

    public void getHeaders() {
        System.out.println("Providing list of Headers present in CSV File");
    }
}
