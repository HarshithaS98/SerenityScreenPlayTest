
plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.6.0"
    id("io.freefair.lombok") version "6.1.0"
}

group = "com.yourcompany"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.20-RC")

    // Serenity BDD dependencies
    implementation("net.serenity-bdd:serenity-core:3.6.12")
    implementation("net.serenity-bdd:serenity-screenplay:3.6.12")
    implementation("net.serenity-bdd:serenity-screenplay-webdriver:3.6.12")
    implementation("net.serenity-bdd:serenity-junit:3.6.12")

    // Selenium WebDriver
    implementation("org.seleniumhq.selenium:selenium-java:4.10.0")
    //implementation("cc.ricecx:logsnag4j:1.1")


    // Other dependencies
    // ...
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.2")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.9.2")
    testImplementation("cc.ricecx:logsnag4j:1.1")
    testImplementation("cc.ricecx:logsnag4j:1.1")
    testImplementation("cc.ricecx:logsnag4j:1.1")
    testImplementation("cc.ricecx:logsnag4j:1.1")
    testImplementation("cc.ricecx:logsnag4j:1.1")
    //testImplementation("junit:junit:4.13.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}