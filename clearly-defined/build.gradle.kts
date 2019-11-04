import java.net.URL

plugins {
    // Apply core plugins.
    `java-library`

    // Apply third-party plugins.
    id("org.openapi.generator") version "4.1.0"
}

openApiGenerate {
    generatorName.set("kotlin")

    // The below results in:
    // Server returned HTTP response code: 403 for URL: https://api.clearlydefined.io/schemas/swagger.yaml
    inputSpec.set(URL("https://api.clearlydefined.io/schemas/swagger.yaml").readText())


    // The below code works fine.
    //inputSpec.set(URL("https://github.com/clearlydefined/service/raw/master/schemas/swagger.yaml").readText())
}
