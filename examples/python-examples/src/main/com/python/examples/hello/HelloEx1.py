
class HelloEx1:
    def print_msg(msg):
        # This is the outer enclosing function

        def printer():
            # This is the nested function
            print(msg)

        printer()

    # We execute the function
    # Output: Hello
    print_msg("Hello")

#HelloEx1().print_msg("Test Hello")