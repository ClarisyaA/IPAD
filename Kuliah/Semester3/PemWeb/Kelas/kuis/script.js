function hitungTotal() {
    let dewasa = parseInt(document.getElementById("dewasa").value);
    let anak = parseInt(document.getElementById("anak").value)||0;
    let jadwal = parseInt(document.getElementById("jadwal").value);

    let totalPenumpang = dewasa + anak;
    let totalHarga = totalPenumpang * jadwal;

    if (totalPenumpang>=5 && jadwal >= 140000){
        totalHarga *= 0.98;
    }

    document.getElementById("harga").value = "Rp. " + totalHarga.toLocaleString();
    
}
function hasil() {
    let tanggal = document.getElementById("tanggal").value;
    let nama = document.getElementById("nama").value;
    let ktp = document.getElementById("ktp").value;
    let dewasa = document.getElementById("dewasa").value;
    let anak = document.getElementById("anak").value || 0;
    let jadwal = document.getElementById("jadwal").selectedOptions[0].text;
    let harga = document.getElementById("harga").value;

    if (!tanggal || !nama || !ktp || !dewasa || dewasa == 0 || !harga) {
        alert("Harap lengkapi semua data sebelum booking tiket.");
        return;
    }

    let table = `
        <h2>Receipt Booking Tiket</h2>
        <table border="1" cellpadding="10" cellspacing="0">
            <tr>
                <th>Nama Lengkap</th>
                <th>Nomor KTP</th>
                <th>Tanggal Keberangkatan</th>
                <th>Jadwal</th>
                <th>Dewasa</th>
                <th>Anak</th>
                <th>Total Harga</th>
            </tr>
            <tr>
                <td>${nama}</td>
                <td>${ktp}</td>
                <td>${tanggal}</td>
                <td>${jadwal}</td>
                <td>${dewasa}</td>
                <td>${anak}</td>
                <td>${harga}</td>
            </tr>
        </table>
    `;

    document.getElementById("result").innerHTML = table;

    alert("Booking tiket berhasil! Terima kasih telah memesan tiket.");
}
