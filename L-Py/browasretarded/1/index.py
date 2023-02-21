#--coding:utf8;--
#qpy:console

print ("This is console module")
import androidhelper
import menu
import baca
import tambah
import testuts
droid=androidhelper.Android()

title = "Mohon Perhatikan !"
message = "Ujian Mobile Device Programming\n \nHarap Isi Data Diri Dengan Benar !\nSetelah Submit Ujian Tidak dapat Diulang...\n \nWaktu Ujian 30 Menit !"


droid.dialogCreateAlert(title,message)
droid.dialogSetNegativeButtonText("Kembali")
droid.dialogSetPositiveButtonText("Terima")
droid.dialogShow()
respon = droid.dialogGetResponse().result

if respon['which']=="positive":
   nimID=droid.dialogGetInput("Harap Masukan Nim", "NIM : ", " ").result
   menu.nav()
else :
    droid.dialogCreateAlert("WARNING", "Batal Ujian")
    droid.dialogSetPositiveButtonText("Terima")
    droid.dialogShow()