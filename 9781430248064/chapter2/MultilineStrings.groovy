def name = "Jim"
def multiLineQuote = """
Hello, ${name}
This is a multiline string with double quotes
"""
println multiLineQuote
println multiLineQuote.class.name
def multiLineSingleQuote = '''
Hello, ${name}
This is a multiline string with single quotes
'''
println multiLineSingleQuote
println multiLineSingleQuote.class.name