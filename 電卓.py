print("helloと入力して終了")
first = input("数を入力:")
enzansi = input("演算子を入力:")
second = input("数を入力:")
if first.isdigit() or second.isdigit():
    print("")
else:
    ("数字以外の入力を検出しました")
    exit()

if first == "hello" or enzansi == ("hello") or second == ("hello"):
    exit()
if enzansi == str("+"):
    print("結果は",int(first) + int(second),"です")
if enzansi == str("-"):
    print("結果は",int(first) - int(second),"です")
if enzansi == ("*"):
    print ("結果は",int(first) * int(second),"です")
if enzansi == ("/"):
    print("結果は",int(first) / int(second),"です")
