package com.dailycodebuffer.dcb;

import com.dailycodebuffer.dcb.importer.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LooselyCoupledSpringApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SpringImportConfig.class);

        var importerService = context.getBean(DependencyByConstructor.class);
        importerService.importAll();

    }
}
