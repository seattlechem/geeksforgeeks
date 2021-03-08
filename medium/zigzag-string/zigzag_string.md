Given a string and number of rows 'n', print the string formed by concatenating 'n' rows when input string is written in row-wise Zig-zag fashion.

Questions
--------------------
- what is row-wise zig-zag pattern?
- is there specific way the inputs must come in? Should we demonstrate a Class with constructor/get/setters or should we demonstrate a function?

- what can go into a string (numbers, blanks, special chars, upper, lower)?

- string length = 0?
- what about negative integer? n = 0 ?
    1 <= n
- is there a maximum/limitation of the integer?
    n <= length of string

- any space or library restrictions or limitations?



Examples
--------------------

str="abcdefgh"    |   a c e g    | aceg | acegbdfh
n=2               |    b d f h   | bdfh |

str = "geeksforgeeks"  | g   s   g   s |
n = 3                  |  e k f r e k  |
                       |   e   o   e   |

str = "qrrc" | q r r c | qrrc | qrrc
n = 1

str = "qrrc"
n = 3

str = "rfkqyuqfjkxyz"
n = 2

str = "hello"  | h   o | ho | hoell
n = 3          |  e l  | el
               |   l   | l

str = "hello"  | h     | h | hello
n = 5          |  e    | e
               |   l   | l
               |    l  | l
               |     o | o

Describe algorithms
--------------------
Incrementally add chars to different buckets, moving in a pattern first -> last -> first
Then concatenate the contents of each bucket
Then concatenate all of the bucket results into final


initialize N number of buckets
set the first bucket as destination
initiailize a result bucket

for each char in the string,
  append the char to the destination bucket
  define the next destination bucket ????

for each bucket
  append all the bucket contents to a result bucket


Coding
--------------------

StringBuilder sb = new StringBuilder();
sb.append(char)
sb.toString()








Observations
--------------------
- Optimization(Shortcut) when the n = length of string or n = 1 return the original string
- Zig-zag pattern is advance to the next bucket from start until the end, then reverse to start
    0, 1, 2, ...., n-3, n-2, n-1, n-2, n-3, ..., 2, 1, 0
- zero indexed array, so last row is n-1
- 'n' represents buckets to receive next character
- buckets need to be flexible to add new chars and need to output the ordered chars as a string


- Use an array of StringBuilder to incrementally add chars
