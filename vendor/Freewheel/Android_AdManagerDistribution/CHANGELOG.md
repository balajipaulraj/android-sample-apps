## Change Log

**6.23.0.0**

Please note, in the next major release (6.24), we will upgrade the minimum supported Android API from 16 to 19. 

- EPU-651 [Android] Deprecate defaultVideoPlayerSlotProfile and defaultSiteSectionSlotProfile with defaultNonTemporalSlotProfile

- EPU-589 [Android] Modify APIs to replace implementation classes with Java collection interfaces
    - APIs that will be updated with new argument types:
        - IAdContext.addRenderer(String className, String baseUnit, String soldAsAdUnit, String contentType, String slotType, Map<String, Object> parameters);
        - IAdContext.addRenderer(String className, String baseUnit, String soldAsAdUnit, String contentType, String slotType, String creativeAPI, Map<String, Object> parameters);
        - IAdInstance.addEventCallbackURLs(String eventName, String eventType, final List<String> urls);
    - APIs that will be updated with new return type:
        - IAdContext.getSlotsByTimePositionClass(IConstants.TimePositionClass timePositionClass);
        - IAdContext.getTemporalSlots();
        - IAdContext.getVideoPlayerNonTemporalSlots();
        - IAdContext.getSiteSectionNonTemporalSlots();
        - IAdInstance.getAllCreativeRenditions();
        - IAdInstance.getRenderableCreativeRenditions();
        - IAdInstance.getEventCallbackURLs(String eventName, String eventType);
        - IAdInstance.getCompanionAdInstances();
        - ICreativeRendition.getOtherRenditionAssets();
        - ISlot.getAdInstances();

**6.22.0.0**

In the next major release (6.23), we will update the collection types of all arguments and returning values in APIs from implementation classes to Java collection interfaces: ArrayList will be changed to List; HashMap and TreeMap will be changed to Map. The following APIs will be affected:
    - APIs that will be updated with new argument types:
        - IAdContext.addRenderer(String className, String baseUnit, String soldAsAdUnit, String contentType, String slotType, Map<String, Object> parameters);
        - IAdContext.addRenderer(String className, String baseUnit, String soldAsAdUnit, String contentType, String slotType, String creativeAPI, Map<String, Object> parameters);
        - IAdInstance.addEventCallbackURLs(String eventName, String eventType, final List<String> urls);
    - APIs that will be updated with new return type:
        - IAdContext.getSlotsByTimePositionClass(IConstants.TimePositionClass timePositionClass);
        - IAdContext.getTemporalSlots();
        - IAdContext.getVideoPlayerNonTemporalSlots();
        - IAdContext.getSiteSectionNonTemporalSlots();
        - IAdInstance.getAllCreativeRenditions();
        - IAdInstance.getRenderableCreativeRenditions();
        - IAdInstance.getEventCallbackURLs(String eventName, String eventType);
        - IAdInstance.getCompanionAdInstances();
        - ICreativeRendition.getOtherRenditionAssets();
        - ISlot.getAdInstances();
Please make adjustments to the app implementation accordingly if any is needed. Thanks.

- EPU-515 [Android] Improve logger to print read-friendly stack trace in ADB logs when exceptions are caught

