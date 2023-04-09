<?php
include '../conn.php';

class Operation extends Database
{
    public function __construct()
    {
        parent::__construct();
    }

    public function index($query)
    {
        $result = $this->conn->query($query);
        if ($result == false) {
            return false;
        }

        $data = array();
        while ($row = $result->fetch_assoc()) {
            $data[] = $row;
        }
        return $data;
    }

    public function create($nama, $tanggal_lahir, $alamat, $telepon, $kepala_keluarga)
    {
        $query = "INSERT INTO warga (nama, tanggal_lahir, alamat, telepon, kepala_keluarga) VALUES ('$nama', '$tanggal_lahir', '$alamat', '$telepon', '$kepala_keluarga')";
        $result = $this->conn->query($query);

        if ($result == false) {
            return false;
        } else {
            return true;
        }
    }

    public function update($id_warga, $nama, $tanggal_lahir, $alamat, $telepon, $kepala_keluarga)
    {
        $query = "UPDATE warga SET nama = '$nama', tanggal_lahir = '$tanggal_lahir', alamat = '$alamat', telepon = '$telepon', kepala_keluarga = '$kepala_keluarga' WHERE id_warga = '$id_warga'";
        $result = $this->conn->query($query);

        if ($result == false) {
            return false;
        } else {
            return true;
        }
    }

    public function delete($id, $table)
    {
        $query = "DELETE FROM $table WHERE id_warga = $id";
        $result = $this->conn->query($query);

        if ($result == false) {
            return false;
        } else {
            return true;
        }
    }

    public function escape_string($value)
    {
        return $this->conn->real_escape_string($value);
    }
}
