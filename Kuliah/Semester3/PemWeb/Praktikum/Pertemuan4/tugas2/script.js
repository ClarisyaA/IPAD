let daftarPembelian = [];

function hitungTotal() {
    const barangSelect = document.getElementById('barang');
    const jumlah = document.getElementById('jumlah').value;
    const selectedOption = barangSelect.options[barangSelect.selectedIndex];
    const namaBarang = selectedOption.text.split(" - ")[0];
    const hargaBarang = parseInt(selectedOption.getAttribute('data-harga'));

    const totalHarga = hargaBarang * jumlah;

    const tabelBody = document.querySelector('#tabelKasir tbody');
    const row = document.createElement('tr');
    row.innerHTML = `
        <td>${namaBarang}</td>
        <td>Rp ${hargaBarang.toLocaleString()}</td>
        <td>${jumlah}</td>
        <td>Rp ${totalHarga.toLocaleString()}</td>
    `;
    tabelBody.appendChild(row);

    daftarPembelian.push({namaBarang, hargaBarang, jumlah, totalHarga});
    updateTotalKeseluruhan();
    document.getElementById('formKasir').reset();
}

function updateTotalKeseluruhan() {
    const totalHargaSemua = daftarPembelian.reduce((total, item) => total + item.totalHarga, 0);
    document.getElementById('totalKeseluruhan').textContent = `Total Keseluruhan: Rp ${totalHargaSemua.toLocaleString()}`;
}

function selesaikanPembelian() {
    if (daftarPembelian.length === 0) {
        alert('Silakan tambahkan barang sebelum menyelesaikan pembelian.');
        return;
    }

    localStorage.setItem('strukPembelian', JSON.stringify(daftarPembelian));
    window.location.href = 'struk.html';
}
