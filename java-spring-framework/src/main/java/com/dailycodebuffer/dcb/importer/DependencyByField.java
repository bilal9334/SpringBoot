package com.dailycodebuffer.dcb.importer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyByField {

    @Autowired
    public BaseImporter baseImporter; // Field Injection using Autowired

    public void importAll() {
        System.out.println("Importing File using importer" + baseImporter);
        baseImporter.getHeaders();
        baseImporter.importFile();
    }
}
