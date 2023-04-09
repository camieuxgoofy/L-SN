<?php
session_start();

if ($_SESSION['role'] == "") {
    header("location:../../index.php?msg=error");
}

if ($_SESSION['role'] == "warga") {
    header("location:../wargaPage.php");
}

$pageTitle = "Admin";
include('../components/header.php')
?>

<h1>Tambah Data Warga</h1>

<form action="../../controllers/addCitz.php" method="POST">
    <label for="nama"> Nama</label>
    <input type="text" name="nama" id="nama" required>
    <label for="tanggal_lahir"> Tanggal Lahir</label>
    <input type="date" name="tanggal_lahir" id="tanggal_lahir" required>
    <label for="alamat"> Alamat</label>
    <input type="text" name="alamat" id="alamat" required>
    <label for="telepon"> Telepon</label>
    <input type="text" name="telepon" id="telepon" required>
    <label for="kepala_keluarga"> Kepala Keluarga</label>
    <input type="text" name="kepala_keluarga" id="kepala_keluarga" required>
    <button type="submit" name="submit">Submit</button>
</form>


<?php
include('../components/footer.php')
?>