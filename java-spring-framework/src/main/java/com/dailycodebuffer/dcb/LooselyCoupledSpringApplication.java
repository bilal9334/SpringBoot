package com.dailycodebuffer.dcb;

import com.dailycodebuffer.dcb.importer.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LooselyCoupledSpringApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SpringImportConfig.class);

        var importerServiceField = context.getBean(DependencyByField.class);
        importerServiceField.importAll();
        context.close();

//        var importerServiceField2 = context.getBean(DependencyByField.class);
//        importerServiceField2.importAll();
//
//        var importerService = context.getBean(DependencyByMethod.class);
//        importerService.importAll();
//
//        var importerService2 = context.getBean(DependencyByMethod.class);
//        importerService2.importAll();

    }
}
