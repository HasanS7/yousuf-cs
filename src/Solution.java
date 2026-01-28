import java.util.*;

class Solution {
    public boolean exist(char[][] board, String word) {
        // First find a starting point
        ArrayList<int[]> checkedStartingCoords = new ArrayList<>();
        ArrayList<ArrayList<String>> checkedNeighbors = setupCheckedNeighbors(board);
        Stack<String> currentPath = new Stack<>();
        Stack<String> moves = new Stack<>(); // Track move history so we can go back
        int[] startingCoords = findChar(board, word.charAt(0), checkedStartingCoords);
        if(startingCoords == null) return false; // First letter not found
        checkedStartingCoords.add(startingCoords);
        int index = 1;
        int m = startingCoords[0];
        int n = startingCoords[1];
        currentPath.add(m+","+n);
        while(index < word.length()){
            String neighbor = checkNeighbors(board, m, n, word.charAt(index), checkedNeighbors, currentPath);
            switch(neighbor){
                case "top":
                    checkedNeighbors = addCheckedNeighbor(m,n,checkedNeighbors,"top");
                    currentPath.add(m+","+n);
                    m--;
                    moves.add("top");
                    break;
                case "right":
                    checkedNeighbors = addCheckedNeighbor(m,n,checkedNeighbors,"right");
                    currentPath.add(m+","+n);
                    n++;
                    moves.add("right");
                    break;
                case "bottom":
                    checkedNeighbors = addCheckedNeighbor(m,n,checkedNeighbors,"bottom");
                    currentPath.add(m+","+n);
                    m++;
                    moves.add("bottom");
                    break;
                case "left":
                    checkedNeighbors = addCheckedNeighbor(m,n,checkedNeighbors,"left");
                    currentPath.add(m+","+n);
                    n--;
                    moves.add("left");
                    break;
                case "none":
                    // Go back
                    // If on first letter, find new starting point
                    if(index == 1){
                        startingCoords = findChar(board, word.charAt(0), checkedStartingCoords);
                        if(startingCoords == null) return false; // No new starting point found
                        m = startingCoords[0];
                        n = startingCoords[1];
                        checkedStartingCoords.add(startingCoords);
                        checkedNeighbors = setupCheckedNeighbors(board); // Clear checked neighbors
                        currentPath.clear(); // Add new starting point
                        currentPath.add(m+","+n);
                        continue;
                    }
                    // If past the first letter, go back to the previous letter
                    currentPath.pop();
                    String lastMove = moves.pop();
                    ArrayList<Integer> prevCoords = goBack(lastMove, m, n);
                    checkedNeighbors = clearCheckedNeighbors(m,n,checkedNeighbors); // Remove the checked neighbors for this coordinate because we are going back
                    m = prevCoords.get(0);
                    n = prevCoords.get(1);
                    index--;
                    continue;
            }
            index++;
        }
        return true;
    }

    public String checkNeighbors(char[][] board, int m, int n, char target, ArrayList<ArrayList<String>> checkedNeighbors, Stack<String> path){
        try {
            if(board[m-1][n] == target && !neighborIsChecked(m,n,"top",checkedNeighbors) && !path.contains((m-1)+","+n)) return "top";
        } catch(ArrayIndexOutOfBoundsException ignored){}
        try {
            if(board[m][n+1] == target && !neighborIsChecked(m,n,"right",checkedNeighbors) && !path.contains(m+","+(n+1))) return "right";
        } catch(ArrayIndexOutOfBoundsException ignored){}
        try {
            if(board[m+1][n] == target && !neighborIsChecked(m,n,"bottom",checkedNeighbors) && !path.contains((m+1)+","+n)) return "bottom";
        } catch(ArrayIndexOutOfBoundsException ignored){}
        try {
            if(board[m][n-1] == target && !neighborIsChecked(m,n,"left",checkedNeighbors) && !path.contains(m+","+(n-1))) return "left";
        } catch(ArrayIndexOutOfBoundsException ignored){}
        return "none";
    }

    public int[] findChar(char[][] board, char target, ArrayList<int[]> skip){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == target){ // Char found
                    boolean toSkip = false;
                    for(int[] pair : skip){ // Skip if coords are in skip[] array
                        if(Arrays.equals(pair, new int[]{i,j})){
                            toSkip = true;
                        }
                    }
                    if(!toSkip) return new int[]{i, j};
                }
            }
        }
        return null; // No starting point found
    }

    public ArrayList<Integer> goBack(String lastMove, int m, int n) {
        return switch (lastMove) {
            case "top" -> new ArrayList<>(Arrays.asList(m + 1, n));
            case "right" -> new ArrayList<>(Arrays.asList(m, n - 1));
            case "bottom" -> new ArrayList<>(Arrays.asList(m - 1, n));
            case "left" -> new ArrayList<>(Arrays.asList(m, n + 1));
            default -> null;
        };
    }

    public boolean neighborIsChecked(int m, int n, String check, ArrayList<ArrayList<String>> checkedNeighbors){
        String coords = m+","+n;
        for(ArrayList<String> list : checkedNeighbors){
            if(coords.equals(list.getFirst())){
                if(list.contains(check)) return true;
            }
        }
        return false;
    }

    public ArrayList<ArrayList<String>> setupCheckedNeighbors(char[][] board){
        ArrayList<ArrayList<String>> checkedNeighbors = new ArrayList<ArrayList<String>>();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                checkedNeighbors.add(new ArrayList<>(List.of(i + "," + j)));
            }
        }
        return checkedNeighbors;
    }

    public ArrayList<ArrayList<String>> addCheckedNeighbor(int m,int n, ArrayList<ArrayList<String>> checkedNeighbors, String neighbor){
        String coords = m+","+n;
        for(ArrayList<String> list : checkedNeighbors){
            if(list.getFirst().equals(coords)){
                list.add(neighbor);
            }
        }
        return checkedNeighbors;
    }

    public ArrayList<ArrayList<String>> clearCheckedNeighbors(int m,int n, ArrayList<ArrayList<String>> checkedNeighbors){
        String coords = m+","+n;
        for(ArrayList<String> list : checkedNeighbors){
            if(list.getFirst().equals(coords)){
                list.clear();
                list.add(coords);
            }
        }
        return checkedNeighbors;
    }
}