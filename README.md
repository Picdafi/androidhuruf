# Membuat Aplikasi Mengenal Huruf dengan menggunakan android studio

### Buat Project Baru di Android Studio

### Menambahkan Gambar 
Untuk menambahkan gambar di android studio, silahkan drag dan letakkan file gambar ke dalam folder drawable.

### Menambahkan Suara
Untuk menambahkan suara di android studio, buat folder raw di dalam Res dengan cara : (Klik res – New – Resource Directory dan pada directory name tulis raw dan resouce type pilih raw)
silahkan drag dan letakkan file suara ke dalam folder raw.
 
### [Buat Perintah pada Activity_main.xml](https://github.com/Picdafi/androidhuruf/blob/master/MyApplication/app/src/main/res/layout/activity_main.xml).


### [Buat Perintah pada MainActivity.xml](https://github.com/Picdafi/androidhuruf/blob/master/MyApplication/app/src/main/java/com/example/myapplication/MainActivity.java).

### [Buat Activity baru dengan nama hurufa.java](https://github.com/Picdafi/androidhuruf/blob/master/MyApplication/app/src/main/java/com/example/myapplication/hurufa.java).
- perintah ini selanjutnya bisa diterapkan di gambar huruf selanjutnya {hurufb, hurufc, dst).

 
### [Buat Activity baru dengan nama Activity_hurufa.xml](https://github.com/Picdafi/androidhuruf/blob/master/MyApplication/app/src/main/res/layout/activity_hurufa.xml).
- perintah ini selanjutnya bisa diterapkan di gambar huruf selanjutnya {hurufb, hurufc, dst).


### Menambahkan perintah Intent di MainActivity.java
- (perintah ini bisa disesuaikan berdasarkan jumlah class yang dibuat).
public void bt_hurufa(View view) {
Intent i = new Intent(MainActivity.this,hurufa.class);
startActivity(i);
}

### Hasil RUN

![Hasil yang ditampilkan](https://github.com/Picdafi/androidhuruf/blob/master/gambar/gambar1.jpeg)
![Hasil yang ditampilkan](https://github.com/Picdafi/androidhuruf/blob/master/gambar/gambar2.jpeg)
![Hasil yang ditampilkan](https://github.com/Picdafi/androidhuruf/blob/master/gambar/gambar3.jpeg)
