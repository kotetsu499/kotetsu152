import tkinter as tk
import threading
import math

int = 0
prime = 3
primes = 0

root = tk.Tk()
root.title("素数メーカー") 
root.geometry("200x110") 
label = tk.Label(root, text="Discord : kotetsu152") 
label.pack()

labelol = tk.Label(root)
labelol.pack()

def update_label():
    labelol.config(text="作られた素数の合計は: " + str(primes))
    root.after(100, update_label)  # 1秒ごとにラベルを更新

def prime_generator():
    global prime
    global primes
    warukazu = 3
    while int == 1:
        sqrt = math.sqrt(prime)
        if warukazu > sqrt:
            print(prime)
            prime += 2
            warukazu = 3
            primes += 1
        else:
            if prime % warukazu == 0:
                prime += 2
                warukazu = 3
            else:
                if prime - 1 > sqrt:
                    warukazu += 1

def start():
    global int
    int = 1
    threading.Thread(target=prime_generator).start()

def stop():
    global int
    int = 0

start = tk.Button(root, text="スタート", command=start)
stop = tk.Button(root, text="ストップ", command=stop)
start.pack()
stop.pack()

update_label()  # ラベルの更新を開始
root.mainloop()
