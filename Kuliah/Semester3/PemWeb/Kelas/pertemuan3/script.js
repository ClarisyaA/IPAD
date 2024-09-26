function hitung(operator) {
    const bil1 = parseFloat(document.getElementById("bil1").value);
    const bil2 = parseFloat(document.getElementById("bil2").value);
    let hasil = 0;

    if (operator === '+') {
        hasil = bil1 + bil2;
    } else if (operator === '-') {
        hasil = bil1 - bil2;
    } else if (operator === '*') {
        hasil = bil1 * bil2;
    } else if (operator === '/') {
        hasil = bil1 / bil2;
    }

    document.getElementById("hasil").innerText = `Hasil: ${hasil}`;
}
