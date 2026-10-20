# java-pd7

Java classwork and activities, checked against the assignment descriptions in
Google Classroom. Each folder is a separate Java program.

## Run one lesson

Open the lesson folder, then run:

```sh
javac Main.java
java Main
```

Input exercises also contain the supplied `Input.java` helper. Keep it in the
same folder as `Main.java`. Compile each lesson separately because the programs
all define a class named `Main`.

## Assignment review

| Assignment folder | Result |
| --- | --- |
| `Lesson-03b-Classwork` | Replaced the starter greeting with a quote. |
| `Lesson 4 Classwork` | Added the missing String/char variables and displayed all 12 values. |
| `Lesson 5 Classwork ` | Added the four assigned remainder expressions; corrected the `6 % 2` comment to 0. |
| `Lesson 5:Activity - QUIZ Tomorrow` | Checked all three formula images, arithmetic, average and egg-basket bonus; existing calculations are correct. |
| `Lesson 6 Classwork` | Added the four assigned input exercises at the folder root; kept the discussion example. |
| `Lesson 7 Classwork` | Added the three assigned formulas after inspecting the Classroom images. |
| `Lesson-07-activity` | Checked all seven formula images, sine conversion and both quadratic roots; existing calculations are correct. |
| `Lesson 8 Classwork` | Added the assigned madlib, square-area and circle-area functions; kept the discussion example. |
| `Lesson 8 Activity (Quiz Tomorrow based on this activity)` | Checked printing, Fahrenheit conversion, sphere/cone volumes and distance; existing functions are correct. |
| `Lesson10_1 Classwork` | Added the missing discount-rate, honors and short-size functions. |
| `Lesson10_2 Classwork` | Added the four assigned functions; fixed the exclusive 60..70 temperature bounds in the discussion example. |
| `Lesson 10_3 Classwork (HW)` | Checked ticket/bean discount thresholds; prevented negative ticket totals. |
| `Lesson 10 Actvity` | Checked all five functions and their boundaries; existing functions are correct. |
| `Lesson 11 Classwork` | Moved methods outside `init()` so the assignment compiles; fixed reversed first/last names in the discussion. |
| `Lesson 12 Classwork` | Completed college-credit, counselor and image-extension functions. |
| `Lesson-12-Activity` | Completed all five string challenges and calls in `init()`. |

The standalone `Lesson-10-3DiscussionSolution` was also checked. Its rounded
grade-average behavior was preserved, and its unknown-level spelling corrected.

## Requirements clarified from Classroom

- Lesson 10-1 returns a discount **rate**: `0.10` or `0.0`.
- Lesson 10-2 accepts GPA **3.2 or higher**, uses **40..65 MPH inclusive** for
  fuel economy, and returns the **total after discount**. These requirements
  differ from parts of the posted sample solution; the assignment text controls.
- Lesson 10-2 ticket speeds below 60 return 0, as in the posted sample solution.
- Lesson 7 classwork uses radians for `sin(3x)`, since the formula has no degree
  symbol. The activity explicitly asks for degrees and converts them to radians.
- Lesson 12 classwork includes all 12 counselor mappings in its supplied
  `Problem.txt`. Extensions are case-insensitive and follow the final dot.
- Lesson 12 activity uses the exact card prefixes and labels in `Challenges.txt`.
  The month function expects `MM/DD/YYYY`; password length is 5..8 inclusive
  and all four excluded symbols (`^`, `*`, `(`, `)`) are checked.

## Verification

With a JDK and Python 3 installed, run from the repository root:

```sh
python3 tests/run_tests.py
```

The test runner compiles and runs all **23 independent programs**, checks
interactive output and formula results, and performs **240 function checks**.
It tests threshold values, each counselor in both class-code positions, all 12
months, each listed card/ZIP prefix, and invalid password symbols. Temporary
class files are written outside the source folders.
