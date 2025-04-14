public class Contest445ClosestPerson {
    private static int solution(int x, int y, int z){
        int diffOne = Math.abs(z - x);
        int diffTwo = Math.abs(z - y);
        
        while(diffOne != z && diffTwo != z){
            if(diffOne < z)
                diffOne++;
            else 
                diffOne = Math.abs(diffOne - z);
            
            if(diffTwo < z)
                diffTwo++;
            else
                diffTwo = Math.abs(diffTwo - z);
        }

        if(diffOne == diffTwo)
            return 0;
        
        else if(diffOne == diffTwo && x < z)
            return 1;
            
        else
            return 2;
    }
    
    public static void main(String[] args) {
        System.out.println(solution(2, 7, 4));    
    }
}
