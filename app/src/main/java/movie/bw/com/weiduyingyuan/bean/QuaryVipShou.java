package movie.bw.com.weiduyingyuan.bean;

import java.util.List;

public class QuaryVipShou {

    /**
     * result : {"cinemasList":[],"headPic":"http://172.17.8.100/images/movie/head_pic/2019-03-12/20190312111946.jpg","integral":10,"movieList":[],"nickName":"寂然","phone":"15201282410","userSignStatus":2}
     * message : 查询成功
     * status : 0000
     */

    private ResultBean result;
    private String message;
    private String status;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class ResultBean {
        /**
         * cinemasList : []
         * headPic : http://172.17.8.100/images/movie/head_pic/2019-03-12/20190312111946.jpg
         * integral : 10
         * movieList : []
         * nickName : 寂然
         * phone : 15201282410
         * userSignStatus : 2
         */

        private String headPic;
        private int integral;
        private String nickName;
        private String phone;
        private int userSignStatus;
        private List<?> cinemasList;
        private List<?> movieList;

        public String getHeadPic() {
            return headPic;
        }

        public void setHeadPic(String headPic) {
            this.headPic = headPic;
        }

        public int getIntegral() {
            return integral;
        }

        public void setIntegral(int integral) {
            this.integral = integral;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public int getUserSignStatus() {
            return userSignStatus;
        }

        public void setUserSignStatus(int userSignStatus) {
            this.userSignStatus = userSignStatus;
        }

        public List<?> getCinemasList() {
            return cinemasList;
        }

        public void setCinemasList(List<?> cinemasList) {
            this.cinemasList = cinemasList;
        }

        public List<?> getMovieList() {
            return movieList;
        }

        public void setMovieList(List<?> movieList) {
            this.movieList = movieList;
        }
    }
}