- EPU-580 [Android] Remove deprecated constants and methods from Android SDK
    - Removed APIs
        - IConstants.CAPABILITY_STATUS_ON()
        - IConstants.CAPABILITY_STATUS_OFF()
        - IConstants.CAPABILITY_STATUS_DEFAULT()
        - IConstants.ID_TYPE_CUSTOM()
        - IConstants.ID_TYPE_FW()
        - IConstants.ID_TYPE_FWGROUP()
        - IConstants.REQUEST_MODE_ON_DEMAND()
        - IConstants.REQUEST_MODE_LIVE()
        - IConstants.VIDEO_ASSET_DURATION_TYPE_EXACT()
        - IConstants.VIDEO_ASSET_DURATION_TYPE_VARIABLE()
        - IConstants.VIDEO_ASSET_AUTO_PLAY_TYPE_NONE()
        - IConstants.VIDEO_ASSET_AUTO_PLAY_TYPE_ATTENDED()
        - IConstants.VIDEO_ASSET_AUTO_PLAY_TYPE_UNATTENDED()
        - IConstants.VIDEO_STATE_PLAYING()
        - IConstants.VIDEO_STATE_PAUSED()
        - IConstants.VIDEO_STATE_STOPPED()
        - IConstants.VIDEO_STATE_COMPLETED()
        - IConstants.SLOT_TYPE_TEMPORAL()
        - IConstants.SLOT_TYPE_SITESECTION_NONTEMPORAL()
        - IConstants.PARAMETER_LEVEL_PROFILE()
        - IConstants.PARAMETER_LEVEL_GLOBAL()
        - IConstants.PARAMETER_LEVEL_SLOT()
        - IConstants.PARAMETER_LEVEL_CREATIVE()
        - IConstants.PARAMETER_LEVEL_RENDITION()
        - IConstants.PARAMETER_LEVEL_OVERRIDE()
        - IConstants.ACTIVITY_STATE_CREATE()
        - IConstants.ACTIVITY_STATE_START()
        - IConstants.ACTIVITY_STATE_RESTART()
        - IConstants.ACTIVITY_STATE_PAUSE()
        - IConstants.ACTIVITY_STATE_RESUME()
        - IConstants.ACTIVITY_STATE_STOP()
        - IConstants.ACTIVITY_STATE_DESTROY()
        - IConstants.ACTIVITY_CALLBACK_CREATE()
        - IConstants.ACTIVITY_CALLBACK_START()
        - IConstants.ACTIVITY_CALLBACK_RESTART()
        - IConstants.ACTIVITY_CALLBACK_PAUSE()
        - IConstants.ACTIVITY_CALLBACK_RESUME()
        - IConstants.ACTIVITY_CALLBACK_STOP()
        - IConstants.ACTIVITY_CALLBACK_DESTROY()
        - IConstants.TIME_POSITION_CLASS_PREROLL()
        - IConstants.TIME_POSITION_CLASS_MIDROLL()
        - IConstants.TIME_POSITION_CLASS_POSTROLL()
        - IConstants.TIME_POSITION_CLASS_OVERLAY()
        - IConstants.TIME_POSITION_CLASS_DISPLAY()
        - IConstants.TIME_POSITION_CLASS_PAUSE_MIDROLL()
        - IConstants.MODULE_TYPE_RENDERER()
        - IConstants.MODULE_TYPE_TRANSLATOR()
        - IConstants.SLOT_OPTION_INITIAL_AD_STAND_ALONE()
        - IConstants.SLOT_OPTION_INITIAL_AD_KEEP_ORIGINAL()
        - IConstants.SLOT_OPTION_INITIAL_AD_FIRST_COMPANION_ONLY()
        - IConstants.SLOT_OPTION_INITIAL_AD_FIRST_COMPANION_OR_STAND_ALONE()
        - IConstants.SLOT_OPTION_INITIAL_AD_FIRST_COMPANION_THEN_STAND_ALONE()
        - IConstants.SLOT_OPTION_INITIAL_AD_FIRST_COMPANION_OR_NO_STAND_ALONE()
        - IConstants.SLOT_OPTION_INITIAL_AD_NO_STAND_ALONE()
        - IConstants.SLOT_OPTION_INITIAL_AD_NO_STAND_ALONE_IF_TEMPORAL()
        - IConstants.SLOT_OPTION_INITIAL_AD_FIRST_COMPANION_OR_NO_STAND_ALONE_IF_TEMPORAL()
        - IConstants.USER_ACTION_PAUSE_BUTTON_CLICKED()
        - IConstants.USER_ACTION_RESUME_BUTTON_CLICKED()

- EPU-41 [Android] Pass creativeData as a JS object from VAST response to VPAID creative

**6.21.3.0**

- EPU-535 [Android] Fixed the issue that the SDK after 6.19 fired the first 3rd party impression tracker again at the end of the ad.

- EPU-533 [Android] Catch potential exceptions from MediaPlayer during video ad playback

**6.21.0.0**

- Note that we are deprecating the support of Android 4.3.x and below in 6.21.0.0 and it will be removed in the next major release (6.22.0.0).

