//package DAY5;

class LEETCODE1041 {
    public void addval(int[] arr, char dir){
        int i = 0;
        if(dir == 'N') arr[i+1] = arr[i+1] + 1;
        if(dir == 'S') arr[i+1] = arr[i+1] - 1;
        if(dir == 'E') arr[i] = arr[i] + 1;
        if(dir == 'W') arr[i] = arr[i] - 1;
    }

    public char turnLeft(char dir){
        if(dir == 'N') return 'W';
        if(dir == 'W') return 'S';
        if(dir == 'S') return 'E';
        return 'N';
    }

    public char turnRight(char dir){
        if(dir == 'N') return 'E';
        if(dir == 'W') return 'N';
        if(dir == 'S') return 'W';
        return 'S';
    }

    public boolean isRobotBounded(String inst) {
        char dir = 'N';
        int[] arr = {0,0};
        for(int i = 0; i < inst.length(); i++){
            if(inst.charAt(i) == 'G') addval(arr, dir);
            if(inst.charAt(i) == 'L') dir = turnLeft(dir);
            if(inst.charAt(i) == 'R') dir = turnRight(dir);
        }
        return ((arr[0] == 0 && arr[1] == 0) || dir != 'N');
    }

    public static void main(String[] args) {
        LEETCODE1041 sol = new LEETCODE1041();

        System.out.println(sol.isRobotBounded("GGLLGG")); 
        System.out.println(sol.isRobotBounded("GG"));     
        System.out.println(sol.isRobotBounded("GL"));     
    }
}