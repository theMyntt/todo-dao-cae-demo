package com.themyntt.dao_cae_demo.assemblers.documentation;

import com.cae.use_cases.auto_documentation.UseCaseDocumentationExternalizer;

import java.io.IOException;

public class DaoCaeDemoDocumentation {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        UseCaseDocumentationExternalizer.externalize(
                "com.themyntt.dao_cae_demo.assemblers.use_cases",
                "DaoCaeDemo",
                false
        );
    }

}