- EPU-286 [Android] Improve the implementation of the events EVENT_CONTENT_VIDEO_PAUSE_REQUEST and EVENT_CONTENT_VIDEO_RESUME_REQUEST.

- EPU-87 [Android] Convert co-dependent constants to enum declarations
    - Deprecated APIs
        - IConstants.CAPABILITY_STATUS_ON()
        - IConstants.CAPABILITY_STATUS_OFF()
        - IConstants.CAPABILITY_STATUS_DEFAULT()
        - IConstants.ID_TYPE_CUSTOM()
        - IConstants.ID_TYPE_FW()
        - IConstants.ID_TYPE_FWGROUP()
        - IConstants.REQUEST_MODE_ON_DEMAND()
        - IConstants.REQUEST_MODE_LIVE()
        - IConstants.VIDEO_ASSET_DURATION_TYPE_EXACT()
        - IConstants.VIDEO_ASSET_DURATION_TYPE_VARIABLE()
        - IConstants.VIDEO_ASSET_AUTO_PLAY_TYPE_NONE()
        - IConstants.VIDEO_ASSET_AUTO_PLAY_TYPE_ATTENDED()
        - IConstants.VIDEO_ASSET_AUTO_PLAY_TYPE_UNATTENDED()
        - IConstants.VIDEO_STATE_PLAYING()
        - IConstants.VIDEO_STATE_PAUSED()
        - IConstants.VIDEO_STATE_STOPPED()
        - IConstants.VIDEO_STATE_COMPLETED()
        - IConstants.SLOT_TYPE_TEMPORAL()
        - IConstants.SLOT_TYPE_SITESECTION_NONTEMPORAL()
        - IConstants.PARAMETER_LEVEL_PROFILE()
        - IConstants.PARAMETER_LEVEL_GLOBAL()
        - IConstants.PARAMETER_LEVEL_SLOT()
        - IConstants.PARAMETER_LEVEL_CREATIVE()
        - IConstants.PARAMETER_LEVEL_RENDITION()
        - IConstants.PARAMETER_LEVEL_OVERRIDE()
        - IConstants.ACTIVITY_STATE_CREATE()
        - IConstants.ACTIVITY_STATE_START()
        - IConstants.ACTIVITY_STATE_RESTART()
        - IConstants.ACTIVITY_STATE_PAUSE()
        - IConstants.ACTIVITY_STATE_RESUME()
        - IConstants.ACTIVITY_STATE_STOP()
        - IConstants.ACTIVITY_STATE_DESTROY()
        - IConstants.ACTIVITY_CALLBACK_CREATE()
        - IConstants.ACTIVITY_CALLBACK_START()
        - IConstants.ACTIVITY_CALLBACK_RESTART()
        - IConstants.ACTIVITY_CALLBACK_PAUSE()
        - IConstants.ACTIVITY_CALLBACK_RESUME()
        - IConstants.ACTIVITY_CALLBACK_STOP()
        - IConstants.ACTIVITY_CALLBACK_DESTROY()
        - IConstants.TIME_POSITION_CLASS_PREROLL()
        - IConstants.TIME_POSITION_CLASS_MIDROLL()
        - IConstants.TIME_POSITION_CLASS_POSTROLL()
        - IConstants.TIME_POSITION_CLASS_OVERLAY()
        - IConstants.TIME_POSITION_CLASS_DISPLAY()
        - IConstants.TIME_POSITION_CLASS_PAUSE_MIDROLL()
        - IConstants.MODULE_TYPE_RENDERER()
        - IConstants.MODULE_TYPE_TRANSLATOR()
        - IConstants.SLOT_OPTION_INITIAL_AD_STAND_ALONE()
        - IConstants.SLOT_OPTION_INITIAL_AD_KEEP_ORIGINAL()
        - IConstants.SLOT_OPTION_INITIAL_AD_FIRST_COMPANION_ONLY()
        - IConstants.SLOT_OPTION_INITIAL_AD_FIRST_COMPANION_OR_STAND_ALONE()
        - IConstants.SLOT_OPTION_INITIAL_AD_FIRST_COMPANION_THEN_STAND_ALONE()
        - IConstants.SLOT_OPTION_INITIAL_AD_FIRST_COMPANION_OR_NO_STAND_ALONE()
        - IConstants.SLOT_OPTION_INITIAL_AD_NO_STAND_ALONE()
        - IConstants.SLOT_OPTION_INITIAL_AD_NO_STAND_ALONE_IF_TEMPORAL()
        - IConstants.SLOT_OPTION_INITIAL_AD_FIRST_COMPANION_OR_NO_STAND_ALONE_IF_TEMPORAL()
        - IConstants.USER_ACTION_PAUSE_BUTTON_CLICKED()
        - IConstants.USER_ACTION_RESUME_BUTTON_CLICKED()
    - Replaces deprecated constants with new enums
        - IConstants.CapabilityStatus {ON, OFF, DEFAULT}
        - IConstants.IdType {CUSTOM, FREEWHEEL, FREEWHEEL_GROUP}
        - IConstants.RequestMode {ON_DEMAND, LIVE}
        - IConstants.VideoAssetDurationType {EXACT, VARIABLE}
        - IConstants.VideoAssetAutoPlayType {NONE, ATTENDED, UNATTENDED}
        - IConstants.VideoState {PLAYING, PAUSED, STOPPED, COMPLETED}
        - IConstants.SlotType {TEMPORAL, NON_TEMPORAL}
        - IConstants.ParameterLevel {PROFILE, GLOBAL, SLOT, CREATIVE, RENDITION, OVERRIDE}
        - IConstants.ActivityState {CREATED, STARTED, RESTARTED, PAUSED, RESUMED, STOPPED, DESTROYED}
        - IConstants.TimePositionClass {PREROLL, MIDROLL, POSTROLL, OVERLAY, DISPLAY, PAUSE_MIDROLL}
        - IConstants.ModuleType {RENDERER, TRANSLATOR}
        - IConstants.SlotInitialAdOption {STAND_ALONE, KEEP_ORIGINAL, FIRST_COMPANION_ONLY, FIRST_COMPANION_OR_STAND_ALONE, FIRST_COMPANION_THEN_STAND_ALONE, FIRST_COMPANION_OR_NO_STAND_ALONE, NO_STAND_ALONE, NO_STAND_ALONE_IF_TEMPORAL, FIRST_COMPANION_OR_NO_STAND_ALONE_IF_TEMPORAL}
        - IConstants.UserAction {PauseButtonClicked, ResumeButtonClicked}

