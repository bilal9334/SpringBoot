package com.dailycodebuffer.dcb.importer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("jsonImporter")
public class JSONImporter implements BaseImporter{

    public JSONImporter() {
        System.out.println("JSONImporter Init.");
    }

    public void importFile() {
        System.out.println("Importing JSON File");

    }

    public void getHeaders() {
        System.out.println("Providing list of Headers present in JSON File");
    }
}
