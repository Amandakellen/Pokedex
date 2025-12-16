plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.google.services)
}

kotlin {
    androidTarget {
        compilerOptions {
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.fromTarget("11"))
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                // Koin Core (multiplatform)
                implementation(libs.koin.core)
                
                // Compose Multiplatform (common code)
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material3)
                implementation(compose.components.resources)
                implementation(compose.components.uiToolingPreview)
                
                // Navigation Multiplatform
                implementation(libs.androidx.navigation.compose.multiplatform)
                
                // Project modules
                implementation(project(":features"))
                implementation(project(":design_system"))
                implementation(project(":features:onboarding"))
                implementation(project(":features:create_account"))
            }
        }

        val androidMain by getting {
            dependencies {
                // Android Core
                implementation(libs.androidx.core.ktx)
                implementation(libs.androidx.lifecycle.runtime.ktx)
                implementation(libs.androidx.activity.compose)
                
                // Koin Android
                implementation(libs.koin.android)
                implementation(libs.koin.androidx.compose.v350)
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(libs.junit)
            }
        }

        val androidInstrumentedTest by getting {
            dependencies {
                implementation(libs.androidx.junit)
                implementation(libs.androidx.espresso.core)
                implementation(libs.androidx.ui.test.junit4)
            }
        }
    }
}

android {
    namespace = "com.example.poekedex"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.poekedex"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    // Firebase BOM (for KMP, must be at root level)
    implementation(platform(libs.firebase.bom))
    
    // Compose Debug (for KMP, must be at root level)
    debugImplementation(compose.preview)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}