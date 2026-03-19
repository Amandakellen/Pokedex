plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.compose.multiplatform)
}

compose.resources {
    publicResClass = true
}

kotlin {
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    androidLibrary {
        namespace = "com.example.design_system"
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
                implementation(compose.ui)
                implementation(compose.components.resources)
                implementation(compose.components.uiToolingPreview)
            }
        }
        
        val androidMain by getting {
            dependencies {
                implementation(libs.androidx.core.ktx)
                implementation(libs.androidx.ui.text.google.fonts)
                implementation(libs.koin.androidx.compose.v350)
                implementation(libs.kotlin.reflect)
            }
        }

        val iosMain by creating {
            dependsOn(commonMain)
        }

        val iosX64Main by getting { dependsOn(iosMain) }
        val iosArm64Main by getting { dependsOn(iosMain) }
        val iosSimulatorArm64Main by getting { dependsOn(iosMain) }
        
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