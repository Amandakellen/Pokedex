plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
}

kotlin {
    androidLibrary {
        namespace = "com.example.shared"
        compileSdk = 35
        minSdk = 24
        
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
            }
        }
        
        val androidMain by getting {
            dependencies {
                // Android Core
                implementation(libs.androidx.core.ktx)
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

