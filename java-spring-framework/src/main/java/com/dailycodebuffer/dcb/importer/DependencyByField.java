package com.dailycodebuffer.dcb.importer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DependencyByField {

    public DependencyByField() {
        System.out.println("DependencyByField Init");
    }

    @Autowired
    @Qualifier("jsonImporter")
    public BaseImporter baseImporter; // Field Injection using Autowired

    public void importAll() {
        System.out.println("Importing File using importer" + baseImporter);
        baseImporter.getHeaders();
        baseImporter.importFile();
    }
}
