import androidhelper
droid = androidhelper.Android()

strSoal="scripts3/quiz/quiz.txt"
x = open(strSoal, "r")
text = True

def callAlert(text):
    droid.dialogCreateAlert("Pesan", text)
    droid.dialogSetPositiveButtonText("OK")
    droid.dialogShow()
    button=droid.dialogGetResponse().result['which']

while text:
    text = x.readline()
    tagar = text
    text = x.readline()
    tagar = text
    text = x.readline()
    soal = text
    text = x.readline()
    opsiA = text
    text = x.readline()
    opsiB = text
    text = x.readline()
    opsiC = text
    text = x.readline()
    opsiD = text
    text = x.readline()
    opsiE = text
    text = x.readline()
    bintang = text
    text = x.readline()
    kunci = text
    text = x.readline()
    tagar2 = text
    
    droid.dialogCreateAlert(soal)
    droid.dialogSetItems([opsiA,opsiB,opsiC,opsiD,opsiE])
    droid.dialogShow()
    jawab = droid.dialogGetResponse().result["item"]
    
    if jawab == 0:
        jawaban = "A\n"
    elif jawab == 1:
        jawaban = "B\n" 
    elif jawab == 2:
        jawaban = "C\n" 
    elif jawab == 3:
        jawaban = "D\n" 
    elif jawab == 4:
        jawaban = "E\n" 
    
    if jawaban == kunci:
        droid.makeToast("Correct")
    else :
        droid.makeToast("Aww Bad, %s is the correct answer" %kunci)