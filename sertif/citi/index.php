<?php
$pageTitle = "Login";
include('./src/components/header.php') ?>

<form action="/controllers/verifyLogin.php" method="post">
    <label>Username</label>
    <input type="text" name="username" class="form_login" placeholder="Username" required="required">
    <label>Password</label>
    <input type="password" name="password" class="form_login" placeholder="********" required="required">
    <?php
    if (isset($_GET['msg'])) {
        if ($_GET['msg'] == "error") {
            echo "<a class='outline' id='error-msg'>Username dan password tidak sesuai !</a>";
        }
    }
    ?>
    <button type="submit">Log in</button>
</form>

<?php include('./src/components/footer.php') ?>