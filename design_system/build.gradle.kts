plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.example.design_system"
    compileSdk = 35
}


kotlin {
    androidTarget {
        compilerOptions {
            jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11
        }
    }

    // iOS targets
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        androidMain.dependencies {
            implementation(libs.androidx.core.ktx)
            implementation(libs.androidx.appcompat)
            implementation(libs.material)
            implementation(libs.androidx.foundation.android)
            implementation(libs.androidx.material3.android)
            implementation(libs.koin.androidx.compose.v350)

            //Font
            implementation(libs.androidx.ui.text.google.fonts)

            //preview
            implementation(libs.ui.tooling.preview)
            implementation(libs.kotlin.reflect)
            implementation(libs.koin.androidx.compose.v350)
        }

        commonMain.dependencies {
            implementation(libs.koin.core)
            implementation(libs.kotlinx.coroutines.core)
        }


        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }

        androidUnitTest.dependencies {
            implementation("org.jetbrains.kotlin:kotlin-test")

        }

        iosTest.dependencies {
            implementation("org.jetbrains.kotlin:kotlin-test")
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-test")
        }
    }
}

