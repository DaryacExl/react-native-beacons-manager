// React Native Platform module is required to differentiate between platforms
import { Platform } from 'react-native';

// Import and export BluetoothStateManager and BluetoothState
import BluetoothStateManager from './BluetoothStateManager';
import BluetoothState from './BluetoothState';
export { BluetoothStateManager, BluetoothState };

// Platform-specific imports for the beacons functionality
const RNiBeaconsModule = Platform.select({
  ios: () => require('./lib/next/new.module.ios.js'),
  android: () => require('./lib/next/new.module.android.js'),
})();

// Export RNiBeaconsModule to be used as beacons
export { RNiBeaconsModule as beacons };
