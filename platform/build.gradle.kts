plugins {
  `java-platform`
}

javaPlatform {
  allowDependencies()
}

dependencies {
  constraints {
    api("androidx.core:core-ktx:1.3.2")
    api("androidx.appcompat:appcompat:1.2.0")
    api("com.google.android.material:material:1.3.0")
    api("androidx.test.ext:junit:1.1.2")
    api("androidx.test.espresso:espresso-core:3.3.0")
  }
}