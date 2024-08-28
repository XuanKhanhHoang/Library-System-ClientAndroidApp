// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    // ext.hilt_version = '2.42'
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        //    classpath ("com.google.dagger:hilt-android-gradle-plugin:$hilt_version")
        val nav_version = "2.7.7"
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")

    }
}

plugins {
    alias(libs.plugins.android.application) apply false

    kotlin("kapt") version "1.8.0" // Đảm bảo sử dụng cùng phiên bản Kotlin
//    id("com.google.dagger.hilt.android") version "2.44" apply false
    id ("com.google.dagger.hilt.android") version "2.46.1" apply false
    id("com.google.gms.google-services") version "4.4.2" apply false


}