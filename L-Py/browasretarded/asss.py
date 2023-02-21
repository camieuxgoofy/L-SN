import androidhelper
droid = androidhelper.Android()

judul = "Hello"
pesan = "Halo halo"
droid.dialogCreateAlert(judul,pesan)
droid.dialogSetPositiveButtonText("Lanjutkan")
droid.dialogSetNegativeButtonText("Tidak")
droid.dialogSetNeutralButtonText("Nanti")
droid.dialogShow()
respon.dialogGetResponse()
print("response")