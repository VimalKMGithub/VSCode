import random
from tkinter import messagebox
from tkinter import *
print("Code by \"Vimal Kumar Mishra\"")


easy_questions = [
    "Who developed Python Programming Language?",
    "Which of the following functions takes A console Input in Python?",
    "Is Python case sensitive when dealing with identifiers?",
    "Which of The Following is must to Execute a Python Code?",
    "Which of the following is the correct extension of the Python file?",
    "The append Method adds value to the list at the?",
    "Which of the following character is used to give single-line comments in Python?",
    "Python supports the creation of anonymous functions at runtime, using a construct called __________.",
    "Which of the following keyword is used to create a function in Python?",
    "To Declare a Global variable in python we use the keyword?",
    "What does pip stand for python?",
    "Which of the following is the truncation division operator in Python?",
]
options_for_easy_questions = [
    ["Wick van Rossum", "Rasmus Lerdorf", "Guido van Rossum", "Niene Stom", ],
    ["get()", "input()", "gets()", "scan()", ],
    ["no", "yes", "machine dependent", "none of the mentioned", ],
    ["TURBO C", "Py Interpreter", "Notepad", "IDE", ],
    [".python", ".pl", ".py", ".p", ],
    ["custom location", "end", "center", "beginning", ],
    ["//", "#", "!", "/*", ],
    ["pi", "anonymous", "lamda", "none of the mentioned", ],
    ["function", "void", "fun", "def", ],
    ["all", "var", "let", "global", ],
    ["unlimited length", "private members",
        "Preferred Installer Program", "none of the mentioned", ],
    ["|", "//", "/", "%", ],
]
correct_answers_for_easy_questions = [2, 1, 0, 1, 2, 1, 1, 2, 3, 3, 2, 1]

medium_questions = [
    "Who developed Python Programming Language?",
    "Which of the following functions takes A console Input in Python?",
    "Is Python case sensitive when dealing with identifiers?",
    "Which of The Following is must to Execute a Python Code?",
    "Which of the following is the correct extension of the Python file?",
    "The append Method adds value to the list at the?",
    "Which of the following character is used to give single-line comments in Python?",
    "Python supports the creation of anonymous functions at runtime, using a construct called __________.",
    "Which of the following keyword is used to create a function in Python?",
    "To Declare a Global variable in python we use the keyword?",
    "What does pip stand for python?",
    "Which of the following is the truncation division operator in Python?",
]
options_for_medium_questions = [
    ["Wick van Rossum", "Rasmus Lerdorf", "Guido van Rossum", "Niene Stom", ],
    ["get()", "input()", "gets()", "scan()", ],
    ["no", "yes", "machine dependent", "none of the mentioned", ],
    ["TURBO C", "Py Interpreter", "Notepad", "IDE", ],
    [".python", ".pl", ".py", ".p", ],
    ["custom location", "end", "center", "beginning", ],
    ["//", "#", "!", "/*", ],
    ["pi", "anonymous", "lamda", "none of the mentioned", ],
    ["function", "void", "fun", "def", ],
    ["all", "var", "let", "global", ],
    ["unlimited length", "private members",
        "Preferred Installer Program", "none of the mentioned", ],
    ["|", "//", "/", "%", ],
]
correct_answers_for_medium_questions = [2, 1, 0, 1, 2, 1, 1, 2, 3, 3, 2, 1]

