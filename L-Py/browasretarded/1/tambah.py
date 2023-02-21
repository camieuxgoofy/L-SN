import baca

strFile="scripts3/1/soal.txt"
teks=open(strFile,"a")

def soal():
    teks.write("\n#\n")
    soal = input("Soal:")
    teks.write(soal)
    return

def pilihan():
    piliha = input("a. ")
    pilihb = input("b. ")
    pilihc = input("c. ")
    pilihd = input("d. ")
    pilihe = input("e. ")
    teks.write("\na. "+piliha+"\n")
    teks.write("b. "+pilihb+"\n")
    teks.write("c. "+pilihc+"\n")
    teks.write("d. "+pilihd+"\n")
    teks.write("e. "+pilihe+"\n")
    teks.write("*\n")
    teks.write("##\n")
    return

def nambah():
    soal()
    pilihan()
    addsoal()
    return

def addsoal():
    tanya = input("tambah/ganti?")
    if tanya == "tambah":
        nambah()
        teks.close()
    elif tanya == "ganti":
        edit.ganti()
        teks.close()
    else:
        teks.close()
        baca.buka()
    return