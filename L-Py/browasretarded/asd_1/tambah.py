
import androidhelper
import baca
import menu
droid = androidhelper.Android()

file="soal.txt"
teks=open(file, "a")

def nambahsoal():
    teks.write("\n#\n")
    soal=droid.dialogGetInput("soal","masukan soal :")
    teks.write(soal.result)
    droid.dialogShow()
    return
    
def pilgan():
    piliha=droid.dialogGetInput("kunci jawaban","isi kunci jawaban bag A")
    pilihb=droid.dialogGetInput("kunci jawaban","isi kunci jawaban bag B")
    pilihc=droid.dialogGetInput("kunci jawaban","isi kunci jawaban bag C")
    pilihd=droid.dialogGetInput("kunci jawaban","isi kunci jawaban bag D")
    pilihe=droid.dialogGetInput("kunci jawaban","isi kunci jawaban bag E")
    teks.write("\na. "+piliha.result+"\n")
    teks.write("b. "+pilihb.result+"\n")
    teks.write("c. "+pilihc.result+"\n")
    teks.write("d. "+pilihd.result+"\n")
    teks.write("e. "+pilihe.result+"\n")
    return
    
def kunci():
    teks.write("*")
    kj = droid.dialogGetInput("kunci jawaban","Kunci Jawaban:")
    teks.write("\n"+kj.result)
    teks.write("\n##\n")
    return

def kedua():
    nambahsoal()
    pilgan()
    kunci()
    tambahlagi()
    return

def tambahlagi():
    tanya = droid.dialogGetInput("tanya", "lanjut atau tidak?").result
    
    if tanya=="lanjut":
        kedua()
    elif tanya=="tidak":
        teks.close()
        menu.nav()
    else:
        exit()
    return
