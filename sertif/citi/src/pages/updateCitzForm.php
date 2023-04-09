<?php
session_start();

if ($_SESSION['role'] == "") {
    header("location:../../index.php?msg=error");
}

if ($_SESSION['role'] == "warga") {
    header("location:../wargaPage.php");
}

// Fetch data warga
include '../../conn.php';

$id_warga = $_GET['id_warga'];

$database = new Database();
$conn = $database->getConnection();

$query = "SELECT * FROM warga WHERE id_warga = $id_warga";
$result = mysqli_query($conn, $query);
$row = mysqli_fetch_assoc($result);

$nama = $row['nama'];
$tanggal_lahir = $row['tanggal_lahir'];
$alamat = $row['alamat'];
$telepon = $row['telepon'];
$kepala_keluarga = $row['kepala_keluarga'];
// End Fetch
$pageTitle = "Admin";
include('../components/header.php')
?>

<form action="../../controllers/updateCitz.php" method="POST">
    <input type="hidden" name="id_warga" value="<?php echo $id_warga; ?>">
    <label for="nama">Nama:</label>
    <input type="text" id="nama" name="nama" value="<?php echo $nama; ?>"><br>
    <label for="tanggal_lahir">Tanggal Lahir:</label>
    <input type="date" id="tanggal_lahir" name="tanggal_lahir" value="<?php echo $tanggal_lahir; ?>"><br>
    <label for="alamat">Alamat:</label>
    <input type="text" id="alamat" name="alamat" value="<?php echo $alamat; ?>"><br>
    <label for="telepon">Telepon:</label>
    <input type="text" id="telepon" name="telepon" value="<?php echo $telepon; ?>"><br>
    <label for="kepala_keluarga">Kepala Keluarga:</label>
    <input type="text" id="kepala_keluarga" name="kepala_keluarga" value="<?php echo $kepala_keluarga; ?>"><br>
    <input type="submit" value="Update">
</form>
<?php
include('../components/footer.php')
?>