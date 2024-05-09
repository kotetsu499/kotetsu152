import math
while True:
    prime = input("判定したい素数を入力(数字以外で終了)...")
    if prime.isdigit():
        prime = int(prime)
        warukazu = 2
        max = math.sqrt(prime)
        while True:
            if warukazu>max:
                print("素数です")
                break
            else:
                if prime % warukazu == 0:
                    print("素数ではありません。少なくとも",warukazu,"で割り切れます")
                    break
                else:
                    warukazu+=1
    else:
        exit()
