package com.bluetoothservices;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.mackentoch.beaconsandroid.BeaconsAndroidModule;
import de.patwoz.rn.bluetoothstatemanager.RNBluetoothStateManagerModule;

import java.util.ArrayList;
import java.util.List;

public class BluetoothServicesPackage implements ReactPackage {

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new BeaconsAndroidModule(reactContext));
        modules.add(new RNBluetoothStateManagerModule(reactContext));
        return modules;
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return new ArrayList<>();
    }
}
