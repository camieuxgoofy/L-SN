<?php
include_once './operations.php';

$post = new Operation();

$nama = $_POST['nama'];
$tanggal_lahir = $_POST['tanggal_lahir'];
$alamat = $_POST['alamat'];
$telepon = $_POST['telepon'];
$kepala_keluarga = $_POST['kepala_keluarga'];

$nama = $post->escape_string($nama);
$tanggal_lahir = $post->escape_string($tanggal_lahir);
$alamat = $post->escape_string($alamat);
$telepon = $post->escape_string($telepon);
$kepala_keluarga = $post->escape_string($kepala_keluarga);

if ($post->create($nama, $tanggal_lahir, $alamat, $telepon, $kepala_keluarga)) {
    echo '<script>alert("Data berhasil disimpan");</script>';
    echo '<script>setTimeout(function(){ window.location.href = "../src/adminPage.php"; }, 200);</script>';
} else {
    echo "Error: Could not create new record.";
}
