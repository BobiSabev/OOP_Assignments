package pkg6_slidinggame;


import java.util.ArrayList;
import java.util.List;
import static pkg6_slidinggame.SlidingGame.randomGame;


/**
 * @author Borislav Sabev s4726863, Austin Atchley s1016930
 */
public class Main
{
    public static void main(String[] args) {
        int [] game = {1,2,9, 4,5,3, 7,8,6};

        //SlidingGame s = new SlidingGame (game);
        
        SlidingGame s = randomGame(3);
        System.out.println(s);
        

        Solver solver = new Solver(s);
        System.out.println(solver.solve());
        List<Configuration> path = solver.getPath();
        
        System.out.println("Found solution of length " + path.size());
        
        
        //for(Configuration p : path)
        //   System.out.println(p);
        /*
        TODO
            - still really slow !?! - HashSet - contains 68% of the time, rest for add
            - write View class - print the start state, then solve and present the whole path
                - Give user the choice between hard-coded, random, or entering himself (optional)
                - hard-code 1 solvable, 1 unsolvable
                - measure the time
                - (Optional) add parsing
            - store Manhattan dist for all configurations to ease computing
            - re-organize methods
            - add comments
            - clear unused imports
        */
    }
}
