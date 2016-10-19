//最普通的做法就是一个点一个点的比较 时间复杂度是O(N^3) 定位一个点是需要两层循环 再根据这个点定位另一个点需要再一重循环
//用heap O(klogN)

public class KthSmallestInMatrix{
    class Point {
        int num;
        int index_x;
        int index_y;
        Point(int num, int index_x, int index_y) {
            this.num = num;
            this.index_x = index_x;
            this.index_y = index_y;
        }
    }
    Comparator<Point> ComparePoint = new Comparator<Point>() {
        public int compare(Point p1, Point p2) {
            return p1.num - p2.num;
        }
    };
    public int kthSmallest(int[][] matrix, int k) {
        if(matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return Integer.MAX_VALUE;
        }
        Queue<Point> heap = new PriorityQueue<>(k, ComparePoint);
        
        for(int i=0; i<matrix.length&&i<k; i++) {
            heap.add(new Point(matrix[i][0], i, 0));
        }
        int result = 0;
        for(int i=0; i<k; i++) {
            Point p = heap.poll();
            result = p.num;
            if(heap.size()<k && p.index_y+1 < matrix[0].length) {
                heap.add(new Point(matrix[p.index_x][p.index_y+1], p.index_x, p.index_y+1));
            }
        }
        
        return result;
    }
}