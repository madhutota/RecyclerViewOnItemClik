package bornbaby.com.recyclerviewonitemclik;

/**
 * Created by madhu on 28-Jan-18.
 */

public class MoviesModel {
    private String title;
    private String desc;
    private int imageSrc;
    private String gener;

    public MoviesModel(String title, String desc, String gener,int imageSrc) {
        this.title = title;
        this.desc = desc;
        this.gener = gener;
        this.imageSrc= imageSrc;
    }

   /* public MoviesModel(String title, String desc, String imageSrc) {
        this.title = title;
        this.desc = desc;
        this.imageSrc = imageSrc;
    }*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(int imageSrc) {
        this.imageSrc = imageSrc;
    }
}
