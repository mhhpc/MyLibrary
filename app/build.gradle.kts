plugins {
    id("com.android.application")
}

android {
    namespace = "com.android.mylibrary"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.short_stories"
        minSdk = 23
        targetSdk = 34
        versionCode = 20
        versionName = "6.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        debug {
            applicationIdSuffix = ".debug"
            versionNameSuffix = " Debug"
        }
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
   // implementation("androidx.activity:activity:1.9.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")

    //added for transition between activities
    //androidTestImplementation("androidx.core:core:1.13.1")
    //androidTestImplementation("androidx.appcompat:appcompat:1.7.0")

    //animation
    implementation("com.andkulikov:transitionseverywhere:1.7.8")
    //lottie
    implementation("com.airbnb.android:lottie:6.4.0")
    //circle image
    implementation("de.hdodenhof:circleimageview:3.1.0")
    //shape and view
    implementation("io.github.florent37:shapeofview:1.4.7")
    //picasso (ImageLoader)
    implementation("com.squareup.picasso:picasso:2.71828")
    //custom toast
    implementation("io.github.muddz:styleabletoast:2.4.0")
}