plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.compose.multiplatform)
}

kotlin {
    androidLibrary {
        namespace = "com.example.features.onboarding"
        compileSdk = 35
        minSdk = 24
        
        // Enable Android resources
        androidResources {
            enable = true
        }
        
        // Enable device tests
        withDeviceTest {
            instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }
        
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
                implementation(project(":design_system"))
            }
        }
        
        val androidMain by getting {
            dependencies {
                // Android Core
                implementation(libs.androidx.core.ktx)
                implementation(libs.androidx.appcompat)
                implementation(libs.material)
                
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
        
        val androidDeviceTest by getting {
            dependencies {
                implementation(libs.androidx.junit)
                implementation(libs.androidx.espresso.core)
            }
        }
    }
}