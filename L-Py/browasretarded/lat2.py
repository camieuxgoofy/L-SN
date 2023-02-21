import androidhelper

droid=androidhelper.Android()

musik=int(droid.dialogGetInput("Jumlah Musik").result, base=10)
artist=int(droid.dialogGetInput("Jumlah Artist").result, base=10)

if musik<artist:
   print ("Artist lebih banyak")
   print ("Artist-nya kurang bahan")
elif musik>artist:
   print ("Musik lebih banyak")
else:
   print("Jumlah Sama")
   
print ("Selesai")