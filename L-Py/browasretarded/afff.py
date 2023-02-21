import androidhelper
droid = androidhelper.Android()




class Pertanyaan:
     def __init__(self, tanya, jawab):
          self.tanya = tanya
          self.jawab = jawab
class color:
    CYAN = '\033[96m'
    BLUE = '\033[94m'
    GREEN = '\033[92m'
    END = '\033[0m'
print(color.BLUE + '==========================================' + color.END)
print(color.CYAN + 'Jawablah pertanyaan berikut' + color.END)
pertanyaan_jawab = [
     color.GREEN + "\nNo 1. \nYang bukan merupakan aspek dalam konsep diri adalah?\na. Harga diri\nb. Diri ideal \nc. Self-identity \nd. Self-hatred \ne. Body image \nJawab: ",
     "\nNo 2. \nSoftware pada mobile yang digunakan untuk matakuliah Pak Gury? \na. QPython 3L \nb. NetBeans \nc. Notepad++ \nd. Sublime \ne. BIOS \nJawab: " + color.END ,
]

soal = [
     Pertanyaan(pertanyaan_jawab[0], "c"),
     Pertanyaan(pertanyaan_jawab[1], "a"),
]

def hasil(soal):
     score = 0
     for pertanyaan in soal:
          jawab = input(pertanyaan.tanya)
          if jawab == pertanyaan.jawab:
               score += 1
     print(color.BLUE + "Kamu mendapat", score, "jawaban dengan benar, dari", len(soal), color.END)

hasil(soal)