hard_questions = [
    "Who developed Python Programming Language?",
    "Which of the following functions takes A console Input in Python?",
    "Is Python case sensitive when dealing with identifiers?",
    "Which of The Following is must to Execute a Python Code?",
    "Which of the following is the correct extension of the Python file?",
    "The append Method adds value to the list at the?",
    "Which of the following character is used to give single-line comments in Python?",
    "Python supports the creation of anonymous functions at runtime, using a construct called __________.",
    "Which of the following keyword is used to create a function in Python?",
    "To Declare a Global variable in python we use the keyword?",
    "What does pip stand for python?",
    "Which of the following is the truncation division operator in Python?",
]
options_for_hard_questions = [
    ["Wick van Rossum", "Rasmus Lerdorf", "Guido van Rossum", "Niene Stom", ],
    ["get()", "input()", "gets()", "scan()", ],
    ["no", "yes", "machine dependent", "none of the mentioned", ],
    ["TURBO C", "Py Interpreter", "Notepad", "IDE", ],
    [".python", ".pl", ".py", ".p", ],
    ["custom location", "end", "center", "beginning", ],
    ["//", "#", "!", "/*", ],
    ["pi", "anonymous", "lamda", "none of the mentioned", ],
    ["function", "void", "fun", "def", ],
    ["all", "var", "let", "global", ],
    ["unlimited length", "private members",
        "Preferred Installer Program", "none of the mentioned", ],
    ["|", "//", "/", "%", ],
]
correct_answers_for_hard_questions = [2, 1, 0, 1, 2, 1, 1, 2, 3, 3, 2, 1]

user_answers = []
indexes = []


def gen():
    global indexes
    while (len(indexes) < 11):
        x = random.randint(0, 11)
        if x in indexes:
            continue
        else:
            indexes.append(x)


def startquiz_easy_mode():
    global lblQuestion, r1, r2, r3, r4, lblQuestion_number

    def showresult(score):
        lblQuestion.destroy()
        r1.destroy()
        r2.destroy()
        r3.destroy()
        r4.destroy()
        correct = int(score/5)
        wrong = int(11-correct)
        res = int(correct/11*100)
        labelimage = Label(
            root,
            background="#ffffff",
            border=0,
        )
        labelimage.pack(pady=(50, 30))
        labelresulttext = Label(
            root,
            font=("Consolas", 20),
            background="#ffffff",
        )
        labelresulttext.pack()
        if score >= 45:
            img = PhotoImage(file="great.png")
            labelimage.configure(image=img)
            labelimage.image = img
            labelresulttext.configure(text="Excellent")
        elif (score >= 30 and score < 45):
            img = PhotoImage(file="ok.png")
            labelimage.configure(image=img)
            labelimage.image = img
            labelresulttext.configure(text="Good")
        else:
            img = PhotoImage(file="bad.png")
            labelimage.configure(image=img)
            labelimage.image = img
            labelresulttext.configure(text="Work Hard")
        messagebox.showinfo(
            "Result", f"Correct = {correct}\nWrong = {wrong}\nScore = {score}\nResult = {res}%")

    def calc():
        global indexes, user_answers, correct_answers_for_easy_questions
        x = 0
        score = 0
        for i in indexes:
            if user_answers[x] == correct_answers_for_easy_questions[i]:
                score += 5
            x += 1
        showresult(score)

    global ques
    ques = 1

    def selected():
        global radiovar, user_answers
        global lblQuestion, r1, r2, r3, r4
        global ques
        global Next
        x = radiovar.get()
        user_answers.append(x)
        radiovar.set(-1)
        if ques < 11:
            lblQuestion_number['text'] = f"Question : {ques+1}"
            lblQuestion.config(text=easy_questions[indexes[ques]])
            r1['text'] = options_for_easy_questions[indexes[ques]][0]
            r2['text'] = options_for_easy_questions[indexes[ques]][1]
            r3['text'] = options_for_easy_questions[indexes[ques]][2]
            r4['text'] = options_for_easy_questions[indexes[ques]][3]
            ques += 1
        else:
            lblQuestion_number.destroy()
            Next.destroy()
            calc()

    lblQuestion_number = Label(
        root,
        text=f"Question : {ques}",
        font=("Consolas", 16),
        width=500,
        justify="center",
        wraplength=400,
        background="#ffffff",
    )
    lblQuestion_number.pack(pady=(100, 0))

    lblQuestion = Label(
        root,
        text=easy_questions[indexes[0]],
        font=("Consolas", 16),
        width=500,
        justify="center",
        wraplength=400,
        background="#ffffff",
    )
    lblQuestion.pack(pady=(0, 30))

    global radiovar
    radiovar = IntVar()
    radiovar.set(-1)

    r1 = Radiobutton(
        root,
        text=options_for_easy_questions[indexes[0]][0],
        font=("Times", 12),
        value=0,
        variable=radiovar,
        background="#ffffff",
    )
    r1.pack(pady=5)

    r2 = Radiobutton(
        root,
        text=options_for_easy_questions[indexes[0]][1],
        font=("Times", 12),
        value=1,
        variable=radiovar,
        background="#ffffff",
    )
    r2.pack(pady=5)

    r3 = Radiobutton(
        root,
        text=options_for_easy_questions[indexes[0]][2],
        font=("Times", 12),
        value=2,
        variable=radiovar,
        background="#ffffff",
    )
    r3.pack(pady=5)

    r4 = Radiobutton(
        root,
        text=options_for_easy_questions[indexes[0]][3],
        font=("Times", 12),
        value=3,
        variable=radiovar,
        background="#ffffff",
    )
    r4.pack(pady=5)
    global Next
    Next = Button(root, text="Next", bg="black",
                  fg="white", font="calibri 12", command=selected)
    Next.pack()


