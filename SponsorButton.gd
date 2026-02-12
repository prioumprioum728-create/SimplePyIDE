extends Node

# Simulate reading the sponsor button YAML
var sponsor_button = {
    "text": "Sponsor",
    "color": "#FF5722",
    "position": "bottom_right",
    "url": "https://www.your-sponsor-link.com"
}

func _ready():
    create_sponsor_button()

func create_sponsor_button():
    var btn = Button.new()
    btn.text = sponsor_button["text"]
    btn.modulate = Color(html_color(sponsor_button["color"]))
    
    # Position the button (bottom right)
    btn.anchor_right = 1
    btn.anchor_bottom = 1
    btn.margin_right = -20
    btn.margin_bottom = -20
    
    btn.connect("pressed", self, "_on_sponsor_pressed")
    add_child(btn)

func _on_sponsor_pressed():
    print("Sponsor button clicked! Open URL: ", sponsor_button["url"])

func html_color(hex: String) -> Color:
    return ColorN(hex)
