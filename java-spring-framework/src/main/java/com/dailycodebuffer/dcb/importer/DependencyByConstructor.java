package com.dailycodebuffer.dcb.importer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DependencyByConstructor {

    public BaseImporter baseImporter;

    // Constructor Injection
    @Autowired
    public DependencyByConstructor(@Qualifier("jsonImporter") BaseImporter baseImporter) {
        this.baseImporter = baseImporter;
    }

    public void importAll() {
        System.out.println("Importing File using importer" + baseImporter);
        baseImporter.getHeaders();
        baseImporter.importFile();
    }
}
