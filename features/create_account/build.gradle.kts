plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.example.create_account"
    compileSdk = 35
}

kotlin {
    androidTarget {
        compilerOptions {
            jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11
        }
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        androidMain.dependencies {
            implementation(libs.androidx.core.ktx)
            implementation(libs.androidx.appcompat)
            implementation(libs.material)
            implementation(libs.ui.tooling.preview.android)

            // Compose
            implementation(libs.androidx.foundation)
            implementation(libs.androidx.material3.android)


            // Navigation
            implementation(libs.androidx.navigation.compose.v260)

            // Koin
            implementation(libs.koin.core)
            implementation(libs.koin.android)
            implementation(libs.koin.androidx.compose.v350)

            // Firebase
            implementation(libs.firebase.auth)

            // Projeto
            implementation(projects.designSystem)
            implementation(projects.infrastructure.domain.coroutines)
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
            dependencies {

            }
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