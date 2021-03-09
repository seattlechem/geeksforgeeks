give me more instruction
        let me create an example for you and can you confirm if this is correct
        comfortable with abstract problem, trying undefined thing, using communitive and collaborative approach

        2d matrix equal size or not

        what could be in the matrix (integer, char, string, blank char)

        traverse and what would be output?

        where should start?
        just show the example instead of asking questions (go clockwise)

        [0][0]

        determine how to stop

        nature of R * C

        show example R *C (4 * 4)
        0
        edge case / limit (lower limit, upper limit that we should be considering)
        1 x 1, odd x odd, even x even,
        R >= 1; C >= 1

        expected output


        describe algorithm
        time
        space complexity

        example 1 [1, 2, 3, 4] -> 1, 2, 3, 4

        example 2 |1, 2|
                  |3, 4| --> 1, 2, 4, 3

        example 3 | 1, 2, 3, 4|
                  | 5, 6, 7, 8|
                  | 9, 10, 11, 12|
                  | 13, 14, 15, 16|

                  determine number of squares
                  size of square, where to turn


                  1, 2, 3, 4, 0
                  5, 6, 7, 8, 0
                  9, 10, 11, 12, 0
                  1, 1, 1, 1, 1

                  3 x 3, 4, 4 square, 3 x 4, 4 x 5

        take [0][0]
        check direction
        proceed to right
        take [0][1]
        check direction
        proceed to right
        take [0][2]
        check direction
        proceed to right
        take [0][3]
        check direction
        V proceed to down
        take [1][3]
        check direction
        proceed to down
        take [2][3]
        proceed to down
        take [3][3]
        check direction
        proceed to left
        take [3][2]
        check direction
        proceed to left
        take [3][1]
        check direction
        proceed to left
        take [3][0]
        check direction
        proceed to up
        take [2][0]
        check direction
        proceed to up
        take [1][0]
        check direction
        proceed to right
        take [1][1]
        check direction
        proceed to right
        take [1][2]
        check direction
        proceed to down
        take [2][3]
        check direction
        proceed to left
        take [2][1]
        check direction
        stop
        process and return output

        O (2 x m x n)
        O(R x C)



        left -> right, iterate 5 elements
        change to down and decrease col elements qty from 4 to 3
        down, iterate 3 elements
        change to right -> left and decrease row elements qty from 5 to 4
        right -> left, iterate 4 elements
        change to up direction & decrease col elements qty from 3 to 2
        up, iterate 2 elements
        change to left -> right and decrease row elements qty from 4 to 3
        left -> right iterate 3
        turn down & col qty = 1
        down iterate 1
        turn right left and row qty = 2
        right -> left iterate 2
        turn up and col qty = 0


        repeat until no 'elements' remain





        optimization observation
