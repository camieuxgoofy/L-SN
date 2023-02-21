#-*-coding:utf8;-*-
#qpy:console
import androidhelper 

droid = androidhelper.Android()

strFile="scripts3/1/soal.txt"
teks=open(strFile,"r")

def buka():
    droid.dialogCreateAlert ("soal", teks.read())
    droid.dialogShow()
    return
    