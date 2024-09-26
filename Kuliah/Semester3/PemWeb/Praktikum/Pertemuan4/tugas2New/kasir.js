function hitungTotal() {
    const barangSelect = document.getElementById('barang');
    const jumlahInput = document.getElementById('jumlah');

    if (barangSelect.value === "" || jumlahInput.value <= 0) {
        alert("Silakan lengkapi semua field dengan benar!");
        return;
    }

    const hargaPerItem = parseInt(barangSelect.options[barangSelect.selectedIndex].dataset.harga);
    const jumlah = parseInt(jumlahInput.value);
    const totalHarga = hargaPerItem * jumlah;

    const hasilTabel = document.getElementById('hasilTabel').getElementsByTagName('tbody')[0];
    const row = hasilTabel.insertRow(-1);
    row.insertCell(0).textContent = barangSelect.options[barangSelect.selectedIndex].text;
    row.insertCell(1).textContent = jumlah;
    row.insertCell(2).textContent = 'Rp ' + totalHarga.toLocaleString('id-ID');

    jumlahInput.value = '';
    barangSelect.selectedIndex = 0;
}

function selesaiBelanja() {
    const hasilTabel = document.getElementById('hasilTabel').getElementsByTagName('tbody')[0];

    if (hasilTabel.rows.length === 0) {
        alert("Anda belum melakukan pembelian!");
        return;
    }

    let totalKeseluruhan = 0;

    // Hitung total keseluruhan dari semua baris di tabel
    for (let i = 0; i < hasilTabel.rows.length; i++) {
        const totalHargaCell = hasilTabel.rows[i].cells[2].textContent;
        const harga = parseInt(totalHargaCell.replace(/Rp /, '').replace(/\./g, ''));
        totalKeseluruhan += harga;
    }

    alert("Pembelian selesai!\n\nRincian Pembelian:\n" + getRincianPembelian() + "\nTotal Keseluruhan: Rp " + totalKeseluruhan.toLocaleString('id-ID') + "\nTerima kasih telah berbelanja di Toko Pop Mart.");
}

function getRincianPembelian() {
    const hasilTabel = document.getElementById('hasilTabel').getElementsByTagName('tbody')[0];
    let rincian = "";

    for (let i = 0; i < hasilTabel.rows.length; i++) {
        const barang = hasilTabel.rows[i].cells[0].textContent;
        const jumlah = hasilTabel.rows[i].cells[1].textContent;
        const totalHarga = hasilTabel.rows[i].cells[2].textContent;
        rincian += `${barang} - Jumlah: ${jumlah} - ${totalHarga}\n`;
    }

    return rincian;
}
