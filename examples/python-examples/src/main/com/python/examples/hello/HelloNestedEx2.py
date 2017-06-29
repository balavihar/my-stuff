class HelloNestedEx2:
    def print_msg(msg):
        # This is the outer enclosing function

        def printer(): # This is nested function
            # This is the nested function
            print(msg)

        return printer  # this got changed

        # Now let's try calling this function.
        # Output: Hello
    my_printer = print_msg("Hello")
    print("1")
    my_printer()
    print("2")
    # my_printer("Test Hello") # here it throughs error bcos printer() function has 0 args.

