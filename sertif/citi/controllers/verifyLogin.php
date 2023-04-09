<?php
session_start();

include '../conn.php';

$username = $_POST['username'];
$password = $_POST['password'];

$db = new Database();
$conn = $db->getConnection();

$login = $conn->query("SELECT * FROM users WHERE username='$username' AND password='$password'");
$cek = $login->num_rows;

if ($cek > 0) {
    $data = $login->fetch_assoc();

    $_SESSION['username'] = $username;
    $_SESSION['role'] = $data['role'];
    $halaman = ($data['role'] == "admin") ? "../src/adminPage.php" : "../src/wargaPage.php";
    header("location: $halaman");
} else {
    header("location:../index.php?msg=error");
}

$db->closeConnection();
