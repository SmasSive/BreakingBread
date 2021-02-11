plugins {
  id("com.android.application")
  id("kotlin-android")
}

android {
  compileSdkVersion(30)
  buildToolsVersion = "30.0.2"

  defaultConfig {
    applicationId = "com.smassive.breakingbread"
    minSdkVersion(23)
    targetSdkVersion(30)
    versionCode = 1
    versionName = "1.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    named("release") {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }

  kotlinOptions {
    jvmTarget = "1.8"
  }
}

dependencies {
  implementation(platform(project(":platform")))
  implementation("androidx.core:core-ktx")
  implementation("androidx.appcompat:appcompat")
  implementation("com.google.android.material:material")
  testImplementation("androidx.test.ext:junit")
  androidTestImplementation("androidx.test.ext:junit")
  androidTestImplementation("androidx.test.espresso:espresso-core")
}