**6.20.3.0**

- EPU-454 [Android] Add protection code to avoid null pointer exceptions when the app disposes the ad context while the image ad is being loaded.
- EPU-452 [Android] Improve robustness by fixing a few potential crashes.

**6.19.0.0**

- EPU-313 [Android] Remove the support of the FreeWheel parameter "renderer.video.useControlPanel".

- EPU-306 [Android] Remove the Medialets extension.

- EPU-215 [Android] Support Android Oreo.

- EPU-43 [Android] Support Data Provider Pingback Framework
    - Firing adEnd, slotEnd callbacks
    - Firing tracking callbacks for ad/slot events
    - Replacing FreeWheel macros with appropriate values in callback URLs. Macros should be enclosed with #c{macro_name}, #ce{macro_name} for encoded value substitution. The following FreeWheel macros are supported:
        - creative.assetLocation
        - content.playheadTime
        - ad.playheadTime
        - comscore.platformname
        - comscore.devicename
        - parameter.parameter_name (parameter_name should be replaced with the name of the Freewheel parameter)

**6.18.0.0**

- [Android] Medialets extension is deprecated and will be removed in 6.19.

- [Android] The FreeWheel parameter "renderer.video.useControlPanel" is deprecated and will be completely removed in 6.19.

- EPU-223 [Android] Support Universal Ad ID in VAST 4
    - New API: IAdInstance.getUniversalAdId()

