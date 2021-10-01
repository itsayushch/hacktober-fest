import random
def game(comp,user):            #this function is used to compare the different conditions on the basis of user input and computer input
    if comp == user:
        return None
    elif comp == "s":
        if user == "w":
            return False
        elif  user == "g":
            return True
    elif comp == "w":
        if user == "s":
            return True
        elif user == "g":
            return False
    elif comp == "g":
        if user == "s":
            return False
        elif user == "w":
            return True
print("Computer's turn: Snake(1) Water(2) or Gun(3)")                           #the process shows the computer i/p selection
rand = random.randint(1,3)          #a random integer will be selected by function randint and s,w,g will be allocated to computer based on the integer value
if rand == 1:
    comp = "s"
elif rand == 2:
    comp = "w"
elif rand == 3:
    comp = "g"
user = input("Your Turn: Snake(s) Water(w) or Gun(g): ")        #here we are taking input from the user
print(f"Computer choose {comp}")            #this will print the input from computer side
print(f"You chose {user}")                  #this will print the user input
a = game(comp,user)                         #the final result for the game will be printed from here depending upon the truth values being returned
if a == None:
    print("It is a tie")
elif a == True:
    print("You have won")
elif a == False:
    print("You lose")
