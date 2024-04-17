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
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //animation
    implementation("com.andkulikov:transitionseverywhere:1.7.8")
    //lottie
    implementation("com.airbnb.android:lottie:5.2.0")
    //circle image
    implementation("de.hdodenhof:circleimageview:3.1.0")
    //shape and view
    implementation("io.github.florent37:shapeofview:1.4.7")
    //picasso (ImageLoader)
    implementation("com.squareup.picasso:picasso:2.71828")
    //custom toast
    implementation("io.github.muddz:styleabletoast:2.4.0")
}