package day07.movieDemo;

public class MovieOperator {
//    在电影操作类中需要一个Movie数组
    private Movie[] movies;

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    public MovieOperator() {
    }

//  方法1 展示系统全部电影信息 printAllmovies
    public void printAllmovies(){
        System.out.println("---------以下为所有电影相关信息---------");
        for (Movie movie : movies) {
            System.out.println("电影的ID为："+movie.getId());
            System.out.println("电影的名字为："+movie.getName());
            System.out.println("电影的导演为："+movie.getDirector());
            System.out.println("电影的相关信息为："+movie.getInfo());
        }
    }
//  方法2 根据电影编号查询该电影的详细信息 searchMovieByid
    public void setMoviesById(int id){
        for (Movie movie : movies) {
            if (id == movie.getId()){
                System.out.println(movie.getInfo());
                break;
            }
        }
    }
}
