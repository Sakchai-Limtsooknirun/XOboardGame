package Lap04;

public class Bord_TTT {

    protected int[][] BordPosition = new int[3][3];
    private String TurnXO;
    private boolean endGame = false ;


    public void initPoint(int Point, int i, int j) {
        BordPosition[i][j] = Point;
    }

    public boolean isEndGame() {
        return endGame;
    }

    public String getTurnXO() {
        return TurnXO;
    }

    protected String CheckWhoWin(int XorO) {
        if (BordPosition[0][0] == XorO && BordPosition[0][1] == XorO && BordPosition[0][2] == XorO) {
            endGame = true ;
            if (XorO == 100) {
                return TurnXO = ("Circle, is WINNER!!");
            } else {
                return TurnXO = ("Cross, is WINNER!!");
            }
        } else if (BordPosition[1][0] == XorO && BordPosition[1][1] == XorO && BordPosition[1][2] == XorO) {
            endGame = true ;
            if (XorO == 100) {
                return TurnXO = ("Circle, is WINNER!!");
            } else {
                return TurnXO = ("Cross, is WINNER!!");
            }
        } else if (BordPosition[2][0] == XorO && BordPosition[2][1] == XorO && BordPosition[2][2] == XorO) {
            endGame = true ;
            if (XorO == 100) {
                return TurnXO = ("Circle, is WINNER!!");
            } else {
                return TurnXO = ("Cross, is WINNER!!");
            }
        } else if (BordPosition[0][0] == XorO && BordPosition[1][1] == XorO && BordPosition[2][2] == XorO) {
            endGame = true ;
            if (XorO == 100) {
                return TurnXO = ("Circle, is WINNER!!");
            } else {
                return TurnXO = ("Cross, is WINNER!!");
            }
        } else if (BordPosition[2][0] == XorO && BordPosition[1][1] == XorO && BordPosition[0][2] == XorO) {
            endGame = true ;
            if (XorO == 100) {
                return TurnXO = ("Circle, is WINNER!!");
            } else {
                return TurnXO = ("Cross, is WINNER!!");
            }
        } else if (BordPosition[0][1] == XorO && BordPosition[1][1] == XorO && BordPosition[2][1] == XorO) {
            endGame = true ;
            if (XorO == 100) {
                return TurnXO = ("Circle, is WINNER!!");
            } else {
                return TurnXO = ("Cross, is WINNER!!");
            }
        } else if (BordPosition[1][0] == XorO && BordPosition[1][1] == XorO && BordPosition[1][2] == XorO) {
            endGame = true ;
            if (XorO == 100) {
                return TurnXO = ("Circle, is WINNER!!");
            } else {
                return TurnXO = ("Cross, is WINNER!!");
            }


        } else if (BordPosition[0][0] == XorO && BordPosition[1][0] == XorO && BordPosition[2][0] == XorO) {
            endGame = true ;
            if (XorO == 100) {
                return TurnXO = ("Circle, is WINNER!!");
            } else {
                return TurnXO = ("Cross, is WINNER!!");
            }


        } else if (BordPosition[0][2] == XorO && BordPosition[1][2] == XorO && BordPosition[2][2] == XorO) {
            endGame = true ;
            if (XorO == 100) {
                return TurnXO = ("Circle, is WINNER!!");
            } else {
                return TurnXO = ("Cross, is WINNER!!");
            }
        } else {
            if (XorO == 100) {
                return TurnXO = "Turn Cross";
            } else {
                return TurnXO = "Turn Circle";
            }
        }


    }


}
