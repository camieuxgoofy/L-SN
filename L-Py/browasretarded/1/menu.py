import androidhelper
import baca
import tambah

droid = androidhelper.Android()


def nav():
    droid.dialogCreateAlert("PILIHAN", " ")
    droid.dialogSetItems(["Membaca Soal","Menambah Soal","Ganti Soal","Exit"])
    droid.dialogShow()
    menu=droid.dialogGetResponse().result
    ygdipilih=menu['item']
    if ygdipilih==0:
        baca.buka()
    elif ygdipilih==1:
         testuts.ujian()
    elif ygdipilih==2:
         tambah.nambah()
    elif ygdipilih==3:
        edit.ganti()
    elif ygdipilih==4:
        exit()
    else:
        print("gak")
        droid.dialogShow()
    