def startquiz_medium_mode():
    global lblQuestion, r1, r2, r3, r4, lblQuestion_number

    def showresult(score):
        lblQuestion.destroy()
        r1.destroy()
        r2.destroy()
        r3.destroy()
        r4.destroy()
        correct = int(score/5)
        wrong = int(11-correct)
        res = int(correct/11*100)
        labelimage = Label(
            root,
            background="#ffffff",
            border=0,
        )
        labelimage.pack(pady=(50, 30))
        labelresulttext = Label(
            root,
            font=("Consolas", 20),
            background="#ffffff",
        )
        labelresulttext.pack()
        if score >= 45:
            img = PhotoImage(file="great.png")
            labelimage.configure(image=img)
            labelimage.image = img
            labelresulttext.configure(text="Excellent")
        elif (score >= 30 and score < 45):
            img = PhotoImage(file="ok.png")
            labelimage.configure(image=img)
            labelimage.image = img
            labelresulttext.configure(text="Good")
        else:
            img = PhotoImage(file="bad.png")
            labelimage.configure(image=img)
            labelimage.image = img
            labelresulttext.configure(text="Work Hard")
        messagebox.showinfo(
            "Result", f"Correct = {correct}\nWrong = {wrong}\nScore = {score}\nResult = {res}%")

    def calc():
        global indexes, user_answers, correct_answers_for_medium_questions
        x = 0
        score = 0
        for i in indexes:
            if user_answers[x] == correct_answers_for_medium_questions[i]:
                score += 5
            x += 1
        showresult(score)

    global ques
    ques = 1

    def selected():
        global radiovar, user_answers
        global lblQuestion, r1, r2, r3, r4
        global ques
        global Next
        x = radiovar.get()
        user_answers.append(x)
        radiovar.set(-1)
        if ques < 11:
            lblQuestion_number['text'] = f"Question : {ques+1}"
            lblQuestion.config(text=medium_questions[indexes[ques]])
            r1['text'] = options_for_medium_questions[indexes[ques]][0]
            r2['text'] = options_for_medium_questions[indexes[ques]][1]
            r3['text'] = options_for_medium_questions[indexes[ques]][2]
            r4['text'] = options_for_medium_questions[indexes[ques]][3]
            ques += 1
        else:
            lblQuestion_number.destroy()
            Next.destroy()
            calc()

    lblQuestion_number = Label(
        root,
        text=f"Question : {ques}",
        font=("Consolas", 16),
        width=500,
        justify="center",
        wraplength=400,
        background="#ffffff",
    )
    lblQuestion_number.pack(pady=(100, 0))

    lblQuestion = Label(
        root,
        text=medium_questions[indexes[0]],
        font=("Consolas", 16),
        width=500,
        justify="center",
        wraplength=400,
        background="#ffffff",
    )
    lblQuestion.pack(pady=(0, 30))

    global radiovar
    radiovar = IntVar()
    radiovar.set(-1)

    r1 = Radiobutton(
        root,
        text=options_for_medium_questions[indexes[0]][0],
        font=("Times", 12),
        value=0,
        variable=radiovar,
        background="#ffffff",
    )
    r1.pack(pady=5)

    r2 = Radiobutton(
        root,
        text=options_for_medium_questions[indexes[0]][1],
        font=("Times", 12),
        value=1,
        variable=radiovar,
        background="#ffffff",
    )
    r2.pack(pady=5)

    r3 = Radiobutton(
        root,
        text=options_for_medium_questions[indexes[0]][2],
        font=("Times", 12),
        value=2,
        variable=radiovar,
        background="#ffffff",
    )
    r3.pack(pady=5)

    r4 = Radiobutton(
        root,
        text=options_for_medium_questions[indexes[0]][3],
        font=("Times", 12),
        value=3,
        variable=radiovar,
        background="#ffffff",
    )
    r4.pack(pady=5)
    global Next
    Next = Button(root, text="Next", bg="black",
                  fg="white", font="calibri 12", command=selected)
    Next.pack()


