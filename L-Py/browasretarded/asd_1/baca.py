import menu
import androidhelper
droid = androidhelper.Android()

strFile="soal.txt"
teks=open(strFile,"r")

def lihat():
    droid.dialogCreateAlert("soal", teks.read())
    droid.dialogShow()
    teks.close()
    exit()
    return
        
