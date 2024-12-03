plugins {
    id("java")
    id("io.freefair.lombok") version "8.11"
}

group = "com.gsmserver"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.codeborne:selenide:7.6.0")
    implementation("com.github.javafaker:javafaker:1.0.2")

}

tasks.test {
    useJUnitPlatform()
}