# markitdown_test.py
from markitdown import MarkItDown

# Initialize the MarkItDown client
md = MarkItDown(docintel_endpoint="<document_intelligence_endpoint>")

# Convert a PDF file to text
result = md.convert("test.pdf")

# Print the extracted text
print(result.text_content)
