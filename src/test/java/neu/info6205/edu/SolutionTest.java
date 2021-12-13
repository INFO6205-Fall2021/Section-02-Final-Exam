package neu.info6205.edu;
import org.junit.Test;
import  org.junit.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        List<Integer> graph_from = new ArrayList<>();
        graph_from.add(1);
        graph_from.add(1);
        graph_from.add(2);
        graph_from.add(3);
        graph_from.add(7);

        List<Integer> graph_to = new ArrayList<>();
        graph_to.add(2);
        graph_to.add(3);
        graph_to.add(4);
        graph_to.add(5);
        graph_to.add(8);

        Assert.assertEquals(s.connectedSquareSum(10, graph_from, graph_to),32);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        List<Integer> graph_from = new ArrayList<>();
        graph_from.add(0);
        graph_from.add(1);
        graph_from.add(3);
        graph_from.add(4);
        graph_from.add(7);
        graph_from.add(8);
        List<Integer> graph_to = new ArrayList<>();
        graph_to.add(1);
        graph_to.add(2);
        graph_to.add(4);
        graph_to.add(5);
        graph_to.add(8);
        graph_to.add(9);
        Assert.assertEquals(s.connectedSquareSum(10, graph_from, graph_to),28);
    }
    @Test
    public void test3() {
        Solution s = new Solution();
        List<Integer> graph_from = new ArrayList<>();
        List<Integer> graph_to = new ArrayList<>();

        Assert.assertEquals(s.connectedSquareSum(1000, graph_from, graph_to),1000);
    }

    @Test
    public void test4(){
        Solution s = new Solution();

        Integer[] gf= {24,28,22,16,54,22,2,7,73,57,31,77,88,24,54,84,49,41,97,31,69,63,20,67,37,41,82,24,16,2};
        Integer[] gt = {3,33,83,73,4,60,56,87,5,38,88,85,29,1,58,74,85,62,15,63,97,70,69,5,29,58,62,11,96,88};
        List<Integer> graph_from = Arrays.asList(gf);
        List<Integer> graph_to = Arrays.asList(gt);
        Assert.assertEquals(s.connectedSquareSum(100, graph_from, graph_to),148);
    }


    @Test
    public void test5(){
        Solution s = new Solution();
        Integer[] gf= {81,35,497,176,96,134,27,5,326,439,398,286,443,134,372,273,498,397,5,83,347,393,393,53,39,352,112,342,116,213,60,110,469,63,45,470,210,238,127,38,276,188,444,78,75,317,307,98,345,356,497,287,94,130,175,101,14,361,165,166,225,345,232,433,225,288,159,176,483,125,326,260,331,336,140,171,405,126,77,325,453,67,311,150,152,465,171,53,60,463,107,233,135,279,128,23,352,126,299,454,351,406,434,104,311,277,37,480,408,463,365,284,192,179,93,214,199,77,453,455,210,42,238,249,460,4,94,292,12,466,405,271,227,187,60,343,368,473,441,193,108,379,207,177,39,19,305,39,208,278,38,463,236,456,237,259,10,103,75,299,104,190,376,411,111,452,232,328,21,68,283,262,434,222,11,143,101,320,2,202,135,171,355,327,278,33,358,226,112,56,299,394,139,285,452,134,298,389,121,90};
        Integer[] gt = {145,12,306,335,312,226,231,30,340,159,93,494,272,168,456,203,132,199,134,19,436,269,158,292,311,396,300,272,179,331,283,11,375,477,182,6,146,238,176,374,141,314,416,297,198,451,100,452,253,142,374,304,363,167,357,9,9,207,37,105,295,119,214,127,253,493,243,56,44,67,64,109,91,96,68,498,44,261,46,438,404,458,299,247,241,93,61,346,383,174,122,216,397,70,270,373,280,457,143,351,92,360,205,21,382,56,478,25,471,486,197,16,327,11,202,264,450,306,214,477,355,192,143,229,283,315,318,212,158,390,150,316,387,368,212,109,72,448,123,323,14,393,398,413,210,168,358,260,172,427,278,388,338,47,433,91,153,35,104,404,498,50,116,423,475,194,168,376,237,407,289,55,152,348,30,184,225,432,221,17,127,477,325,184,46,134,162,76,125,407,254,225,450,340,273,50,102,333,409,126};
        List<Integer> graph_from = Arrays.asList(gf);
        List<Integer> graph_to = Arrays.asList(gt);
        Assert.assertEquals(s.connectedSquareSum(500, graph_from, graph_to),1048);
    }
}
