# Assigment-day-30
 📌 Deskripsi Project

Project ini adalah automation testing sederhana menggunakan Selenium WebDriver, TestNG, dan Firefox (GeckoDriver) untuk melakukan skenario checkout berhasil pada website:

🔗 https://www.saucedemo.com/

Skenario testing yang di-otomasi:

Membuka website SauceDemo

Login menggunakan akun standar

Memilih produk Sauce Labs Backpack

Menambahkannya ke keranjang

Melakukan checkout

Mengisi form informasi

Menyelesaikan pemesanan

Melakukan verifikasi teks "Thank you for your order!"

🧪 Teknologi yang digunakan

Java
Selenium WebDriver
TestNG
Firefox + GeckoDriver
Gradle (build tool)


▶ Cara Menjalankan Test
1️⃣ Pastikan Java & Gradle terinstall
java -version
gradle -version

2️⃣ Install dependency
./gradlew build

3️⃣ Jalankan test dengan TestNG (via Gradle)
./gradlew clean test


Test akan otomatis menjalankan file testng.xml.


