import java.util.*;
public class pathCrossing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        System.out.println(isPathCrossing(path));
        sc.close();
    }

    public static boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        Set<String> set = new HashSet<String>();
        String visited = "0,0";
        set.add(visited);
        path = path.toUpperCase();
        for (char ch : path.toCharArray()) {
            if (ch == 'N')
                y++;
            else if (ch == 'W')
                x--;
            else if (ch == 'E')
                x++;
            else if (ch == 'S')
                y--;

            String pos = x + "," + y;
            if (set.contains(pos))
                return true;

            set.add(pos);
        }
        return false;
    }
}
