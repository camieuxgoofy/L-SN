<?php
include_once './operations.php';

$post = new Operation();

$id = $_GET['id_warga'];
if ($post->delete($id, 'warga')) {
    echo "Record deleted successfully.";
} else {
    echo "Error: Could not delete record.";
}
