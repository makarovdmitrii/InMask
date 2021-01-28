val InMask by extra("com.example.inmask.androidApp")
//val InMask by extra(InMask)
buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.10")
        classpath("com.android.tools.build:gradle:4.1.1")

    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
    }
}