#!/usr/bin/env python3
"""Compile each independent lesson and check its results using only Python/Java."""
from pathlib import Path
import json
import math
import os
import shutil
import subprocess
import tempfile

ROOT = Path(__file__).resolve().parents[1]
JAVA_HOME = os.environ.get("JAVA_HOME")
JAVA = str(Path(JAVA_HOME) / "bin/java") if JAVA_HOME else shutil.which("java")
JAVAC = str(Path(JAVA_HOME) / "bin/javac") if JAVA_HOME else shutil.which("javac")

CASES = {}


def eq(folder, expression, expected):
    CASES.setdefault(folder, []).append(
        "check(" + expression + ", " + json.dumps(expected) + ");")


def near(folder, expression, expected):
    CASES.setdefault(folder, []).append(
        "near(" + expression + ", " + repr(expected) + ");")


folder = "Lesson10_1 Classwork"
for amount, expected in [(0, 0), (100, 0), (100.01, .1), (150, .1)]:
    near(folder, f"m.discount({amount})", expected)
for gpa, expected in [(89.99, "Work harder"), (90, "Honor Student"), (100, "Honor Student")]:
    eq(folder, f"m.honors({gpa})", expected)
for waist, expected in [(35.99, "Medium"), (36, "Large"), (40, "Large")]:
    eq(folder, f"m.shortSize({waist})", expected)

folder = "Lesson10_2 Classwork"
for gpa, sat, expected in [(3.2, 1449, "ACCEPTED"), (3.19, 1450, "ACCEPTED"),
                           (3.19, 1449, "Not Accepted"), (4, 1600, "ACCEPTED")]:
    eq(folder, f"m.collegeApp({gpa}, {sat})", expected)
for speed, expected in [(39.99, "Not Optimal"), (40, "Fuel Economy"),
                         (65, "Fuel Economy"), (65.01, "Not Optimal")]:
    eq(folder, f"m.ecoFuel({speed})", expected)
for speed, expected in [(59, 0), (60, 75), (70, 75), (70.5, 76), (90, 115)]:
    near(folder, f"m.speedFine({speed})", expected)
for args, expected in [("100,80,80", 234), ("100,75,75", 250), ("90,90,90", 270),
                        ("80,100,80", 234), ("80,80,100", 234)]:
    near(folder, f"m.discount({args})", expected)
for grade in [9, 10, 11, 12]:
    eq(folder, f"m.covidTest({grade})", "Test today" if grade in [9, 12] else "Not today")
for temp in [59.99, 60, 80, 80.01]:
    expected = "Nice Weather" if 60 <= temp <= 80 else "Not Nice Weather"
    eq(folder, f"m.weather1({temp})", expected)
    eq(folder, f"m.weather2({temp})", expected)
for temp, players in [(60, 9), (60.01, 9), (69.99, 18), (70, 18), (65, 10)]:
    eq(folder, f"m.playToday({temp}, {players})",
       "Game is on!" if 60 < temp < 70 and players in [9, 18] else "No Game today.")

folder = "Lesson 10_3 Classwork (HW)"
for tickets, expected in [(-1, 0), (0, 0), (1, 11), (8, 88), (9, 94.5), (16, 168), (17, 144.5)]:
    near(folder, f"m.groupSavings({tickets})", expected)
for total, cans, expected in [(99.99, 3, 0), (100, 3, 10), (200, 3, 10),
                               (150, 2, 0), (200.01, 4, 0), (200.01, 5, 25)]:
    near(folder, f"m.groceryDiscount({total}, {cans})", expected)
CASES[folder + "/ Lesson 10_3 Classwork Solutions"] = list(CASES[folder])

folder = "Lesson-10-3DiscussionSolution"
for level, expected in [(1, "COCKED PISTOL"), (2, "FAST PACE"), (3, "ROUND HOUSE"),
                         (4, "DOUBLE TAKE"), (5, "FADE OUT"), (10, "UNKNOWN LEVEL")]:
    eq(folder, f"m.DEFCON({level})", expected)
# The supplied discussion explicitly rounds the average before assigning a letter.
for grade, expected in [(90, "A"), (89.5, "A"), (89.49, "B"), (80, "B"),
                         (79.49, "C"), (65, "C"), (64.5, "C"), (64.49, "F")]:
    CASES[folder].append(f"check(m.letterGrade({grade}, {grade}, {grade}), '{expected}');")

folder = "Lesson 8 Classwork/Lesson8DiscussionSolution"
for meters in [0, 1, 2.5]:
    near(folder, f"m.meterToInches({meters})", meters * 39.37)
eq(folder, 'm.welcomeMsg("Alex")', "Welcome Alex to java programming class")

folder = "Lesson 10 Actvity"
for gpa, expected in [(90, 90), (95, 104.5), (80, 80)]:
    near(folder, f"m.gpa({gpa})", expected)
for grade, credits, expected in [(12, 44, True), (12, 43, False), (11, 44, False), (12, 45, True)]:
    eq(folder, f"m.isGraduating({grade}, {credits})", expected)