- EPU-276 [Android] Remove deprecated APIs
    - Deleted APIs
        - IAdContext.addKeyValue(String key, String value)
        - IAdContext.addSiteSectionNonTemporalSlot(String customId, String adUnit, int width, int height, String slotProfile, boolean acceptCompanion, String acceptPrimaryContentType, String acceptContentType)
        - IAdContext.addVideoPlayerNonTemporalSlot(String customId, String adUnit, int width, int height, String slotProfile, boolean acceptCompanion, String acceptPrimaryContentType, String acceptContentType)
        - IAdContext.addVideoPlayerNonTemporalSlot(String customId, String adUnit, int width, int height, String slotProfile, boolean acceptCompanion, String acceptPrimaryContentType, String acceptContentType, int initialAdOption, String compatibleDimensions)
        - IAdContext.addTemporalSlot(String customId, String adUnit, double timePosition, String slotProfile, int cuePointSequence, double maxDuration, String acceptPrimaryContentType, String acceptContentType, double minDuration)
        - IAdContext.setCapability(String capability, int status)
        - IAdContext.setProfile(String playerProfile, String defaultTemporalSlotProfile, String defaultVideoPlayerSlotProfile, String defaultSiteSectionSlotProfile)
        - IAdContext.setRequestDuration(double requestDuration)
        - IAdContext.setRequestMode(int requestMode)
        - IAdContext.setSiteSection(String siteSectionId, int pageViewRandom, int networkId, int idType, String fallbackId)
        - IAdContext.setVideoAsset(String videoAssetId, double duration, String location, boolean autoPlay, int videoPlayRandom, int networkId, int idType, String fallbackId)
        - IAdContext.setVideoAsset(String videoAssetId, double duration, String location, int autoPlayType, int videoPlayRandom, int networkId, int idType, String fallbackId, int durationType)
        - IAdContext.setVideoAssetCurrentTimePosition(double timePosition)
        - IAdContext.setVisitor(String customId, String ipV4Address, int bandwidth, String bandwidthSource)
        - IAdContext.setVisitorHttpHeader(String name, String value)
        - IAdContext.submitRequest(double timeoutSeconds)
        - IAdContext.startSubsession(int subsessionId)
        - IAdContext.resetExclusivity()

- EPU-277 [Android] Support Companion Ads in CTS SSAI Integration
    - Add companion ads support for playback, tracking and reporting in CTS SSAI Integration 

- EPU-273 [Android] Improve memory management handling to avoid potential leaks
    - Releasing FrameLayout reference when Context is disposed helps reduce any potential leaks

- EPU-259 [Android] Replaced the invocations of View.getContext().getMainLooper() with Looper.getMainLooper() to support custom renderer which doesn't use the video display base.

**6.17.0.0**

- Note that all deprecated APIs will be removed in the next major release(6.18.0.0). Please prepare for it accordingly.

- EPU-229 [Android] Move requestDuration from AdRequestConfiguration to VideoAssetConfiguration
    - New APIs
        - VideoAssetConfiguration.setRequestDuration(double)
        - VideoAssetConfiguration.getRequestDuration()
    - Deprecated APIs
        - AdRequestConfiguration.setRequestDuration(double)
        - AdRequestConfiguration.getRequestDuration()

- EPU-53 [Android] Support mute and unmute events for video ads in CTS SSAI integration.

**6.16.5.0**

- EPU-227 [Android]The SDK will automatically stop an interstitial HTML display ad after the duration of the ad is reached.

**6.16.4.0**

- EPU-216 [Android] Fix the issue that the VPAID renderer doesn't escape backslashes in the <AdParameters> node from VAST responses.

**6.16.2.0**

- EPU-199 [Android] Support VAST version with format x.x.x
- EPU-190 [Android] Support VAST 3 single ad translation
    - Only the first ad in the VAST 3 response will be played.

**6.16.0.0**

- OPP-8133 [Android] Support CTS client side beaconing for video ads in VOD SSAI integrations
    - New APIs
        - IAdManager.newCTSContext()
        - ICTSContext
        - CTSAdRequestConfiguration
