window.onload = function() {
    const daftarPembelian = JSON.parse(localStorage.getItem('strukPembelian'));
    const tabelBody = document.querySelector('#tabelStruk tbody');

    if (daftarPembelian) {
        let totalKeseluruhan = 0;

        daftarPembelian.forEach(item => {
            const row = document.createElement('tr');
            row.innerHTML = `
                <td>${item.namaBarang}</td>
                <td>Rp ${item.hargaBarang.toLocaleString()}</td>
                <td>${item.jumlah}</td>
                <td>Rp ${item.totalHarga.toLocaleString()}</td>
            `;
            tabelBody.appendChild(row);
            totalKeseluruhan += item.totalHarga;
        });

        document.getElementById('totalKeseluruhan').textContent = `Total Keseluruhan: Rp ${totalKeseluruhan.toLocaleString()}`;
    } else {
        tabelBody.innerHTML = '<tr><td colspan="4">Tidak ada pembelian</td></tr>';
    }
};

function kembali() {
    window.location.href = 'index.html';
}
