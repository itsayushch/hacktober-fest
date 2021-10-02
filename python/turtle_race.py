from turtle import Turtle, Screen, pencolor, width
import random
import turtle

screen = Screen()
screen.setup(width=500,height=400)
user_bet = screen.textinput(title="Make you bet", prompt="Which turtle will win the race. Enter the color")
color_list = ["yellow", "green", "red", "blue", "orange", "purple"]
turtle_list = []
is_race_on = True

def move(object):
    object.forward(200)

for i in range(6):
    new_turtle = Turtle("turtle")
    new_turtle.penup()
    new_turtle.color(color_list[i])
    new_turtle.goto(x=-230, y= -100 + i*40)
    turtle_list.append(new_turtle)

while is_race_on:


    for turtle in turtle_list:
        if turtle.xcor() > 230:
            is_race_on = False
            turtle_color = turtle.pencolor()
            if user_bet ==turtle_color :
                print(f"You Won bet!. {turtle_color} turtle won the race.")

            else:
                print(f"You lose bet!. {turtle_color} turtle won the race.")

        random_distance = random.randint(0,10)
        turtle.forward(random_distance)

screen.exitonclick()
