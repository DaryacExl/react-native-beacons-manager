Pod::Spec.new do |s|
  s.name         = "ReactNativeBeaconsManager"
  s.version      = "1.1.0"
  s.summary      = "React-Native library for detecting beacons (iOS and Android)"
  s.homepage     = "https://github.com/MacKentoch/react-native-beacons-manager#readme"
  s.license      = { :type => "MIT" }
  s.authors      = { "" => "" }
  s.platform     = :ios, "8.0"
  s.source       = { :path => "." }
  s.source_files = "ios", "ios/**/*.{h,m}"

  s.dependency 'React'
end


Pod::Spec.new do |s|
  s.name         = "ReactNativeBeaconsManager"
  s.version      = "2.0.0" # Set this to the version of your combined library
  s.summary      = "Combined React-Native library for detecting beacons and managing Bluetooth state"
  s.description  = <<-DESC
                    This library combines functionality for both beacon detection and Bluetooth state management in React Native applications.
                   DESC
  s.homepage     = "https://github.com/ExLibrisGroup/ReactNativeBeaconsManager" # Update with the URL of your combined library's repository
  s.license      = { :type => "MIT" }
  s.authors      = { "ExLibris" => "email@example.com" } # Update with combined library authors
  s.platform     = :ios, "8.0" # Set the minimum supported iOS version, choose the higher version if needed
  s.source       = { :path => "." } # Update if your combined library is in a different location
  s.source_files = "ios/**/*.{h,m}", "ios/*.{h,m}" # Include all relevant source files
  s.requires_arc = true # Set this to true if you require Automatic Reference Counting

  s.dependency "React-Core" # Include all necessary dependencies
  # Include any additional dependencies if needed
end
