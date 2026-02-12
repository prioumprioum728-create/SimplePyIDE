import sys
import os

def run_script(path):
try:
file = os.path.join(path, "main.py")
with open(file, "r", encoding="utf-8") as f:
code = f.read()

    output = []

    def fake_print(*args):
        output.append(" ".join(str(a) for a in args))

    exec(code, {"print": fake_print})

    return "\n".join(output)

except Exception as e:
    return "Python Error: " + str(e)
