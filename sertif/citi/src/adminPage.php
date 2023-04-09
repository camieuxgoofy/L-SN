<?php
session_start();

if ($_SESSION['role'] == "") {
    header("location:../index.php?msg=error");
}

if ($_SESSION['role'] == "warga") {
    header("location:./wargaPage.php");
}

$pageTitle = "Admin";
include('../src/components/header.php')
?>

<h1>Dashboard</h1>
<p>Halo <b><?php echo $_SESSION['username']; ?></b> Anda telah login sebagai <b><?php echo $_SESSION['role']; ?></b>.</p>
<?php
include_once '../controllers/operations.php';
$operation = new Operation();
$data = $operation->index("SELECT * FROM warga ORDER BY nama");
$totalData = count($data);
?>

<a class="outline" role="button" href="./pages/addCitzForm.php">Input Data</a>

<div style="padding: 2rem 0;">
    <table role="grid">
        <tr>
            <th>No</th>
            <th>Nama</th>
            <th>Tanggal Lahir</th>
            <th>Alamat</th>
            <th>Telepon</th>
            <th>Kepala Keluarga</th>
            <th>Aksi</th>
        </tr>
        <?php
        $no = 1;
        foreach ($data as $rows) {
        ?>
            <tr>
                <td><?php echo $nomor = $no++; ?></td>
                <td><?php echo $rows['nama']; ?></td>
                <td><?php echo $rows['tanggal_lahir']; ?></td>
                <td><?php echo $rows['alamat']; ?></td>
                <td><?php echo $rows['telepon']; ?></td>
                <td><?php echo $rows['kepala_keluarga']; ?></td>
                <td style="width: 22%;">
                    <a class="outline secondary" role="button" href="./pages/updateCitzForm.php?id_warga=<?php echo $rows['id_warga']; ?>" onclick="return confirm('Apakah anda yakin ingin mengubah data bernomor <?php echo $nomor ?>?')">Edit</a>
                    <a class="outline secondary" role="button" href="../controllers/destroyCitz.php?id_warga=<?php echo $rows['id_warga']; ?>" onclick="return confirm('Apakah anda yakin ingin menghapus data bernomor <?php echo $nomor ?>?')">Hapus</a>
                </td>
            </tr>
        <?php
        }
        ?>
    </table>
    <span>Jumlah Data :</span><a class=" outline"><?php echo $totalData ?></a>
</div>


<a role="button" href="../logout.php" onclick="return confirm('Halo <?php echo $_SESSION['username']; ?>, apa anda yakin ingin keluar ?')">Log out</a>


<?php
include('../src/components/footer.php')
?>