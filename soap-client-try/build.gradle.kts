import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
//import javax.jws.WebParam.Mode
plugins {
    kotlin("jvm") version "1.6.20"
    application
}

group = "me.andre"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val jaxws by configurations.creating

dependencies {
    testImplementation(kotlin("test"))
    jaxws("com.sun.xml.ws:jaxws-tools:4.0.0")
    implementation("jakarta.xml.bind:jakarta.xml.bind-api:4.0.0")
    implementation("jakarta.jws:jakarta.jws-api:3.0.0")
    implementation("jakarta.xml.ws:jakarta.xml.ws-api:4.0.0")
    implementation("org.glassfish.hk2:osgi-resource-locator:2.5.0-b42")
    implementation("com.sun.xml.ws:rt:4.0.0")
}

//task("wsimport-myservice") {
//    group = BasePlugin.BUILD_GROUP
//    val destDir = file("$projectDir/src/main/generated")
//    destDir.mkdirs()
////    val sourcedestdir = file("$projectDir/src/main/java")
////    sourcedestdir.mkdirs()
//    doLast {
//        ant.withGroovyBuilder {
//            "taskdef"(
//                "name" to "wsimport",
//                "classname" to "com.sun.tools.ws.ant.WsImport",
//                "classpath" to jaxws.asPath
//            )
//            "wsimport"(
//                "keep" to false,
//                "destDir" to destDir,
//                "package" to "sk11",
//                "wsdl" to "C:\\Repos\\mygithub\\test\\soap-client-try\\src\\main\\resources\\wsdl\\SdmService.wsdl"
//
//            ) {
//                "xjcarg"("value" to "-XautoNameResolution")
//            }
//        }
//    }
//}

task("wsimport-myservice") {
    group = BasePlugin.BUILD_GROUP
    val sourcedestdir = file("$projectDir/src/main/java")
    sourcedestdir.mkdirs()
    doLast {
        ant.withGroovyBuilder {
            "taskdef"(
                "name" to "wsimport",
                "classname" to "com.sun.tools.ws.ant.WsImport",
                "classpath" to jaxws.asPath
            )

            "wsimport"(
                "keep" to true,
                "Xnocompile" to true,
                "sourcedestdir" to sourcedestdir,
                "wsdl" to "C:\\Repos\\mygithub\\test\\soap-client-try\\src\\main\\resources\\wsdl\\SdmService.wsdl",
//                "wsdlLocation" to "http://localhost/wsdl/SomeService.wsdl",
                "package" to "sk11"
            ) {
                "xjcarg"("value" to "-XautoNameResolution")
            }
        }
    }
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}




application {
    mainClass.set("MainKt")
}