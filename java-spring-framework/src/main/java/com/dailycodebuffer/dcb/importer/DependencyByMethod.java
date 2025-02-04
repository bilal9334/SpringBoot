package com.dailycodebuffer.dcb.importer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DependencyByMethod {


    public BaseImporter baseImporter;

    @Autowired
    @Qualifier("jsonImporter")
    public void setImporter(BaseImporter baseImporter) {  // Dependency Injection using Method - @Autowired
        this.baseImporter = baseImporter;
    }

    public void importAll() {
        System.out.println("Importing File using importer" + baseImporter);
        baseImporter.getHeaders();
        baseImporter.importFile();
    }
}
