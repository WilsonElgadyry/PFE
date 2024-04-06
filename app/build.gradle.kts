plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.colap"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.colap"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    // var nav_version = "2.7.7"
    implementation(libs.appcompat) // == implementation("androidx.appcompat:appcompat:1.5.0")
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation("androidx.appcompat:appcompat:1.5.0")
    implementation("com.google.android.material:material:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestAnnotationProcessor("androidx.test.ext:junit:1.1.5")
    androidTestAnnotationProcessor("androidx.test.espresso:espresso-core:3.5.1")


    implementation("com.google.android.material:material:1.11.0")
}