for bmi, expected in [(18.4, "Underweight"), (18.5, "Normal"), (24.9, "Normal"),
                       (25, "Overweight"), (39.9, "Overweight"), (40, "Obese")]:
    eq(folder, f"m.BMI({bmi} / 703.0, 1)", expected)
for weight, expected in [(10, 0), (10.01, 5), (15, 5), (15.01, 10),
                          (25, 10), (25.5, 10.01), (30, 10.1)]:
    near(folder, f"m.shippingCost({weight})", expected)
for frequency in [599.99, 600, 670, 670.01, 699.99, 700, 750, 750.01]:
    eq(folder, f"m.blueOrViolet({frequency})", 600 <= frequency <= 670 or 700 <= frequency <= 750)

folder = "Lesson 8 Classwork"
eq(folder, 'm.madlib("person", "loud", "runs")', "The loud person runs")
for value in [0, 3, 5.5]:
    near(folder, f"m.squareArea({value})", value ** 2)
    near(folder, f"m.circleArea({value})", math.pi * value ** 2)

folder = "Lesson 8 Activity (Quiz Tomorrow based on this activity)"
for f, c in [(32, 0), (212, 100), (-40, -40)]:
    near(folder, f"m.FtoC({f})", c)
for radius in [0, 1, 3]:
    near(folder, f"m.sphereVolume({radius})", 4 / 3 * math.pi * radius ** 3)
for radius, height in [(0, 4), (3, 0), (3, 4)]:
    near(folder, f"m.coneVolume({radius}, {height})", math.pi * radius ** 2 * height / 3)
for args, expected in [("0,0,3,4", 5), ("-2,-3,1,1", 5), ("1,2,1,2", 0)]:
    near(folder, f"m.distance({args})", expected)

folder = "Lesson 11 Classwork"
eq(folder, 'm.getUsername("joexyz@gmail.com")', "joexyz")
eq(folder, 'm.getUsername("alex.long@school.example")', "alex.long")
for text, expected in [("Happy Days", " DaysHappy"), ("abcde", "cdeab"), ("", ""), ("x", "x")]:
    eq(folder, "m.splitReverse(" + json.dumps(text) + ")", expected)
eq(folder, 'm.createUsername("John", "Doe", "123456789")', "JDoe6789")
eq(folder, 'm.createUsername("Alex", "Lee", "00001234")', "ALee1234")

folder = "Lesson 12 Classwork"
for code, expected in [("MKUFCE1", True), ("MKUFCM1", True), ("MKUFC1", False),
                        ("E12345", False), ("short", False), ("", False)]:
    eq(folder, "m.collegeCredit(" + json.dumps(code) + ")", expected)
for letter, name in dict(B="Berrouet", C="Chu", D="Dinn", E="Eyzengart", F="Flores",
                          G="Gibson", L="Shim Lee", M="Meltzer", P="Paccione",
                          S="Fiore", T="Tsai", Z="Zayes").items():
    for code in [letter + "10", "1" + letter + "0"]:
        eq(folder, "m.getCounsoler(" + json.dumps(code) + ")", name)
for code in ["1X0", "X10", "10D", "", "D"]:
    eq(folder, "m.getCounsoler(" + json.dumps(code) + ")", "Unknown")
for name, expected in [("a.jpg", "Joint Photographic Experts Group"),
                        ("a.JPEG", "Joint Photographic Experts Group"),
                        ("a.PnG", "Portable Network Graphics"),
                        ("a.GIF", "Graphics Interchange Format"),
                        ("a.PdF", "Portable Document Format"),
                        ("photo.v2.jpg", "Joint Photographic Experts Group"),
                        ("jpg", "Unknown file type"), ("a.", "Unknown file type"),
                        ("a.txt", "Unknown file type")]:
    eq(folder, "m.imageType(" + json.dumps(name) + ")", expected)

folder = "Lesson-12-Activity"
for prefix, expected in [("4", "Visa"), ("34", "America Express"), ("37", "America Express"),
                          ("36", "Diner Club"), ("51", "Mastercard"), ("55", "Mastercard"),
                          ("6011", "Discovery"), ("65", "Discovery"),
                          ("52", "Unknown"), ("6012", "Unknown"), ("9", "Unknown")]:
    eq(folder, "m.creditCardType(" + json.dumps(prefix + "000000000000") + ")", expected)
eq(folder, 'm.creditCardType("")', "Unknown")
for word, expected in [("pig", "igpay"), ("java", "avajay"), ("a", "aay"), ("", "")]:
    eq(folder, "m.pigLatin(" + json.dumps(word) + ")", expected)
for prefix, expected in [("100", "Manhattan"), ("101", "Manhattan"), ("102", "Manhattan"),
                          ("103", "Staten Island"), ("104", "Bronx"), ("112", "Brooklyn"),
                          ("113", "Queens"), ("114", "Queens"), ("111", "Queens"),
                          ("110", "Unknown")]:
    eq(folder, "m.nycLocate(" + json.dumps(prefix + "01") + ")", expected)
eq(folder, 'm.nycLocate("10")', "Unknown")
for number, month in enumerate(["January", "February", "March", "April", "May", "June",
                                 "July", "August", "September", "October", "November", "December"], 1):
    eq(folder, f'm.getMonth("{number:02}/21/2023")', month)
