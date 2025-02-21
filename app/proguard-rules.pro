# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

-dontwarn org.conscrypt.Conscrypt
-dontwarn org.conscrypt.OpenSSLProvider

# Please add these rules to your existing keep rules in order to suppress warnings.
# This is generated automatically by the Android Gradle plugin.
-dontwarn com.chartboost.sdk.Chartboost$CBPIDataUseConsent
-dontwarn com.chartboost.sdk.Chartboost
-dontwarn com.chartboost.sdk.ChartboostDelegate
-dontwarn com.chartboost.sdk.Libraries.CBLogging$Level
-dontwarn com.chartboost.sdk.Model.CBError$CBImpressionError
-dontwarn com.google.android.gms.ads.AdError
-dontwarn com.google.android.gms.ads.AdListener
-dontwarn com.google.android.gms.ads.AdLoader$Builder
-dontwarn com.google.android.gms.ads.AdLoader
-dontwarn com.google.android.gms.ads.AdRequest$Builder
-dontwarn com.google.android.gms.ads.AdRequest
-dontwarn com.google.android.gms.ads.AdSize
-dontwarn com.google.android.gms.ads.AdView
-dontwarn com.google.android.gms.ads.FullScreenContentCallback
-dontwarn com.google.android.gms.ads.LoadAdError
-dontwarn com.google.android.gms.ads.MediaContent
-dontwarn com.google.android.gms.ads.MobileAds
-dontwarn com.google.android.gms.ads.OnUserEarnedRewardListener
-dontwarn com.google.android.gms.ads.ResponseInfo
-dontwarn com.google.android.gms.ads.initialization.InitializationStatus
-dontwarn com.google.android.gms.ads.initialization.OnInitializationCompleteListener
-dontwarn com.google.android.gms.ads.interstitial.InterstitialAd
-dontwarn com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
-dontwarn com.google.android.gms.ads.nativead.MediaView
-dontwarn com.google.android.gms.ads.nativead.NativeAd$Image
-dontwarn com.google.android.gms.ads.nativead.NativeAd$OnNativeAdLoadedListener
-dontwarn com.google.android.gms.ads.nativead.NativeAd
-dontwarn com.google.android.gms.ads.nativead.NativeAdView
-dontwarn com.google.android.gms.ads.rewarded.RewardItem
-dontwarn com.google.android.gms.ads.rewarded.RewardedAd
-dontwarn com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
-dontwarn com.huawei.hms.ads.identifier.AdvertisingIdClient$Info
-dontwarn com.huawei.hms.ads.identifier.AdvertisingIdClient
-dontwarn com.ironsource.mediationsdk.IronSource
-dontwarn com.ironsource.mediationsdk.logger.IronSourceError
-dontwarn com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag
-dontwarn com.ironsource.mediationsdk.logger.LogListener
-dontwarn com.ironsource.mediationsdk.model.Placement
-dontwarn com.ironsource.mediationsdk.sdk.InitializationListener
-dontwarn com.ironsource.mediationsdk.sdk.InterstitialListener
-dontwarn com.ironsource.mediationsdk.sdk.RewardedVideoManualListener
-dontwarn com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler
-dontwarn com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
-dontwarn com.mbridge.msdk.out.MBRewardVideoHandler
-dontwarn com.mbridge.msdk.out.MBridgeIds
-dontwarn com.mbridge.msdk.out.MBridgeSDKFactory
-dontwarn com.mbridge.msdk.out.RewardInfo
-dontwarn com.mbridge.msdk.out.RewardVideoListener
-dontwarn com.mbridge.msdk.out.SDKInitStatusListener
-dontwarn com.mbridge.msdk.system.a
-dontwarn com.mbridge.msdk.video.bt.module.b.g
-dontwarn com.startapp.sdk.adsbase.Ad
-dontwarn com.startapp.sdk.adsbase.StartAppAd$AdMode
-dontwarn com.startapp.sdk.adsbase.StartAppAd
-dontwarn com.startapp.sdk.adsbase.StartAppSDK
-dontwarn com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
-dontwarn com.startapp.sdk.adsbase.adlisteners.AdEventListener
-dontwarn com.startapp.sdk.adsbase.adlisteners.VideoListener
-dontwarn com.startapp.sdk.adsbase.model.AdPreferences
-dontwarn com.unity3d.ads.IUnityAdsInitializationListener
-dontwarn com.unity3d.ads.IUnityAdsLoadListener
-dontwarn com.unity3d.ads.IUnityAdsShowListener
-dontwarn com.unity3d.ads.UnityAds$UnityAdsInitializationError
-dontwarn com.unity3d.ads.UnityAds$UnityAdsLoadError
-dontwarn com.unity3d.ads.UnityAds$UnityAdsShowCompletionState
-dontwarn com.unity3d.ads.UnityAds$UnityAdsShowError
-dontwarn com.unity3d.ads.UnityAds
-dontwarn com.unity3d.ads.metadata.MetaData
-dontwarn com.unity3d.services.banners.BannerErrorInfo
-dontwarn com.unity3d.services.banners.BannerView$IListener
-dontwarn com.unity3d.services.banners.BannerView
-dontwarn com.unity3d.services.banners.UnityBannerSize