import intro
import menu
import androidhelper
droid = androidhelper.Android()

title = "Selamat Datang di E-Quiz !"
title1 = "Ingin membuka E-Quiz?"
def quizconfirm():
    droid.dialogCreateAlert(title, title1)
    droid.dialogSetPositiveButtonText("Terima")
    droid.dialogSetNegativeButtonText("Keluar")
    droid.dialogShow()
    konfirmasi = droid.dialogGetResponse().result

    if konfirmasi['which']=="positive":
        form=droid.dialogGetInput("Silahkan isi", "Nama : ", " ").result
        menu.menuquiz()
    else :
        droid.makeToast ("Selamat Berkunjung, kembali")
        exit()