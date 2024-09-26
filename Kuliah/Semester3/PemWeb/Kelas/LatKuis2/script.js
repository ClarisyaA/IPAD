function calculateTotal() {
    let dewasa = parseInt(document.getElementById("dewasa").value);
    let anak = parseInt(document.getElementById("anak").value)||0;
    let jadwal = parseInt(document.getElementById("jadwal").value);

    let totalPenumpang = dewasa + anak;
    let totalHarga = totalPenumpang * jadwal;

    if (dewasa >= 5 && jadwal >= 140000) {
        totalHarga *= 0.98;
    }

    document.getElementById("harga").value = "Rp. " + totalHarga.toLocaleString();
}

function generateSummary() {
    let tanggal = document.getElementById("tanggal").value;
    let nama = document.getElementById("nama").value;
    let ktp = document.getElementById("ktp").value;
    let dewasa = document.getElementById("dewasa").value;
    let anak = document.getElementById("anak").value||0;
    let jadwal = document.getElementById("jadwal").selectedOptions[0].text;
    let harga = document.getElementById("harga").value;

    let table = `
        <table>
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

    document.getElementById("summary").innerHTML = table;
}