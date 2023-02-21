import androidhelper
import read
import add
import intro

droid = androidhelper.Android()

def menuquiz():
    droid.dialogCreateAlert("Menu")
    droid.dialogSetItems(["Add Quiz","Read Quiz","Questions","Exit"])
    droid.dialogShow()
    menu=droid.dialogGetResponse().result['item']
    if menu==0:
        add.nextquiz()
    elif menu==1:
         read.readquiz()
    elif menu==2:
        import reply
    elif menu==3:
        exit()
    else:
        print("Anda keluar")
        droid.dialogShow()