def startquiz_hard_mode():
    global lblQuestion, r1, r2, r3, r4, lblQuestion_number

    def showresult(score):
        lblQuestion.destroy()
        r1.destroy()
        r2.destroy()
        r3.destroy()
        r4.destroy()
        correct = int(score/5)
        wrong = int(11-correct)
        res = int(correct/11*100)
        labelimage = Label(
            root,
            background="#ffffff",
            border=0,
        )
        labelimage.pack(pady=(50, 30))
        labelresulttext = Label(
            root,
            font=("Consolas", 20),
            background="#ffffff",
        )
        labelresulttext.pack()
        if score >= 45:
            img = PhotoImage(file="great.png")
            labelimage.configure(image=img)
            labelimage.image = img
            labelresulttext.configure(text="Excellent")
        elif (score >= 30 and score < 45):
            img = PhotoImage(file="ok.png")
            labelimage.configure(image=img)
            labelimage.image = img
            labelresulttext.configure(text="Good")
        else:
            img = PhotoImage(file="bad.png")
            labelimage.configure(image=img)
            labelimage.image = img
            labelresulttext.configure(text="Work Hard")
        messagebox.showinfo(
            "Result", f"Correct = {correct}\nWrong = {wrong}\nScore = {score}\nResult = {res}%")

    def calc():
        global indexes, user_answers, correct_answers_for_hard_questions
        x = 0
        score = 0
        for i in indexes:
            if user_answers[x] == correct_answers_for_hard_questions[i]:
                score += 5
            x += 1
        showresult(score)

    global ques
    ques = 1

    def selected():
        global radiovar, user_answers
        global lblQuestion, r1, r2, r3, r4
        global ques
        global Next
        x = radiovar.get()
        user_answers.append(x)
        radiovar.set(-1)
        if ques < 11:
            lblQuestion_number['text'] = f"Question : {ques+1}"
            lblQuestion.config(text=hard_questions[indexes[ques]])
            r1['text'] = options_for_hard_questions[indexes[ques]][0]
            r2['text'] = options_for_hard_questions[indexes[ques]][1]
            r3['text'] = options_for_hard_questions[indexes[ques]][2]
            r4['text'] = options_for_hard_questions[indexes[ques]][3]
            ques += 1
        else:
            lblQuestion_number.destroy()
            Next.destroy()
            calc()

    lblQuestion_number = Label(
        root,
        text=f"Question : {ques}",
        font=("Consolas", 16),
        width=500,
        justify="center",
        wraplength=400,
        background="#ffffff",
    )
    lblQuestion_number.pack(pady=(100, 0))

    lblQuestion = Label(
        root,
        text=hard_questions[indexes[0]],
        font=("Consolas", 16),
        width=500,
        justify="center",
        wraplength=400,
        background="#ffffff",
    )
    lblQuestion.pack(pady=(0, 30))

    global radiovar
    radiovar = IntVar()
    radiovar.set(-1)

    r1 = Radiobutton(
        root,
        text=options_for_hard_questions[indexes[0]][0],
        font=("Times", 12),
        value=0,
        variable=radiovar,
        background="#ffffff",
    )
    r1.pack(pady=5)

    r2 = Radiobutton(
        root,
        text=options_for_hard_questions[indexes[0]][1],
        font=("Times", 12),
        value=1,
        variable=radiovar,
        background="#ffffff",
    )
    r2.pack(pady=5)

    r3 = Radiobutton(
        root,
        text=options_for_hard_questions[indexes[0]][2],
        font=("Times", 12),
        value=2,
        variable=radiovar,
        background="#ffffff",
    )
    r3.pack(pady=5)

    r4 = Radiobutton(
        root,
        text=options_for_hard_questions[indexes[0]][3],
        font=("Times", 12),
        value=3,
        variable=radiovar,
        background="#ffffff",
    )
    r4.pack(pady=5)
    global Next
    Next = Button(root, text="Next", bg="black",
                  fg="white", font="calibri 12", command=selected)
    Next.pack()


