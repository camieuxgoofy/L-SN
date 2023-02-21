import menu
import read
import androidhelper
droid = androidhelper.Android()

file="scripts3/quiz/quiz.txt"
teks=open(file, "a")

def createquiz():
    teks.write("\n#\n")
    quiz=droid.dialogGetInput("\nMenambah quiz","ketik disini :")
    teks.write(quiz.result)
    droid.dialogShow()
    return
    
def ket():
    keta=droid.dialogGetInput("Keterangan A")
    ketb=droid.dialogGetInput("Keterangan B")
    ketc=droid.dialogGetInput("Keterangan C")
    ketd=droid.dialogGetInput("Keterangan D")
    kete=droid.dialogGetInput("Keterangan E")
    teks.write("\na. "+keta.result+"\n")
    teks.write("b. "+ketb.result+"\n")
    teks.write("c. "+ketc.result+"\n")
    teks.write("d. "+ketd.result+"\n")
    teks.write("e. "+kete.result+"\n")
    return
    
def ranswer():
    teks.write("*\n")
    rans=droid.dialogGetInput("Kunci Jawaban:")
    teks.write("\n"+rans.result)
    teks.write("\n##\n")
    return

def nextquiz():
    createquiz()
    ket()
    ranswer()
    add2()
    return

def add2():
    title = "Tambah Quiz?"
    droid.dialogCreateAlert(title)
    droid.dialogSetPositiveButtonText("Next")
    droid.dialogSetNegativeButtonText("Go to menu")
    droid.dialogShow()
    create = droid.dialogGetResponse().result
    
    if create['which']=="positive":
        nextquiz()
    elif create['which']=="negative":
        menu.menuquiz()
    else :
        exit()
        return