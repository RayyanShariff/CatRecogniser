# Cat Recogniser

## Overview
Cat Recogniser is a simple Java application that interacts with users to gather information about their cats. It collects the number of cats, their names, hair types, and ages. It is part of the F27SA Software Development 1 course at Heriot-Watt University. This project demonstrates the application of fundamental programming concepts such as user input, data storage in arrays, conditional execution, and loops.

## Purpose
The program is designed to help cat owners who have difficulty recognizing their multiple cats. It allows users to input details about their cats and then helps identify specific cats based on given criteria.

## Features
- User input for multiple cats (name, hair type, age)
- Data storage using arrays
- Cat identification based on hair type and age criteria
- Continuous operation until user chooses to exit

## How to Run
1. Ensure you have Java installed on your system.
2. Clone this repository to your local machine.
3. Open the project in your preferred Java IDE (e.g., Eclipse).
4. Run the `CatRecogniser.java` file.

## Usage
1. Enter the number of cats you want to register.
2. For each cat, provide:
   - Name
   - Hair type (long/short)
   - Age
3. Choose whether you want to identify a cat.
4. If yes, enter the criteria (hair type and age category).
5. View the matching cats.
6. Repeat steps 3-5 until you're done.

## Example Interaction
```
Welcome to the Cat Recogniser!
How many cats do you have?
10
Please enter the name of cat #1:
Fluff
Does Fluff have 'long' or 'short' hair?
long
How old is Fluff?
12.5
...
Do you wish to identify a cat?
yes
Does it have 'long' or 'short' hair?
long
Is it 'old' or 'young'?
old
The following cats meet this criteria:
- Fluff, who is 12.5
- Greebo, who is 20
- Gertrude, who is 15
Do you wish to identify a cat?
no
Thanks for using Cat Recogniser! Goodbye.
```

## Development Notes
- This project was developed as coursework for the F27SA Software Development 1 course.
- The code follows Java naming conventions and includes appropriate comments.
- Array manipulation and loop structures are key components of this program.

## License
This project is submitted as coursework and is subject to university guidelines on academic integrity and code sharing.
