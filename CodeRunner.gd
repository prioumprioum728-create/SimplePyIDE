# Script to handle code running in the app

extends Node

func _ready():
    print("Code Runner initialized")

func run_code(script_text: String) -> void:
    # Simulates running Python code
    print("Running code:")
    print(script_text)

func clear_output():
    # Clears the output/terminal
    print("Clearing terminal/output")
