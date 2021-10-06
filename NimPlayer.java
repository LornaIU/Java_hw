public class NimPlayer {
    String Player1;
    String Player2;
    int stoneBalance;
    int stars;
       
    public void enterName(String name) {
        Player1 = name;
        Player2 = name;
    }

    public void initialStone(int startStones) {
        stoneBalance = startStones;
    }

    public void removeStones(int stonesTaken) {
        int updatedBalance = stoneBalance - stonesTaken;
        stoneBalance = updatedBalance;
    }

    public void Player1Turn() {
        System.out.print(Player1 + "'s turn. Enter stones to remove : ");
    }

    public void Player2Turn() {
        System.out.print(Player2 + "'s turn. Enter stones to remove : ");
    }

    public void printStar(int star) {
        stars = star;
        stars = stoneBalance;
        for (int stars = 1; stars <= star; stars++) {
            System.out.print(" *");
        }
        System.out.println();
    }
    
}
