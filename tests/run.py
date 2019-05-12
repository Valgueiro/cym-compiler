import os
import difflib
import subprocess
from colorama import Fore, Style  # pip install colorama
import difflib

INPUTS_FOLDER = "tests/inputs/"
EXPECTED_FOLDER = "tests/outputs/"
OUTPUT_FILE = "out.ll"
START_COMMAND = "python3 antlr4-python3-runtime-4.7.2/src/main.py\n"


def check_diff(expected_path):
    test_name = expected_path.split("/")[-1:][0]
    expected = open(EXPECTED_FOLDER + expected_path).readlines()
    given = open(OUTPUT_FILE).readlines()

    diff = difflib.unified_diff(
        expected, given, fromfile='expected', tofile='received')

    error = ""
    for line in diff:
        error += line.strip() + '\n'

    if len(error) > 0:
        print(Fore.CYAN + test_name + Fore.RED +
              Style.BRIGHT + "        ERROR!")
        print(Fore.RED + error)
    else:
        print(Fore.CYAN + test_name + Fore.GREEN + Style.BRIGHT + "        OK")


def run_test(input_file, expected_file):
    try:
        output = subprocess.check_output(
            ["make"], stdin=open(INPUTS_FOLDER + input_file)).decode()

        check_diff(expected_file)
        out = output.split(START_COMMAND)[1].replace("None\n", "")
        if len(out) > 0:
            print(Fore.YELLOW + "Compilation Messages:")
            print(out)

    except subprocess.CalledProcessError as e:
        print(Fore.RED + "COMPILATION ERROR!")
        print("Error on test: " + input_file)
        print(Fore.YELLOW + e.output)


def run_tests():
    print(Fore.WHITE + "-------------------- Initiating tests -------------------")
    for input_file in os.listdir(INPUTS_FOLDER):
        expected_file = input_file.replace('.c', '') + ".ll"
        run_test(input_file, expected_file)

def generate_cases():
    print(Fore.WHITE + "-------------------- Genarating Expected Files -------------------")
    for input_file in os.listdir(INPUTS_FOLDER):
        generated_file = input_file.replace('.c', '') + ".ll"
        subprocess.check_output(
            ["make"], stdin=open(INPUTS_FOLDER + input_file)).decode()
        os.rename(INPUTS_FOLDER + generated_file, EXPECTED_FOLDER + generated_file)

run_tests()