
while True:
    prime = int(input("判定したい素数を入力..."))
    warukazu = 2
    while True:
        if prime==warukazu:
            print("素数です")
            break
        else:
            if prime % warukazu == 0:
                print("素数じゃない")
                break
            else:
                warukazu+=1

            

    
