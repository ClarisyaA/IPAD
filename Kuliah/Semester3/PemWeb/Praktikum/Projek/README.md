# Project Pemrograman Web A - Cak Hero
Project ini dibuat dalam rangka pemrograman web bersama dengan GitHub Classroom.

<p align="center">
  <h2 align="center">
    NAMA PROJECT: FAMProperty
  </h2>
</p>

<!-- Daftar Isi -->
<details open="open">
  <summary><h2 style="display: inline-block">Daftar Isi</h2></summary>
  <ol>
    <li><a href="#anggota-kelompok">Anggota Kelompok</a></li>
    <li><a href="#fungsi">Fungsi</a></li>
    <li><a href="#tujuan">Tujuan</a></li>
    <li><a href="#target-pengguna">Target Pengguna</a></li>
    <li><a href="#mockup-kasar-sederhana">Mockup Kasar Sederhana</a></li>
    <li><a href="#skema-database">Skema Database</a></li>
  </ol>
</details>

<!-- Anggota Kelompok -->
## Anggota Kelompok
| NPM           | Nama              |
| ------------- |-------------------|
| 140810230003  | Adelia Felisha    |
| 140810230017  | Clarisya Adeline  |
| 140810230037  | Martha Meslina    |

<!-- Fungsi -->
## Fungsi
Website ini dirancang untuk membantu pengguna dalam mencari properti seperti rumah, tanah, ruko, dan gudang yang tersedia untuk dijual atau disewa. Fitur utama yang ditawarkan meliputi pencarian properti berdasarkan lokasi, harga, dan tipe, serta kemampuan bagi agen untuk mengelola listing properti mereka (menambah, mengedit, menghapus, dan mempublikasikan listingan iklan properti).

<!-- Tujuan -->
## Tujuan
Tujuan utama dari proyek ini adalah untuk menciptakan platform yang mudah digunakan oleh pengguna dalam mencari properti sesuai kebutuhan mereka, sekaligus memberikan agen properti alat untuk mengelola listing secara efisien. Website ini juga bertujuan untuk meningkatkan interaksi antara pengguna dan agen melalui fitur AI Chatbot yang dapat merekomendasikan agen terbaik berdasarkan preferensi pengguna.

<!-- Target Pengguna -->
## Target Pengguna
1. **Pembeli/Sewa Properti:** Individu atau perusahaan yang mencari properti untuk dibeli atau disewa.
2. **Agen Properti:** Agen yang ingin mempublikasikan dan mengelola listing properti mereka.
3. **Developer Properti:** Pembangun yang ingin memasarkan proyek properti mereka melalui platform ini.

<!-- Mockup Kasar Sederhana -->
## Mockup Kasar Sederhana
![Mockup Kasar](link_mockup.png)
*Gambar mockup kasar halaman utama website.*

<!-- Skema Database -->
## Skema Database
Berikut adalah skema database yang digunakan dalam proyek ini:

**Tabel `Users`:**
| Field           | Type             | Description                 |
|-----------------|------------------|-----------------------------|
| id              | INT (Primary Key)| ID unik setiap pengguna     |
| name            | VARCHAR(100)     | Nama pengguna               |
| email           | VARCHAR(100)     | Email pengguna              |
| password        | VARCHAR(100)     | Password terenkripsi        |

**Tabel `Properties`:**
| Field           | Type             | Description                 |
|-----------------|------------------|-----------------------------|
| id              | INT (Primary Key)| ID unik setiap properti     |
| title           | VARCHAR(100)     | Judul properti              |
| description     | TEXT             | Deskripsi properti          |
| price           | DECIMAL(10,2)    | Harga properti              |
| location        | VARCHAR(100)     | Lokasi properti             |
| agent_id        | INT              | ID agen yang memiliki properti |

**Tabel `Agents`:**
| Field           | Type             | Description                 |
|-----------------|------------------|-----------------------------|
| id              | INT (Primary Key)| ID unik setiap agen         |
| name            | VARCHAR(100)     | Nama agen                   |
| rating          | DECIMAL(2,1)     | Peringkat agen              |
| contact_info    | VARCHAR(100)     | Informasi kontak agen       |

Skema ini mendukung fungsionalitas utama website dan dapat dikembangkan lebih lanjut sesuai kebutuhan proyek.

