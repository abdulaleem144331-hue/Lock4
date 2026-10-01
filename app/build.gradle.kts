plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }
android { namespace="com.lock4.finalapp"; compileSdk=35; defaultConfig { applicationId="com.lock4.finalapp"; minSdk=26; targetSdk=35; versionCode=6; versionName="6.0" } }
dependencies { implementation("androidx.core:core-ktx:1.15.0") }
