<?php
session_start();

if ($_SESSION['role'] == "") {
	header("location:../index.php?msg=error");
}
if ($_SESSION['role'] == "admin") {
	header("location:./adminPage.php");
}

$pageTitle = "Warga";
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

<div style="padding: 2rem 0;">
	<table role="grid">
		<tr>
			<th>No</th>
			<th>Nama</th>
			<th>Tanggal Lahir</th>
			<th>Alamat</th>
			<th>Telepon</th>
			<th>Kepala Keluarga</th>
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