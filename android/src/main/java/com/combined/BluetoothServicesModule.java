// Your unified module
package com.combined;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class BluetoothCombinedModule extends ReactContextBaseJavaModule {
    private final BeaconsAndroidModule beaconsModule;
    private final RNBluetoothStateManagerModule btStateManagerModule;

    import com.mackentoch.beaconsandroid.BeaconsAndroidModule;
    import de.patwoz.rn.bluetoothstatemanager.RNBluetoothStateManagerModule;

    public BluetoothCombinedModule(ReactApplicationContext reactContext) {
        super(reactContext);
        beaconsModule = new BeaconsAndroidModule(reactContext);
        beaconsModule.initialize(); // if this method exists
        btStateManagerModule = new RNBluetoothStateManagerModule(reactContext);
        btStateManagerModule.initialize(); // if this method exists
    }

    // Combine getName method
    @Override
    public String getName() {
        return "BluetoothServices";
    }

    @Override
    public Map<String, Object> getConstants() {
	final Map<String, Object> constants = new HashMap<>();
	constants.putAll(beaconsModule.getConstants());
	constants.putAll(btStateManager.getConstants());
	return constants;
    }

    
    @Override
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
	beaconsModule.onCatalystInstanceDestroy()
        btStateManagerModule.onCatalystInstanceDestroy();
    }

    @ReactMethod
    public void getState(Promise promise) {
	btStateManagerModule.getState(promise);
    }

    @ReactMethod
    public void enable(Promise promise) {
	btStateManagerModule.enable(promise);
    }

    @ReactMethod
    public void addListener(String eventName) {
	btStateManagerModule.addListener(eventName);
    }

    @ReactMethod
    public void removeListeners(Integer count) {
	btStateManagerModule.removeListeners(count);
    }

    @ReactMethod
    public void disable(Promise promise) {
	btStateManagerModule.disable(promise);
    }

    @ReactMethod
    public void openSettings(Promise promise) {
	btStateManagerModule.openSettings(promise);
    }

    @ReactMethod
    public void requestToEnable(Promise promise) {
	btStateManagerModule.requestToEnable(promise);
    }

    @ReactMethod
    public void setHardwareEqualityEnforced(Boolean e) {
	beaconsModule.setHardwareEqualityEnforced(e);
    }

    @ReactMethod
    public void addParser(String parser, Callback resolve, Callback reject) {
	beaconsModule.addParser(parser, resolve, reject);
    }

    @ReactMethod
    public void removeParser(String parser, Callback resolve, Callback reject) {
	beaconsModule.removeParser(parser, resolve, reject);
    }

    @ReactMethod
    public void addParsersListToDetection(ReadableArray parsers, Callback resolve, Callback reject) {
	beaconsModules.addParsersListToDetection(parsers, resolve, reject);
    }

    @ReactMethod
    public void removeParsersListToDetection(ReadableArray parsers, Callback resolve, Callback reject) {
	beaconsModules.removeParsersListToDetection(parsers, resolve, reject);
    }

    @ReactMethod
    public void setBackgroundScanPeriod(int period) {
	beaconsModule.setBackgroundScanPeriod(period);
    }

    @ReactMethod
    public void setBackgroundBetweenScanPeriod(int period) {
	beaconsModule.setBackgroundBetweenScanPeriod(period);
    }

    @ReactMethod
    public void setForegroundScanPeriod(int period) {
	beaconsModule.setForegroundScanPeriod(period);
    }

    @ReactMethod
    public void setForegroundBetweenScanPeriod(int period) {
	beaconsModule.setForegroundBetweenScanPeriod(period);
    }

    @ReactMethod
    public void setRssiFilter(int filterType, double avgModifier) {
	beaconsModule.setRssiFilter(filterType, avgModifier);
    }

    @ReactMethod
    public void checkTransmissionSupported(Callback callback) {
	beaconsModule.checkTransmissionSupported(callback);
    }

    @ReactMethod
    public void getMonitoredRegions(Callback callback) {
	beaconsModule.getMonitoredRegions(callback);
    }

    @ReactMethod
    public void getRangedRegions(Callback callback) {
	beaconsModule.getRangedRegions(callback);
    }

    @ReactMethod
    public void startMonitoring(String regionId, String beaconUuid, int minor, int major, Callback resolve, Callback reject) {
	beaconsModule.startMonitoring(regionId, beaconUuid, minor, major, resolve, reject);
    }

    @ReactMethod
    public void stopMonitoring(String regionId, String beaconUuid, int minor, int major, Callback resolve, Callback reject) {
	beaconsModule.stopMonitoring(regionId, beaconUuid, minor, major, resolve, reject);
    }

    @ReactMethod
    public void startRanging(String regionId, String beaconUuid, Callback resolve, Callback reject) {
	beaconsModule.startRanging(regionId, beaconUuid, resolve, reject);
    }

    @ReactMethod
    public void stopRanging(String regionId, String beaconUuid, Callback resolve, Callback reject) {
	beaconsModule.stopRanging(regionId, beaconUuid, resolve, reject);
    }

    @ReactMethod
    public void requestStateForRegion(String regionId, String beaconUuid, int minor, int major) {
	beaconsModule.requestStateForRegion(regionId, beaconUuid, minor, major);
    }
}
