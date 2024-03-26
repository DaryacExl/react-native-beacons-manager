import { NativeModules, NativeEventEmitter } from 'react-native';

// Attempt to destructure both possible module names
const { RNBluetoothStateManager, BluetoothServices } = NativeModules;

// Fallback to BluetoothServices if RNBluetoothStateManager is not available (Android case)
const BluetoothModule = RNBluetoothStateManager || BluetoothServices;

if (!BluetoothModule && __DEV__) {
  console.warn('Bluetooth module is not correctly linked');
}

const EventEmitter = new NativeEventEmitter(BluetoothModule);

export { EventEmitter };
export default BluetoothModule;
