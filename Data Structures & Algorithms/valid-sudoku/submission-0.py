class Solution:

    def checkRow(self, board:List[List[str]],row) -> bool:

        l = []

        for i in range(9):
            if board[row][i] in l and board[row][i]!='.':
                return False
            else:
                l.append(board[row][i])
        return True

    def checkCol(self, board:List[List[str]],col) -> bool:

        l = []

        for i in range(9):
            if board[i][col] in l and board[i][col]!='.':
                return False
            else:
                l.append(board[i][col])
        return True
    
    def checkDiag(self, board:List[List[str]],row,col) -> bool:

        l = []
        for i in range(row,row+3):
            for j in range(col,col+3):
                if board[i][j] in l and board[i][j]!='.':
                    return False
                else:
                    l.append(board[i][j])
        return True

    def isValidSudoku(self, board: List[List[str]]) -> bool:

        n = len(board)
        m = len(board[0])

        for i in range(n):
            if self.checkRow(board,i) == False :
                print(i)
                return False
            for j in range(m):
                if self.checkCol(board,j) == False:
                    print(i,j)
                    return False
                if (i,j) in [(0,0),(0,3),(0,6),(3,0),(3,3),(3,6),(6,0),(6,3),(6,6)]:
                    if self.checkDiag(board,i,j) == False:
                        print(i,j)
                        return False
        return True

        