for date in ["00/21/2023", "13/21/2023", "07-21-2023", ""]:
    eq(folder, "m.getMonth(" + json.dumps(date) + ")", "Unknown")
for password, expected in [("abcd", False), ("abcde", True), ("Ab12!xyz", True),
                            ("abcdefghi", False), ("Ab1^2", False), ("Ab1*2", False),
                            ("Ab1(2", False), ("Ab1)2", False), ("Ab1#2", True)]:
    eq(folder, "m.validatePswd(" + json.dumps(password) + ")", expected)

HARNESS = """
class LessonChecks {
  static void check(Object actual, Object expected) {
    if (!java.util.Objects.equals(actual, expected))
      throw new AssertionError("Expected " + expected + ", got " + actual);
  }
  static void near(double actual, double expected) {
    if (!Double.isFinite(actual) || Math.abs(actual - expected) > 1e-8 * Math.max(1, Math.abs(expected)))
      throw new AssertionError("Expected " + expected + ", got " + actual);
  }
  public static void main(String[] args) {
    Main m = new Main();
    BODY
  }
}
"""

INPUTS = {
    "Lesson 6 Classwork": "17\n91.25\nAlex\ntrue\n",
    "Lesson 6 Classwork/Lesson-6-DiscussionSolutions": "17\n2.75\nAlex\nA\ntrue\n",
    "Lesson 7 Classwork": "2\n1\n0.5\n-3\n",
    "Lesson-07-activity": "2\n3\n2\n9\n7\n0\n0\n3\n4\n30\n2\n3\n1\n-3\n2\n",
}


def run(args, **kwargs):
    result = subprocess.run(args, capture_output=True, text=True, timeout=30, **kwargs)
    if result.returncode:
        raise AssertionError(" ".join(map(str, args)) + "\n" + result.stdout + result.stderr)
    return result.stdout


def verify_output(folder, lines):
    if folder == "Lesson-03b-Classwork":
        assert lines == ["Keep learning, keep growing."]
    elif folder == "Lesson 4 Classwork":
        assert len(lines) == 12
        assert "Last name: Long" in lines and "First initial: Y" in lines
        assert "Battery charging: true" in lines
    elif folder == "Lesson 5 Classwork ":
        assert lines[-4:] == ["2 % 5 = 2", "12 % 5 = 2", "2 * 3 % 5 = 1", "6 / 2 % 3 = 0"]
    elif folder == "Lesson 5:Activity - QUIZ Tomorrow":
        expected = [8, 255, 85, 2, -12.5, 20, 8, 4]
        assert len(lines) == len(expected)
        assert all(math.isclose(float(a), b) for a, b in zip(lines, expected))
    elif folder == "Lesson 6 Classwork":
        assert "Your age is: 17" in lines and "Your GPA is: 91.25" in lines
        assert "Your first name is: Alex" in lines and "Continue playing: true" in lines
    elif folder == "Lesson 7 Classwork":
        values = [float(line.split(" = ")[1]) for line in lines if " = " in line]
        assert len(values) == 3
        assert all(math.isclose(a, b) for a, b in zip(values, [8, 1 / math.sin(1.5), 10]))
    elif folder == "Lesson-07-activity":
        values = [line.split(" = ")[1] for line in lines if " = " in line]
        expected = [128, 32, 8192, 4, 5, .5, 16]
        assert len(values) == 8
        assert all(math.isclose(float(a), b) for a, b in zip(values[:7], expected))
        assert values[-1] == "2.0 or 1.0"
    elif folder == "Lesson 11 Classwork/DiscussionSolutions":
        assert "First name peter" in lines and "Last name pan" in lines


def main():
    if not JAVA or not JAVAC:
        raise SystemExit("Install a JDK and put java/javac on PATH, or set JAVA_HOME.")
    programs = sorted(p for p in ROOT.rglob("*.java") if p.name in ["Main.java", "solution Main.java"])
    checks = sum(len(cases) for cases in CASES.values())
    for source in programs:
        folder = source.parent.relative_to(ROOT).as_posix()
        with tempfile.TemporaryDirectory(prefix="java-lesson-") as temp:
            files = [str(source)] + [str(p) for p in source.parent.glob("Input.java")]
            cases = CASES.get(folder, []) if source.name == "Main.java" else []
            if cases:
                harness = Path(temp) / "LessonChecks.java"
                harness.write_text(HARNESS.replace("BODY", "\n    ".join(cases)), encoding="utf-8")
                files.append(str(harness))
            run([JAVAC, "-encoding", "UTF-8", "-d", temp] + files)
            output = run([JAVA, "-cp", temp, "Main"], input=INPUTS.get(folder, ""))
            if source.name == "Main.java":
                verify_output(folder, output.strip().splitlines())
            if cases:
                run([JAVA, "-cp", temp, "LessonChecks"])
            print("PASS", source.relative_to(ROOT), f"({len(cases)} function checks)")
    print(f"All {len(programs)} programs compiled and ran; {checks} function checks passed.")


if __name__ == "__main__":
    main()