def startIspressed():
    labelimage.destroy()
    labeltext.destroy()
    lblInstruction.destroy()
    lblRules.destroy()
    btnStart.destroy()
    op1.destroy()
    op2.destroy()
    op3.destroy()
    gen()
    mode = choose_mode.get()
    if mode == 0:
        startquiz_easy_mode()
    elif mode == 1:
        startquiz_medium_mode()
    elif mode == 2:
        startquiz_hard_mode()
    else:
        messagebox.showinfo("Error", "Mode Not Selected")


root = Tk()
root.title("Quizstar")
root.geometry("800x625")
root.config(background="#ffffff")
root.resizable(0, 0)

quit_button = Button(root, text="Quit", command=root.destroy,
                     width=5, bg="black", fg="white", font=("ariel", 16, " bold"), relief=GROOVE)
quit_button.pack()

img1 = PhotoImage(file="transparentGradHat.png")
labelimage = Label(
    root,
    image=img1,
    background="#ffffff",
)
labelimage.pack(pady=(20, 0))

labeltext = Label(
    root,
    text="Quizstar",
    font=("Comic sans MS", 24, "bold"),
    background="#ffffff",
)
labeltext.pack(pady=(0, 25))

global choose_mode
choose_mode = IntVar()
choose_mode.set(-1)

op1 = Radiobutton(
    root,
    text="Easy",
    font=("Times", 12),
    value=0,
    variable=choose_mode,
    background="#ffffff",
)
op1.pack()

op2 = Radiobutton(
    root,
    text="Medium",
    font=("Times", 12),
    value=1,
    variable=choose_mode,
    background="#ffffff",
)
op2.pack()

op3 = Radiobutton(
    root,
    text="Hard",
    font=("Times", 12),
    value=2,
    variable=choose_mode,
    background="#ffffff",
)
op3.pack()

img2 = PhotoImage(file="Frame.png")
btnStart = Button(
    root,
    image=img2,
    relief=GROOVE,
    border=0,
    command=startIspressed,
)
btnStart.pack()

lblInstruction = Label(
    root,
    text="Read The Rules And\nClick Start Once You Are ready",
    background="#ffffff",
    font=("Consolas", 14),
    justify="center",
)
lblInstruction.pack(pady=(10, 80))

lblRules = Label(
    root,
    text="This quiz contains 11 questions\nYou can't go back to previous question",
    width=100,
    font=("Times", 14),
    background="#000000",
    foreground="#FACA2F",
)
lblRules.pack()

root.mainloop()
