val jacksonVersion: String by project

plugins {
    // Apply core plugins.
    `java-library`
}

dependencies {
    api(project(":model"))

    implementation(project(":utils"))

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")
}
