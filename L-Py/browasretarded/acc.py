def menu():
    print ("---- MENU ----")
    print ("[1.] Baca Soal")
    print ("[2.] Buat Soal")
    print ("[3.] Tambah Soal")
    print ("[4.] Keluar")
    print ("--------------")
    
def kembali():
    print("\n")
    input("Tekan Enter Untuk Kembali")
    
def bacaSoal():
    strSoal="soal.txt"
    bacaSoal=open(strSoal, "r")
    print(bacaSoal.read())
    bacaSoal.close()

def tambahSoal():
    strSoal="soal.txt"
    tambahSoal=open(strSoal, "a")
    tambahSoal.write("#\n") 
    tambahSoal.write(input("Masukkan Soal: ")+"\n")
    tambahSoal.write("A."+(input("Opsi A: "))+"\n")
    tambahSoal.write("B."+(input("Opsi B: "))+"\n")
    tambahSoal.write("C."+(input("Opsi C: "))+"\n")
    tambahSoal.write("D."+(input("Opsi D: "))+"\n")
    tambahSoal.write("E."+(input("Opsi E: "))+"\n")
    tambahSoal.write("*\n")
    tambahSoal.write(input(" Kunci Jawaban: ")+"\n")
    tambahSoal.write("##\n")
    
def buatSoal():
    strSoal="soal.txt"
    buatSoal=open(strSoal, "w")
    buatSoal.write("#\n") 
    buatSoal.write(input("Masukkan Soal: ")+"\n")
    buatSoal.write("A."+(input("Opsi A: "))+"\n")
    buatSoal.write("B."+(input("Opsi B: "))+"\n")
    buatSoal.write("C."+(input("Opsi C: "))+"\n")
    buatSoal.write("D."+(input("Opsi D: "))+"\n")
    buatSoal.write("E."+(input("Opsi E: "))+"\n")
    buatSoal.write("*\n")
    buatSoal.write(input(" Kunci Jawaban: ")+"\n")
    buatSoal.write("##\n")