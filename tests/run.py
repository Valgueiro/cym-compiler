import os
import difflib
import subprocess
from colorama import Fore  #pip install colorama

INPUTS_FOLDER = "tests/inputs/"

def get_text_from_file(file):
    output = ""
    for line in open(file):
        output += line
    return output 

def run_test(input_file, expected_file):
    input = get_text_from_file(INPUTS_FOLDER + input_file)
    try:
        output = subprocess.Popen(["make"], stdin=input.encode())
        print(output)
    except:
        print(Fore.RED + "COMPILATION ERROR!")
        return False
    # print(output)
    # errors = unified_diff(output_strings, expected_strings)

def run_all():
    for input_file in os.listdir(INPUTS_FOLDER):
        output_file = input_file.replace('.c', '') + ".ll"
        run_test(input_file, output_file)


run_all()