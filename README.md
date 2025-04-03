# Android Fragments Example

## Overview
This is an Android application demonstrating the use of **Fragments** for dynamic UI management. The project consists of three fragments:

1. **FirstFragment** - Contains an `EditText` and a `Button` that sends text to `SecondFragment`.
2. **SecondFragment** - Displays the received text from `FirstFragment`.
3. **MainActivity** - Manages the fragment transitions.

## Features
- Implements **Fragment Transactions** using `FragmentManager`.
- Uses **Bundle Arguments** to pass data between fragments.
- Demonstrates **dynamic fragment replacement**.

## Project Structure
```
📂 app
 ├── 📂 java/com/mkrdeveloper/fragmentexample2
 │   ├── MainActivity.java
 │   ├── FirstFragment.java
 │   ├── SecondFragment.java
 ├── 📂 res/layout
 │   ├── activity_main.xml
 │   ├── fragment_first.xml
 │   ├── fragment_second.xml
 ├── AndroidManifest.xml
```

## Installation
1. Clone this repository:
   ```sh
   git clone https://github.com/your-repo/android-fragment-example.git
   ```
2. Open the project in **Android Studio**.
3. Sync Gradle files.
4. Run the application on an emulator or physical device.

## Usage
1. Enter text in the `EditText` in `FirstFragment`.
2. Click the button to replace `FirstFragment` with `SecondFragment`.
3. The entered text will be displayed in `SecondFragment`.

## Code Highlights
### **Replacing Fragments Dynamically**
```java
FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
transaction.replace(R.id.frameLayout, new SecondFragment());
transaction.commit();
```
### **Passing Data Between Fragments**
```java
Bundle bundle = new Bundle();
bundle.putString("text", editText.getText().toString());
secondFragment.setArguments(bundle);
```

## Screenshots
![App Screenshot](https://your-image-link.com)

## Dependencies
- **AndroidX**
- **Fragment Library**

## License
This project is open-source and available under the [MIT License](LICENSE).

---
Happy Coding! 🚀

