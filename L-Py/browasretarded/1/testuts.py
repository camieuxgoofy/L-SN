import baca
import tambah
import androidhelper
droid = androidhelper.Android()

strFile = open("scripts3/1/soal.txt", "r")
teks = True

def ujian(teks):
    droid.dialogCreateAlert("Pesan", teks)
    droid.dialogSetPositiveButtonText("OK")
    droid.dialogShow()
    btn=droid.dialogGetResponse().result['which']

while teks: 
    teks = f.readline()
    soal = teks
    teks = f.readline()
    opt1 = teks
    teks = f.readline()
    opt2 = teks
    teks = f.readline()
    opt3 = teks
    teks = f.readline()
    opt4 = teks
    teks = f.readline()
    opt5 = teks
    teks = f.readline()
    kunci = teks
    
    droid.dialogCreateAlert(soal)
    droid.dialogSetItems([opt1,opt2,opt3,opt4,opt5])
    droid.dialogShow()
    jawab = droid.dialogGetResponse().result["item"]
    
    if jawab == 0:
        jawaban = "a\n"
    elif jawab == 1:
        jawaban = "b\n" 
    elif jawab == 2:
        jawaban = "c\n" 
    elif jawab == 3:
        jawaban = "d\n" 
    elif jawab == 4:
        jawaban = "e\n" 
    
    if jawaban == kunci:
        callAlert("Jawaban Anda Benar")
    else :
        callAlert("Jawaban Salah. Jawaban benar: %s" %kunci)