- EPU-142 [Android] Redesign ad request related APIs
    - Deprecated APIs
        - IAdContext.addKeyValue(String key, String value)
        - IAdContext.addSiteSectionNonTemporalSlot(String customId, String adUnit, int width, int height, String slotProfile, boolean acceptCompanion, String acceptPrimaryContentType, String acceptContentType)
        - IAdContext.addVideoPlayerNonTemporalSlot(String customId, String adUnit, int width, int height, String slotProfile, boolean acceptCompanion, String acceptPrimaryContentType, String acceptContentType)
        - IAdContext.addVideoPlayerNonTemporalSlot(String customId, String adUnit, int width, int height, String slotProfile, boolean acceptCompanion, String acceptPrimaryContentType, String acceptContentType, int initialAdOption, String compatibleDimensions)
        - IAdContext.addTemporalSlot(String customId, String adUnit, double timePosition, String slotProfile, int cuePointSequence, double maxDuration, String acceptPrimaryContentType, String acceptContentType, double minDuration)
        - IAdContext.setCapability(String capability, int status)
        - IAdContext.setProfile(String playerProfile, String defaultTemporalSlotProfile, String defaultVideoPlayerSlotProfile, String defaultSiteSectionSlotProfile)
        - IAdContext.setRequestDuration(double requestDuration)
        - IAdContext.setRequestMode(int requestMode)
        - IAdContext.setSiteSection(String siteSectionId, int pageViewRandom, int networkId, int idType, String fallbackId)
        - IAdContext.setVideoAsset(String videoAssetId, double duration, String location, boolean autoPlay, int videoPlayRandom, int networkId, int idType, String fallbackId)
        - IAdContext.setVideoAsset(String videoAssetId, double duration, String location, int autoPlayType, int videoPlayRandom, int networkId, int idType, String fallbackId, int durationType)
        - IAdContext.setVideoAssetCurrentTimePosition(double timePosition)
        - IAdContext.setVisitor(String customId, String ipV4Address, int bandwidth, String bandwidthSource)
        - IAdContext.setVisitorHttpHeader(String name, String value)
        - IAdContext.submitRequest(double timeoutSeconds)
        - IAdContext.startSubsession(int subsessionId)
        - IAdContext.resetExclusivity()

    - New APIs
        - AdRequestConfiguration
        - CapabilityConfiguration
        - KeyValueConfiguration
        - VisitorConfiguration
        - NonTemporalSlotConfiguration
        - TemporalSlotConfiguration
        - SiteSectionConfiguration
        - VideoAssetConfiguration
        - IAdContext.submitRequestWithConfiguration(AdRequestConfiguration config, double timeoutSeconds)
- ESC-6766 [Android] Improve the VPAID renderer to support the autoplay attribute on the video element

**6.15.0.0**

- ESC-6394 [Android] Fixed a problem that valuesForKey function in AdRequest crashes sometimes.

**6.14.5.0**
- EPU-11 [Android] Support setting ad volume
    - New API: IAdContext.setAdVolume()

**6.13.0.0**
- OPP-8134 [Android] Add Android AdManager support for VPAID 2.0.

**6.12.0**
- OPP-5602 [Android] Update setSiteSection and setVideoAsset function to accept string values for Site Section Fallback ID and Video Asset Fallback ID
    - Changed APIs: 
        - IAdContext.setSiteSection()
        - IAdContext.setVideoAsset()

**6.11.0**
- OPP-6816 [Android] Add a black background between ads in the same slot for linear ads.
- ESC-4744 [Android] Fix the problem that large video duration is sent in Scientific Notation Format in the ad request.
- OPP-7285 [Android] Dispatch a "Request Initiated" Event that fires immediately after IAdContext.submitRequest() is called.

**6.10.0**
- OPP-6596 [Android] Expose Ad error details in ad level events

**6.9.3**
- ESC-4242 [iOS] Fixed a bug that ad request is not immediately canceled if the FWContext instance associated is released before the request completes.

**6.9.0**
- OPP-5381 [Android] Implemented Slot.skipCurrentAd() for the app to be able to skip the current ad in the current playing slot. Note that it's only valid for linear ads.
- OPP-5492 [Android] Updated Android video renderer to prefer renditions with video/mp4-h264-baseline over other MP4 renditions.

**6.8.0**
- INK-6963 [Android] AdManager SDK is now available in AAR format.

**6.5.0**
- OPP-2029 [Android] Improved AdManager to support CPx integration.
    - Added support for loading extensions
    - Added IConstants.EVENT_AD_MEASUREMENT and "EVENT_AD_MEASUREMENT" event
    - Added support for player to get renderer controller and process RENDERER_EVENT_MEASUREMENT event
- ESC-1493 [Android] Improved AdManager to fix a possible crash issue when
  clicking ad for click through page but no browser is available.

