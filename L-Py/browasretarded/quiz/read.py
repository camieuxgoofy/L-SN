import menu
import androidhelper
droid = androidhelper.Android()

strFile = "scripts3/quiz/quiz.txt"
quiz = open(strFile,"r")

def readquiz():
    droid.dialogCreateAlert("quiz", quiz.read())
    droid.dialogSetPositiveButtonText("Kembali")
    droid.dialogShow()
    readcon = droid.dialogGetResponse().result
    
    if readcon['which']=="positive":
        menu.menuquiz()
    else :
        readquiz.close