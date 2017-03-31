# Bundled Parsers Reference

This page references all parsers bundled with Autumn.


- [Matching Characters](chars.md)

    - [`char_pred`](                chars.md#char_pred)
    - [`char_any`](                 chars.md#char_any)
    - [`char_range`](               chars.md#char_range)
    - [`char_set (vararg Char)`](   chars.md#char_set_vararg-char)
    - [`char_set (String)`](        chars.md#char_set-string)
    - [`string`](                   chars.md#string)
    - [`word (String)`](            chars.md#word_String)
    - [`word (Parser)`](            chars.md#word_Parser)
    - [`alpha`](                    chars.md#alpha)
    - [`alphanum`](                 chars.md#alphanum)
    - [`digit`](                    chars.md#digit)
    - [`hex_digit`](                chars.md#hex_digit)
    - [`octal_digit`](              chars.md#octal_digit)
    - [`space_char`](               chars.md#space_char)
    - [`java_iden`](                chars.md#java_iden)
    - [`ascii_java_iden`](          chars.md#ascii_java_iden)
    
- [Matching Bracketed and Comma-Separated Content](brackets.md)

    - [`brackets`](                 brackets.md#brackets)
    - [`angles`](                   brackets.md#angles)    
    - [`squares`](                  brackets.md#squares)    
    - [`curlies`](                  brackets.md#curlies)
    - [`parens`](                   brackets.md#parens)
    - [`angles` (empty)](           brackets.md#angles-empty)
    - [`squares` (empty)](          brackets.md#squares-empty)
    - [`curlies` (empty)](          brackets.md#curlies-empty)
    - [`parens` (empty)](           brackets.md#parens-empty)
    - [`comma_list0`](              brackets.md#comma_list0)
    - [`comma_list1`](              brackets.md#comma_list1)
    - [`comma_list_term0`](         brackets.md#comma_list_term0)
    - [`comma_list_term1`](         brackets.md#comma_list_term1)
    
- [Matching Sequences and Optionals](sequential.md)
 
    - [`seq`](                      sequential.md#seq)
    - [`opt`](                      sequential.md#opt)
    - [`repeat0`](                  sequential.md#repeat0)
    - [`repeat1`](                  sequential.md#repeat1)
    - [`repeat`](                   sequential.md#repeat)
    - [`around0`](                  sequential.md#around0)
    - [`around1`](                  sequential.md#around1)
    - [`until0`](                   sequential.md#until0)
    - [`until1`](                   sequential.md#until1)
    
- [Choices](choice.md)
 
    - [`choice`](                   choice.md#choice)
    - [`Longest`](                  choice.md#Longest)
    - [`longest`](                  choice.md#longest)
    - [`LongestPure`](              choice.md#LongestPure)
    - [`longest_pure`](             choice.md#longest_pure)
    
- [Lookahead](lookahead.md)

    - [`ahead`](                    lookahead.md#ahead)
    - [`not`](                      lookahead.md#not)
    
- [Manipulating the Value Stack](stack.md)

    - [`affect (backlog)`](         affect.md#affect_backlog)
    - [`affect`](                   affect.md#affect)
    - [`build (backlog)`](          affect.md#build_backlog)
    - [`build`](                    affect.md#build)
    - [`build_str (value)`](        affect.md#build_str_value)
    - [`build_str`](                affect.md#build_str)
    - [`maybe`](                    affect.md#maybe)
    - [`as_bool`](                  affect.md#as_bool)
    - [`as_val`](                   affect.md#as_val)
    
- [Left Recursion](leftrec.md)

    - [`leftrec`](                  leftrec.md#leftrec)
    
- [Operators](operators.md)

    - [`PrecedenceLeft`](           operators.md#PrecedenceLeft)
    - [`PrecedenceLeft (fun)`](     operators.md#PrecedenceLeft_fun)
    - [`PrecedenceRight`](          operators.md#PrecedenceRight)
    - [`PrecedenceRight (fun)`](    operators.md#PrecedenceRight_fun)
    
- [Miscellaneous Parsers](misc.md)

    - [`transact`](                     misc.md#transact)
    - [`ignore_errors`](                misc.md#ignore_errors)
    - [`ignore_errors_if_successful`](  misc.md#ignore_errors_if_successful)
    - [`perform`](                      misc.md#perform)
    - [`contain`](                      misc.md#contain)
    - [`transact_contain`](             misc.md#transact_contain)
    - [`catch`](                        misc.md#catch)
    - [`catch_contain`](                misc.md#catch_contain)
    - [`log`](                          misc.md#log)